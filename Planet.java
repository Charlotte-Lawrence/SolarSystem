/**
 * Class to create a Planet
 */
public class Planet extends SolarObject{
    SolarSystem s;
    private double centreOfRotationDistance;
    private double centreOfRotationAngle;

    public Planet(double distance, double angle, double diameter, String colour, SolarSystem s, double centreOfRotationAngle,double centreOfRotationDistance){
        super(distance,angle,diameter,colour,s);

        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.colour = colour;
        this.centreOfRotationAngle = centreOfRotationAngle;
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.s = s;

        velocity = 1;
    }
    /**
     * Draw the planet using drawSolarObjectAbout
     */
    public void draw(){
        s.drawSolarObjectAbout(distance, angle, diameter, colour, centreOfRotationDistance, centreOfRotationAngle);
    }
    /**
     * Update the planets angle based on the velocity
     */
    public void move(){
        this.angle = this.angle + (1*velocity);
        
        if(this.angle == 360){
            this.angle = 0;
        }
    }
}
