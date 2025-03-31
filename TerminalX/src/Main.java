import java.lang.Math.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task Activating");
        // Define the total number of steps for the loading bar
        while (true) {
            Random random = new Random();
            int task = random.nextInt(3)+1;
            switch (task){
                case 1: loadingBar loadingBar = new loadingBar();
                        loadingBar.loadingBar();
                    System.out.println("Loading Complete");
                        break;
                case 2:
                    randomWords randomWords = new randomWords();
                    randomWords.randomWords();
                    break;
                case 3:
                    spinningBar spinningBar = new spinningBar();
                    spinningBar.spinningBar();
                    break;
                default:
                    System.out.println("Invalid task");
            }
        }
    }
}