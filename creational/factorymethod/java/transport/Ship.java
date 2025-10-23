package creational.factorymethod.java.transport;

public class Ship implements Transport {
  @Override
  public String deliver() {
    return "Deliver payload with a ship";
  }
}
