package esercizi_in_lezione.week8.day3.computer_builder;

public class ComputerBuilderExample {
    public static void main(String[] args) {
        ComputerV computerV = new ComputerV("Intel i7", 16, 512, true);
        Computer computer = new Computer.ComputerBuilder("Intel i7", 16, 512)
            .setHasGPU(true)
            .build();

        System.out.println(computer);
    }
}
