import org.code.neighborhood.*;

public class backgroundPainter extends PainterPlus {
  
   public void turnWest() {
    if (isFacingEast()) {
      turnRight();
      
      if (canMove()){
        move();
      }
      
      turnRight();
    }
  }
 

 public void paintBackground(String color) {
    while (canMove("south")) {
      paintRow(color);
      turnWest();
      paintRow(color);
      turnEast();
    }
 }
 public void turnEast() {
    if (isFacingWest()) {
      turnLeft();
      
      if (canMove()){
        move();
      }
      
      turnLeft();
    }
  }
}