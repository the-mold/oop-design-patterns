package creational.abstractfactory.java.products.packaging;

public class Box implements Packaging {
  @Override
  public String pack() {
    return "Packing with a box";
  }
}
