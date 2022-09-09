public class TelevisionClient {

  public static void main(String[] args)  {

    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(125);
    tv1.setDisplay(DisplayType.PLASMA);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv2 = new Television("Sony");
    tv2.setVolume(20);
    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv3 = new Television("RCA", 10);
    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv4 = new Television("Samsung", -1);

    Television tv5 = new Television("Toshiba", 20, DisplayType.OLED);

    tv1.turnOn();
    tv1.turnOff();

    tv2.turnOn();
    tv2.turnOff();

    System.out.println(tv1.toString());
    System.out.println(tv2);
    System.out.println(tv3);



  }

}
