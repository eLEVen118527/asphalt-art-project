import org.code.neighborhood.*;
// establishes our painters for our background, PainterPlus, cookiePainter, and chipPainter.//
public class NeighborhoodRunner {
  public static void main(String[] args) {
    
backgroundPainter lila = new backgroundPainter();
lila.setPaint(1000);
lila.paintBackground("LavenderBlush");

cookiePainter billy = new cookiePainter();
billy.setPaint(1000);
billy.paintCookie("burlywood");

chipPainter kiwi = new chipPainter();
kiwi.setPaint(1000);
kiwi.paintChip("SaddleBrown");
  }
}