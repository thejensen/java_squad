import java.util.List;
import java.util.ArrayList;

public class PropertyLib {
  private static List<Property> mProperties;

  public PropertyLib() {
    presetProperties();
  }

  private void presetProperties () {
    // here
    mProperties = new ArrayList<Property>();

    mProperties.add(new Property (
      1000,
      true,
      false,
      1500,
      "Garden Party"
    ));

    mProperties.add(new Property (
      1100,
      false,
      true,
      2000,
      "Smallville"
    ));

    mProperties.add(new Property (
      600,
      true,
      true,
      900,
      "Wayne Tower"
    ));

    mProperties.add(new Property (
      2000,
      false,
      false,
      1600,
      "Coral Gables"
    ));

    mProperties.add(new Property (
      750,
      false,
      true,
      1100,
      "Cleveland Meadows"
    ));
  }

  public static List<Property> getProperties() {
    return mProperties;
  }

}
