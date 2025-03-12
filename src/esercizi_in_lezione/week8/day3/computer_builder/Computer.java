package esercizi_in_lezione.week8.day3.computer_builder;

public class Computer {
    private String CPU;
    private int RAM;
    private int storage;
    private boolean hasGPU;

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGPU = builder.hasGPU;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + ", hasGPU=" + hasGPU + "]";
    }

    public static class ComputerBuilder {
        private String CPU;
        private int RAM;
        private int storage;
        private boolean hasGPU;

        public ComputerBuilder(String CPU, int RAM, int storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        public ComputerBuilder setHasGPU(boolean hasGPU) {
            this.hasGPU = hasGPU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
