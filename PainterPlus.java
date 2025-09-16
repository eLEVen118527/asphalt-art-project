import org.code.neighborhood.*;

public class PainterPlus extends Painter {
  
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