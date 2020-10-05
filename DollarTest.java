import org.junit.Test;
import static org.junit.Assert.*;

class DollarTest {
  
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
  }

}