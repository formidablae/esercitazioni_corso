package esercizi_in_lezione.week8.day3.computer_builder;

public class ComputerV {
    private String CPU;
    private int RAM;
    private int storage;
    private boolean hasGPU;

    public ComputerV(String CPU, int RAM, int storage) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.hasGPU = false;
    }

    public ComputerV(String CPU, int RAM, int storage, boolean hasGPU) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.hasGPU = hasGPU;
    }
}
