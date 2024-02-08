/**
 * Class to create a solar object
 */
public class SolarObject {
    SolarSystem s;
    double distance;
    double angle;
    double diameter;
    String colour;
    double velocity;

    public SolarObject(double distance, double angle, double diameter, String colour, SolarSystem s){
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.colour = colour;
        this.s = s;
    }
    /*
     * Draws solarObject using drawSolarObject
     */
    public void draw(){
        s.drawSolarObject(distance, angle, diameter, colour);
    }
    public void move(){};
    /**
     * Returns the angle of the solar object
     * This is used for updating locations of other solar objects which might orbit this solar object
     * @return the angle of the solar object
     */
    public double getAngle(){
        return angle;
    }
    /**
     * Returns the distance of the solar object.
     * This is used for updating locations of other solar objects which might orbit this solar object
     * @return the distance of the solar object
     */
    public double getDist(){
        return distance;
    }
    /**
     * Set the velocity of the solar object
     * @param v
     */
    public void setVelocity(double v){
        this.velocity = v;
    }
    /**
     * Return the velocity of the solar object
     * @return
     */
    public double getVelocity(){
        return velocity;
    }
}
