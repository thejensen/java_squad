import java.util.List;
import java.util.ArrayList;

public class Property {
  private int mLotSize;
  private boolean mFreeLaundry;
  private boolean mFreeParking;
  private int mRentPrice;
  private String mName;
  private static List<Property> instancesOfProperty = new ArrayList<Property>();

  public Property (int lotSize, boolean freeLaundry, boolean freeParking, int rentPrice, String name) {
    mLotSize = lotSize;
    mFreeLaundry = freeLaundry;
    mFreeParking = freeParking;
    mRentPrice = rentPrice;
    mName = name;
    instancesOfProperty.add(this);
  }

  public int getLotSize() {
    return mLotSize;
  }

  public boolean getFreeLaundry() {
    return mFreeLaundry;
  }

  public boolean getFreeParking() {
    return mFreeParking;
  }

  public int getRentPrice() {
    return mRentPrice;
  }

  public String getName() {
    return mName;
  }

  public static List<Property> all() {
    return instancesOfProperty;
  }
}
