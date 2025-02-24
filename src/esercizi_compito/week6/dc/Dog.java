package esercizi_compito.week6.dc;

public class Dog implements IAnimal {
    String nome;
    int eta;

    public Dog(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public void makeSound() {
        System.out.println("Verso del cane: bau");
    }

   @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dog dog = (Dog) obj;
        return eta == dog.eta && nome.equals(dog.nome);
    }

    @Override
    public String toString() {
        return "Cane: " + nome + ", Età: " + eta;
    }

    @Override
    public int hashCode() {
        return nome.hashCode() + eta;
    }
}
