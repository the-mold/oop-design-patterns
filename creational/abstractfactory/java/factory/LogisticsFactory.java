package creational.abstractfactory.java.factory;

import creational.abstractfactory.java.products.packaging.Packaging;
import creational.abstractfactory.java.products.transport.Transport;

public interface LogisticsFactory {
  Transport createTransport();
  Packaging createPackaging();
}
