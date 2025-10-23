package creational.abstractfactory.java.products.transport;

public class Truck implements Transport {
  @Override
  public String deliver() {
    return "Delivering load in a truck";
  }
}
