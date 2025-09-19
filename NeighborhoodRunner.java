import org.code.neighborhood.*;

public class NeighborhoodRunner {
    public static void main(String []args) {
      
      //Creates a painter object called lily
      BackgroundPainter lily = new BackgroundPainter();
      lily.setPaint(1000);
      lily.paintBackground("LightBlue");
        
      //Painter starting position
      TreePainter paul = new TreePainter();
      paul.goToStart();
      paul.paintTreeBase();
      
      paul.paintLeaves();
      
    
      
    }
 } 