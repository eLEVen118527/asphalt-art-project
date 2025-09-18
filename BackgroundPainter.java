import org.code.neighborhood.*;
// this part creates the background in a lavender blush color and extends from PainterPlus.//
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
    
