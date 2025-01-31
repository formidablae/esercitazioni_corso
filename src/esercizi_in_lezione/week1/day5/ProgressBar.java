package esercizi_in_lezione.week1.day5;

public class ProgressBar {
    public static void main(String[] args) throws InterruptedException {
        int progress = 0;
        while (progress <= 100) {
            System.out.print("\rLoading: [");
            int barLength = progress / 5;
            int i = 0;
            while (i < barLength) {
                System.out.print("#");
                i++;
            }
            while (i < 20) {
                System.out.print("-");
                i++;
            }
            System.out.print("] " + progress + "%");
            Thread.sleep(200);
            progress += 5;
        }
        System.out.println("\nLoading Complete!");
    }
}
