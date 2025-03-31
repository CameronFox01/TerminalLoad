import java.util.Random;

public class spinningBar {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public void spinningBar() {
        Random rand = new Random();
        int totalSteps = rand.nextInt(9) + 2;
        String[] tasks = {
                "Initializing modules", "Compiling data", "Connecting to server",
                "Authenticating user", "Loading assets", "Starting system..."
        };

        for (int i = 0; i <= totalSteps; i++) {
            int progress = (int) ((i / (double) totalSteps) * 100);

            // Create the loading bar visual
            StringBuilder bar = new StringBuilder(GREEN + "[");
            for (int j = 0; j < totalSteps; j++) {
                if (j < i) {
                    bar.append("="); // Filled part of the bar
                } else {
                    bar.append(" "); // Empty part
                }
            }
            bar.append("] " + YELLOW + progress + "%" + RESET);

            // Display a task in a different color
            String task = CYAN + tasks[i % tasks.length] + RESET;

            // Print everything on the same line
            System.out.print("\r" + task + " " + bar.toString());

            // Random sleep time for variation
            try {
                Thread.sleep((int) (Math.random() * 400) + 100); // 100-500 ms delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Finish the loading process
        System.out.println("\n" + GREEN + "Loading complete!" + RESET);
    }
}
