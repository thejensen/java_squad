import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero testHero = new Hero("Zuul", "Finds biggest lot");
    assertEquals(true, testHero instanceof Hero);
  }

  @Test
  public void addProperty_addsPropertiesToArrayList_true() {
    Hero testHero = new Hero("Zuul", "Finds biggest lot");
    assertEquals(1000,testHero.getProperties().get(0).getLotSize());
  }

}
