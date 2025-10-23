package creational.abstractfactory.java;

import creational.abstractfactory.java.factory.LogisticsFactory;
import creational.abstractfactory.java.factory.RoadLogisticsFactory;
import creational.abstractfactory.java.factory.SeaLogisticsFactory;
import creational.abstractfactory.java.products.packaging.Packaging;
import creational.abstractfactory.java.products.transport.Transport;

public class Main {
  public static void main(String[] args) {
    LogisticsFactory roadLogisticsFactory = new RoadLogisticsFactory();
    Transport truck = roadLogisticsFactory.createTransport();
    Packaging box = roadLogisticsFactory.createPackaging();

    System.out.println("Road Logistics:");
    System.out.println(truck.deliver());
    System.out.println(box.pack());

    System.out.println("\n--------------------\n");

    LogisticsFactory seaLogisticsFactory = new SeaLogisticsFactory();
    Transport ship = seaLogisticsFactory.createTransport();
    Packaging crate = seaLogisticsFactory.createPackaging();

    System.out.println("Sea Logistics:");
    System.out.println(ship.deliver());
    System.out.println(crate.pack());
  }
}
