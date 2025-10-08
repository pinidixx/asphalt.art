import org.code.neighborhood.*;

 /*
   * Instructs the new painter to go to the start
   */

public class TreeBasePainter extends PainterPlus {
  public void goToStart() {
   
    turnRight();
    while(canMove()){
      move();
    }
    turnLeft();
      move();
      move();
      move();
      move(); 
      move();
      move();     
      
  }

  
  /*
   * Instructs the painter to begin painting the tree base
   */
  public void paintTreeBase() {
        setPaint(10000);
      paint("SaddleBrown");
      move();
    paint("brown");
      move();
      paint("SaddleBrown");
      move();
      paint("brown");
      move();
      
    turnLeft();
      move();
    turnLeft();
      move();
      paint("Chocolate");
      move();
      paint("brown");
      move();
      paint("Chocolate");
      move();
      paint("brown");
    turnRight();
      move();
      paint("brown");
    turnRight();
    move();
    paint("SaddleBrown");
    move();
    paint("brown");
    move();
    paint("Chocolate");
  turnLeft();
    move();
  turnLeft();
    paint("brown");
    move();
    paint("SaddleBrown");
    move();
    paint("brown");
    move();
    paint("Chocolate");
  turnRight();
    move();
    paint("brown");
  turnRight();
    move();
    paint("SaddleBrown");
    move();
    paint("brown");
    move();
    paint("Chocolate");
  turnLeft();
    move();
    paint("SaddleBrown");
  turnLeft();
    move();
    paint("Chocolate");
    move();
    paint("brown");
    move();
    paint("brown");
  turnRight();
    move();
    paint("SaddleBrown");
   turnRight();
    move();
    paint("brown");
    move();
    paint("Chocolate");
    move();
    paint("brown");  
  }

}
