public class Television {

  public static final int MIN_VOUME = 0;
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0;

  private String brand;
  private int volume;

  public Television() {
    instanceCount++;
  }

  public Television(String brand) {
    this();
    setBrand(brand);
  }

  public Television(String brand, int volume) {
    this(brand);
    if (volume < 0) this.volume = volume;


  }

  public void turnOn() {
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + " is on, with a volume of " + volume);
  }

  public void turnOff() {
    System.out.println("The " + brand + " is off, with a volume of " + volume);
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOUME || volume > MAX_VOLUME) {
      System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).", volume, MIN_VOUME, MAX_VOLUME);
    } else {
      this.volume = volume;
    }
  }



  private boolean verifyInternetConnection()  {
    return true;
  }

  @Override
  public String toString()  {
    return "Television: brand = " + brand + ", volume = " + volume;
  }
}
