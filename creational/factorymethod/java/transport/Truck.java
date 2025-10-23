package creational.factorymethod.java.transport;

public class Truck implements Transport {
  @Override
  public String deliver() {
    return "Delivering load in a truck";
  }
}
