package creational.abstractfactory.java.factory;

import creational.abstractfactory.java.products.packaging.Crate;
import creational.abstractfactory.java.products.packaging.Packaging;
import creational.abstractfactory.java.products.transport.Ship;
import creational.abstractfactory.java.products.transport.Transport;

public class SeaLogisticsFactory implements LogisticsFactory {
  @Override
  public Transport createTransport() {
    return new Ship();
  }

  @Override
  public Packaging createPackaging() {
    return new Crate();
  }
}
