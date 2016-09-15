import java.util.List;
import java.util.ArrayList;

public class Hero {
  private String mName;
  private String mPower;
  private List<Property> mProperties;

  public Hero (String name, String power) {
    mName = name;
    mPower = power;
    addProperties();
  }

  public String getName() {
    return mName;
  }

  public String getPower() {
    return mPower;
  }

  public List<Property> getProperties() {
    return mProperties;
  }

  public void addProperties() {
    PropertyLib propertyLib = new PropertyLib();
    mProperties = propertyLib.getProperties();
  }
}
