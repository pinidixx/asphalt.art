import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {
  
  /* 
   * Paints the background of the neighborhood by zig-zagging
   *    from the top to bottom / left to right.
   * 
   */
  public void paintBackground(String color) {
    while (canMove("south")) {
      paintRow(color);
      turnToWest();
      paintRow(color);
      turnToEast();
    }
  }

  /* 
   * Paint a row of the neighborhood
   */
  public void paintRow(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
    paint(color);
  }

  /* 
   * Turn after each row to 
   * get zig-zag painted background
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      
      if (canMove()){
        move();
      }
      
      turnLeft();
    }
  }
  
  /* 
   *   Turn after each row to 
   *   get zig-zag painted background
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      
      if (canMove()){
        move();
      }
      
      turnRight();
    }
  }

  /* 
   * Resets the Painter object to the starting location
   */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }
  
  /* 
   * Moves the Painter to the bottom right corner
   * 
   */
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }
  
}