import org.junit.*;
import static org.junit.Assert.*;

public class PropertyTest {

  @Test
  public void Property_instantiatesCorrectly_true() {
    Property testProperty = new Property(1000, true, true, 2000, "Name");
    assertEquals(true, testProperty instanceof Property);
  }

  @Test
  public void all_returnsAllInstancesOfProperty_true() {
    Property firstProperty = new Property(1000, true, true, 2000, "Name");
    Property secondProperty = new Property(1000, true, true, 2000, "Name");
    assertEquals(true, Property.all().contains(firstProperty));
    assertEquals(true, Property.all().contains(secondProperty));
  }

}
