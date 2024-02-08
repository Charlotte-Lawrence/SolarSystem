/**
 * Class to create a Sun
 */
public class Sun extends SolarObject{
 
    public Sun(double distance, double angle, double diameter, String colour, SolarSystem s){
        super(distance, angle, diameter, colour,s);

        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.colour = colour;
        this.s = s;
    }
}
