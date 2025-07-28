package module4;

public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread1: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread1 was interrupted.");
            }
        });

 
        thread1.start();

        try {
            // Main thread waits for thread1 to complete
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // After thread1 is done
        System.out.println("Main thread done.");
	}

}
