import org.code.neighborhood.*;



public class PolandPainter extends MuralPainter {


public void paintPoland(String color, int space){
  turnRight();
  move();
  move();
  move();
  move();
  turnLeft();
  while (canMove("south")) {
      setPaint(space);
      paintLine(color, space);
      turnToWest();
      paintLine(color, space);
      turnToEast();
    }
}










}