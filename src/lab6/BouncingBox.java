package lab6;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BouncingBox extends JComponent {

    private ArrayList<BouncingFigure> figures = new ArrayList<BouncingFigure>();

    public void add(BouncingFigure f) {
        figures.add(f);
    }
        
    public void paintComponent(Graphics g) {
        for (BouncingFigure f : figures) {
            f.draw(g); f.move();
            if(f.rightBorderCollision(getWidth())) {
            f.setTrajectory(180.0-f.getTrajectory());
            }
            else {
                if(f.leftBorderCollision()) {
                    f.setTrajectory(f.getTrajectory()-180.0);
                }
                else {
                        if(f.upperBorderCollision()){
                            f.setTrajectory(270.0+(90.0-f.getTrajectory()));
                        }
                        else {
                            if(f.lowerBorderCollision(getHeight())){
                            f.setTrajectory(90.0+(270.0-f.getTrajectory()));
                            }
                    
                    
                }
        }
            
            
            
            
            
            }

    }
}}
