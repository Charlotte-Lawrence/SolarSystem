import java.util.Random;

public class AsteroidBelt extends SolarObject{
    Asteroid[] belt;
    Asteroid asteroid;
    int minDistance;
    int maxWidth;
    int defaultAngle;
    String colour;
    SolarSystem s;
    SolarObject orbit;

    public AsteroidBelt(int num, int minDistance, int maxWidth, int defaultAngle, String colour, SolarSystem s, SolarObject orbit){
        super(0, 0, 0, colour, s);
        this.belt = new Asteroid[num];

        this.minDistance = minDistance;
        this.maxWidth = maxWidth;
        this.colour = colour;
        this.s = s;
        this.orbit = orbit;
        
        createAsteroids();
    }
    /**
     * Add empty asteroids into array
     */
    public void createAsteroids(){
        for(int i=0; i<belt.length;i++){
            belt[i] = new Asteroid(0, 0, 0, this.colour, this.s, 0, 0);
        }

        setLocations();
    }
    /**
     * Set the locations of the asteroids randomly but based on the minimum distance given and a maximum width of the belt.
     */
    public void setLocations(){
        for(Asteroid a : belt){
            a.distance = minDistance + new Random().nextDouble() * maxWidth;
            a.angle = defaultAngle + new Random().nextDouble() * 360;
            a.diameter = 1 + new Random().nextDouble() * 5;
            a.setVelocity(0.3);
        }
    }
    /**
     * Draw all of the asteroids by calling each of their own draw methods
     */
    public void draw(){
        for(Asteroid a: belt){
            a.draw();
        }
    }
    /**
     * Move all of the asteroids by calling each of their own draw methods
    */
    public void move(){
        for(Asteroid a: belt){
            a.setVelocity(velocity);

            a.centreOfRotationDistance = orbit.getDist();
            a.centreOfRotationAngle = orbit.getAngle();

            a.move();
        }
    }
    /**
     * Set the velocity of the entire belt by setting each individual setVelocity methods
     * @param v
     */
    public void setVelocity(double v){
        for(Asteroid a : belt){
            a.setVelocity(v);
            this.velocity = v;
        }
    }
}
