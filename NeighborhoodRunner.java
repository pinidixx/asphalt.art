import org.code.neighborhood.*;

public class NeighborhoodRunner {
    public static void main(String []args) {
      
      //Creates a painter object called lily
      BackgroundPainter lily = new BackgroundPainter();
      lily.setPaint(10000);
      lily.paintBackground("LightBlue");          //Paints the background light blue
        
      //Creates a painter object called paul
      TreeBasePainter paul = new TreeBasePainter();
      paul.goToStart();            //Painter starting position
      paul.paintTreeBase();        //Painter starts to paint tree base
      
      //Creates a painter object called billy
      LeavesPainter billy = new LeavesPainter();
      billy.goToStart();           //Painter starting position
      billy.paintLeaves();         //Painter starts to paint tree leaves
      
    
      
    }
 } 

