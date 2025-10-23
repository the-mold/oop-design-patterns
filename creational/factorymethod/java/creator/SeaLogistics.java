package creational.factorymethod.java.creator;

import creational.factorymethod.java.transport.Transport;
import creational.factorymethod.java.transport.Ship;

public class SeaLogistics extends Logistics {
  @Override
  public Transport createTransport() {
    return new Ship();
  }
}
