/**
 * Class to create a Moon
 */
public class Moon extends SolarObject{
    private double centreOfRotationDistance;
    private double centreOfRotationAngle;
    private Planet orbitPlanet;

    public Moon(double distance, double angle, double diameter, String colour, SolarSystem s, double centreOfRotationAngle,double centreOfRotationDistance, Planet orbitPlanet){
        super(distance, angle, diameter, colour, s);

        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.colour = colour;
        this.s = s;
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;
        this.orbitPlanet = orbitPlanet;  
        
        velocity = 5;
    
    }
    /**
     * Draw the moon using drawSolarObjectAbout
     */
    public void draw(){
        s.drawSolarObjectAbout(distance, angle, diameter, colour, centreOfRotationDistance, centreOfRotationAngle);
    }

    /**
     * Update the centreOfRotationDistance and centreOfRotationAngle using the given orbitPlanet.
     * Also updates the moons angle based on the velocity.
     */
    public void move(){
        this.centreOfRotationDistance = orbitPlanet.getDist();
        this.centreOfRotationAngle = orbitPlanet.getAngle();

        this.angle = this.angle + (1*velocity);
        
        
        if(this.angle == 360){
            this.angle = 0;
        }
    }
}
