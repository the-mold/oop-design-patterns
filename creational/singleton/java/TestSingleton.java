package creational.singleton.java;

public class TestSingleton {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    singleton1.printValue();
    singleton2.printValue();
  }
}
