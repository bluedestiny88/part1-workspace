public class TelevisionValidationTest {

  public static void main(String[] args) {

    Television tv = new Television();
    tv.setVolume(0);
    System.out.println(tv);

    tv.setVolume(100);
    System.out.println(tv);

    tv.setVolume(-1);
    tv.setVolume(101);
    System.out.println(tv);

  //  Television tv1 = new Television("Samsung", -1);

  tv.setBrand("Samsung");
  System.out.println(tv);

  tv.setBrand("LG");
  System.out.println(tv);

  tv.setBrand("Hisense");
  System.out.println("tv");

  }

}
