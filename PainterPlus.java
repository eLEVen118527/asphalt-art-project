import org.code.neighborhood.*;

public class PainterPlus extends Painter {
  // paints an enitre row in a burlywood color//
 public void paintRow(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
    paint(color);
  }
 public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  // paints a row of four in a burlywood color//
 public void paintFour(String color) {
    move(); {
   move();
      paint(color);
      move();
    paint(color);
      move();
      paint(color);
      move();
      paint (color);
  }
}
   public void paintSix(String color) {
    move(); {
   move();
     turnRight();
      move();
      turnRight();
      move();
      paint(color);
      move();
      paint (color);
      move();
      paint(color);
       move();
      paint (color);
      move();
      paint(color);
      move();
      paint(color);
      move();
  }
}
// paints a full column for the base of the cookie//
public void paintColumn(String color) {
    while (canMove()) {
      paint("burlywood");
      move();
      paint("burlywood");
    }
  }
  public void paintSix2(String color) {
    move(); {
      paint(color);
      move();
    paint(color);
      move();
      paint(color);
      move();
      paint(color);
       move();
      paint(color);
       move();
      paint(color);
  }
}
  public void paintFour2(String color) {
    move(); {
      turnRight();
      move();
      turnRight();
      move();
      move();
      paint(color);
      move();
    paint(color);
      move();
      paint(color);
      move();
      paint (color);
    }
  }
  // paints the first chip//
public void paintChip1(String color) {
turnRight();{
    move();
    move(); 
    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
      }
}
   // paints the second chip//
  public void paintChip2(String color) {
  turnRight();
  move();
  move();
  paint(color);
  turnLeft();
  move();
  turnRight();
  move();
  paint(color);
    }
   // paints the third chip//
  public void paintChip3 (String color){
turnRight();{
move();
move();
move();
paint(color);
turnLeft();
move();
paint(color);
turnLeft();
move();
paint(color);
  }
  }
   // paints the forth chip//
  public void paintChip4(String color){
turnRight();{
move();
turnRight();
move();
move();
move();
turnRight();
move();
paint(color);
move();
turnLeft();
move();
paint(color);
  }
  }
   // paints the fith chip//
public void paintChip5(String color) {
  turnRight();{
  move();
  move();
  move();
  paint(color);
  turnRight();
  move();
  paint(color);
  turnRight();
  move(); 
  paint(color);
}
}
   // paints the sixth chip//
  public void paintChip6 (String color) {
    turnLeft();{
    turnLeft();
    move();
    move();
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
}
}
}