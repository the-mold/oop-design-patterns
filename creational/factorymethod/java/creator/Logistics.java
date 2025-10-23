package creational.factorymethod.java.creator;

import creational.factorymethod.java.transport.Transport;

public abstract class Logistics {
  public String planDelivery() {
    Transport t = createTransport();
    String str = "Planning delivery... " + t.deliver();
    System.out.println(str);
    return str;
  }

  public abstract Transport createTransport();
}
