import java.util.Random;

public class loadingBar {
    public void loadingBar() {
        Random random = new Random();
        int totalSteps = random.nextInt(29)+2;//random number from 1 to 30

        for (int i = 0; i <= totalSteps; i++) {
            // Create a loading bar by calculating percentage
            int progress = (int) ((i / (double) totalSteps) * 100);

            // Create the progress bar visual
            StringBuilder bar = new StringBuilder("[");
            for (int j = 0; j < totalSteps; j++) {
                if (j < i) {
                    bar.append("=");
                } else {
                    bar.append(" ");
                }
            }
            bar.append("] ");
            bar.append(progress).append("%");

            // Print the progress bar, overwriting the previous one
            System.out.print("\r" + bar);

            // Pause for a while to simulate loading time
            int sleepTime = random.nextInt(400) + 100;
            try {
                Thread.sleep(sleepTime);  // 100 milliseconds between updates
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
