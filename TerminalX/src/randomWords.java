import java.util.Random;

public class randomWords {
    public void randomWords(){
        String[] tasks = {"Initializing modules", "Compiling data", "Connecting to server",
                "Authenticating user", "Loading assets", "Starting system...",
                "System process paused"};
        Random rand = new Random();
        int randomIndex = rand.nextInt(tasks.length);
        String task = tasks[randomIndex];
        System.out.println(task +" "+ rand.nextInt());
    }
}
