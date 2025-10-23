package creational.factorymethod.java.creator;

import creational.factorymethod.java.transport.Transport;
import creational.factorymethod.java.transport.Truck;

public class RoadLogistics extends Logistics {
  @Override
  public Transport createTransport() {
    return new Truck();
  }
}
