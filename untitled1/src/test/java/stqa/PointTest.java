package stqa;

import static stqa.Point.distance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
   @Test
   public void testDistance(){
    
    Point p1 = new Point();
    Point p2 = new Point();

    p1.x1 = -4;
    p1.y1 = 10;
    p2.x2 = 0;
    p2.y2 = 13;
    Assert.assertEquals((distance(p1,p2)),5);
   }

}
