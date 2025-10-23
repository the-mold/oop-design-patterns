package creational.builder.java;

public class Main {
    public static void main(String[] args) {
        // Create a basic office computer
        Computer officeComputer = new Computer.ComputerBuilder("Intel i5", "8GB").build();
        System.out.println("Office Computer: " + officeComputer);

        // Create a high-end gaming computer
        Computer gamingComputer = new Computer.ComputerBuilder("AMD Ryzen 9", "32GB")
                .storage("2TB NVMe SSD")
                .gpu("NVIDIA RTX 4090")
                .powerSupply("1000W")
                .coolingSystem("Liquid Cooling")
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);

        // Create a mid-range workstation
        Computer workstation = new Computer.ComputerBuilder("Intel i7", "16GB")
                .storage("1TB SSD + 2TB HDD")
                .gpu("NVIDIA Quadro RTX A4000")
                .build();
        System.out.println("Workstation: " + workstation);
    }
}
