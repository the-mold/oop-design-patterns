package creational.abstractfactory.java.factory;

import creational.abstractfactory.java.products.packaging.Box;
import creational.abstractfactory.java.products.packaging.Packaging;
import creational.abstractfactory.java.products.transport.Transport;
import creational.abstractfactory.java.products.transport.Truck;

public class RoadLogisticsFactory implements LogisticsFactory {
  @Override
  public Transport createTransport() {
    return new Truck();
  }

  @Override
  public Packaging createPackaging() {
    return new Box();
  }
}
