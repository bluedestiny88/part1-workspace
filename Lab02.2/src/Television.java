public class Television {

  private String brand;
  private int volume;

  

  public void turnOn() {
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + "is on, with a volume of " + volume);
  }

  public void turnOff() {
    System.out.println("The " + brand + "is off, with a volume of " + volume);
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
    this.volume = volume;
  }

  private boolean verifyInternetConnection()  {
    return true;
  }

  @Override
  public String toString()  {
    return "Television: brand = " + brand + ", volume = " + volume;
  }
}
