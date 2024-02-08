import java.util.Random;
public class Stars extends SolarObject{
    int n;
    SolarObject[] starsArray;
    double minDistance = 100;
    double maxDistance = 1000;

    public Stars(SolarSystem s, int n){
        super(0, 0, 0, "WHITE", s);

        starsArray = new SolarObject[n];

        setLocations();
    }
    /**
     * Sets the locations and angles of all the stars randomly
     */
    public void setLocations(){
        for(int i = 0; i < starsArray.length; i++){
            starsArray[i] = new SolarObject(0, 0, 0, "WHITE", s);
        }
        for(SolarObject o : starsArray){
            o.distance = minDistance + new Random().nextDouble() * maxDistance;
            o.angle = 1 + new Random().nextDouble() * 360;
            o.diameter = 1 + new Random().nextDouble() * 0.1;
        }
    }
    /**
     * Draw each star by calling each of their draw methods
     */
    public void draw(){
        for(SolarObject s: starsArray){
            s.draw();
        }
    }
    
}
