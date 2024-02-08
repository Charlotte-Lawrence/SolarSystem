import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Listener extends JFrame implements KeyListener {
    
    JFrame frame;

    ArrayList<SolarObject> solarObjects = new ArrayList<SolarObject>();
    ArrayList<Double> velocities = new ArrayList<Double>();

    boolean animated = true;

    public Listener(SolarSystem s, ArrayList<SolarObject> s_Obj){
        this.frame = s;
        solarObjects = s_Obj;

        frame.addKeyListener(this);
        for(SolarObject solarOb : solarObjects){
            velocities.add(solarOb.getVelocity());
        }
    }

    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            
            if(animated == true){
                for(SolarObject s : solarObjects){
                    s.setVelocity(0);
                }
                animated = false;
            }
            else{
                int count = 0;
                for(SolarObject s : solarObjects){
                    s.setVelocity(velocities.get(count));
                    count++;
                }
                animated = true;
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            for(SolarObject s : solarObjects){
                s.setVelocity(s.getVelocity() / 2);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            for(SolarObject s : solarObjects){
                s.setVelocity(s.getVelocity() * 2);
            }
        }
    }
    public void keyTyped(KeyEvent e){

    }
    public void keyReleased(KeyEvent e){

    }
    
}
