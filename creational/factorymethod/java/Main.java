package creational.factorymethod.java;

import creational.factorymethod.java.creator.Logistics;
import creational.factorymethod.java.creator.RoadLogistics;
import creational.factorymethod.java.creator.SeaLogistics;

public class Main {
  private static Logistics logistics;

  public static void main(String[] args) {
    configure("Road");
    runBusinessLogic();

    System.out.println("------");

    configure("Sea");
    runBusinessLogic();
  }

  static void configure(String transportType) {
    if (transportType.equalsIgnoreCase("Road")) {
      logistics = new RoadLogistics();
    } else if (transportType.equalsIgnoreCase("Sea")) {
      logistics = new SeaLogistics();
    }
  }

  static void runBusinessLogic() {
    logistics.planDelivery();
  }
}
