package creational.abstractfactory.java.products.packaging;

public class Crate implements Packaging {
  @Override
  public String pack() {
    return "Packing with a crate";
  }
}
