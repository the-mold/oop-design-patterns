package creational.singleton.java;

public final class Singleton {
  private static Singleton INSTANCE;
  public final String value;

  // initialize the class
  private Singleton() {
    this.value = "bla";
    System.out.println("Singleton created");
  }

  /**
   * Returns a Singleton instance
   */
  public static Singleton getInstance() {
    Singleton res = INSTANCE;
    if (res == null) {
      // enter synchronized block to create it.
      synchronized(Singleton.class) {
        // check if instance was already created
        res = INSTANCE;
        if (res == null) {
          INSTANCE = res = new Singleton();
        }
      }
    }
    return res;
  }

  public void printValue() {
    System.out.println("Hello from Singleton! hashCode: " + this.hashCode());
  } 
}
