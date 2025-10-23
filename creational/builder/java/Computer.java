package creational.builder.java;

public class Computer {

    // Computer components
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String gpu;
    private final String powerSupply;
    private final String coolingSystem;

    // Private constructor to be called by the builder
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.powerSupply = builder.powerSupply;
        this.coolingSystem = builder.coolingSystem;
    }

    @Override
    public String toString() {
        return "Computer [" +
                "CPU='" + cpu + '\'' +
                ", RAM='" + ram + '\'' +
                ", Storage='" + storage + '\'' +
                ", GPU='" + gpu + '\'' +
                ", PowerSupply='" + powerSupply + '\'' +
                ", CoolingSystem='" + coolingSystem + '\'' +
                ']';
    }

    // Static nested Builder class
    public static class ComputerBuilder {
        // Required parameters
        private final String cpu;
        private final String ram;

        // Optional parameters
        private String storage = "256GB SSD";
        private String gpu = "Integrated";
        private String powerSupply = "500W";
        private String coolingSystem = "Stock Cooler";

        // Builder constructor for the required parameters
        public ComputerBuilder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        // Builder methods for optional parameters (chainable)
        public ComputerBuilder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder powerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public ComputerBuilder coolingSystem(String coolingSystem) {
            this.coolingSystem = coolingSystem;
            return this;
        }

        // The final build method that returns the Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}
