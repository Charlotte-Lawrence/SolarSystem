public class Asteroid extends SolarObject {
    SolarSystem s;
    double centreOfRotationDistance;
    double centreOfRotationAngle;
    public Asteroid(double distance, double angle, double diameter, String colour, SolarSystem s, double centreOfRotationAngle,double centreOfRotationDistance){
        super(distance,angle,diameter,colour,s);

        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.colour = "GRAY";
        this.centreOfRotationAngle = centreOfRotationAngle;
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.s = s;

    }
    /**
     * Draw the asteroid using drawSolarObjectAbout
     */
    public void draw(){
        s.drawSolarObjectAbout(distance, angle, diameter, colour, centreOfRotationDistance, centreOfRotationAngle);
    }
    /**
     * Update the asteroids angle based on the velocity
     */
    public void move(){
        this.angle = this.angle + (1*velocity);
        
        if(this.angle == 360){
            this.angle = 0;
        }
    }

}
