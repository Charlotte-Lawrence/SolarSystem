import java.util.ArrayList;
import java.util.Random;

public class Driver {
    public static void main (String[] args){
        
        ArrayList<SolarObject> solarObjects = new ArrayList<SolarObject>();

        Boolean animated;
        int height = 1180;
        int width = 1180;
        SolarSystem solarSystem = new SolarSystem(width, height);

        Stars stars = new Stars(solarSystem,200);
        
        Sun theSun = new Sun(10, 10, 100, "ORANGE",solarSystem);
        Planet mercury = new Planet(80, 0, 18, "YELLOW", solarSystem, 10, 10);
        Planet earth = new Planet(150, 0, 20, "BLUE",solarSystem, 10, 10);
        Moon earthsMoon = new Moon(20, 0, 10, "GRAY",solarSystem, 0, 0,earth);
        Planet venus = new Planet(120,0,15,"ORANGE",solarSystem,10, 10);
        Planet mars = new Planet(200, 0, 18, "RED", solarSystem, 10, 10);
        Planet jupiter = new Planet(400, 0, 50, "YELLOW", solarSystem, 0, 0);
        Moon jupiterMoon1 = new Moon(25, 0, 10, "GRAY", solarSystem, 0, 0, jupiter);
        Moon jupiterMoon2 = new Moon(30, 0, 8, "GRAY", solarSystem, 0, 0, jupiter);
        Planet saturn = new Planet(420, 0, 30, "ORANGE", solarSystem, 10, 10);
        Planet uranus = new Planet(450,0,28,"GREEN",solarSystem,10,10);
        Planet neptune = new Planet(500,0,25,"BLUE",solarSystem,10,10);
        AsteroidBelt b = new AsteroidBelt(250,250,100, 0, "GRAY", solarSystem, theSun);

        
        // Set velocities - I have tried to make the velocities somewhat similar to real life in comparison to eachother
        venus.setVelocity(-1.5);
        mercury.setVelocity(3);
        mars.setVelocity(0.8);
        jupiter.setVelocity(0.5);
        jupiterMoon1.setVelocity(2);
        saturn.setVelocity(0.3);
        uranus.setVelocity(0.2);
        neptune.setVelocity(0.1);
        b.setVelocity(0.5);

        animated = true;

        // Add all objects into solar objects, this makes it easier to draw and move each of the objects
        solarObjects.add(stars);
        solarObjects.add(venus);
        solarObjects.add(earth);
        solarObjects.add(earthsMoon);
        solarObjects.add(theSun);
        solarObjects.add(mercury);
        solarObjects.add(mars);
        solarObjects.add(jupiter);
        solarObjects.add(jupiterMoon1);
        solarObjects.add(jupiterMoon2);
        solarObjects.add(saturn);
        solarObjects.add(uranus);
        solarObjects.add(neptune);
        solarObjects.add(b);
        

        // Create a new listener for key presses, pass in solarSystem since it is a Jframe and pass in solarObjects ArrayList
        // so the events can be triggered to edit velocities of solar objects
        Listener l = new Listener(solarSystem, solarObjects);

        // When window shows, the inital angle of each solar object will be ranomised - this is just for visual aesthetics
        // Scaled down size of planets as preference
        for(SolarObject s: solarObjects){
            s.diameter = s.diameter/3;
            s.angle = new Random().nextInt(360);
        }

        // Move and draw all solar objects
        while(animated){
            for(SolarObject s: solarObjects){
                s.draw();
                s.move();
            }

            solarSystem.finishedDrawing();
        }
    }
}
