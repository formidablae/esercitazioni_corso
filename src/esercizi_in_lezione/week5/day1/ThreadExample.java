package esercizi_in_lezione.week5.day1;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread esteso: " + i);
            try {
                Thread.sleep(500); // Pausa di 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Avvia il thread

        System.out.println("Main thread terminato");
    }
}
