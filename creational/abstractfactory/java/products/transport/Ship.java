package creational.abstractfactory.java.products.transport;

public class Ship implements Transport {
  @Override
  public String deliver() {
    return "Deliver payload with a ship";
  }
}
