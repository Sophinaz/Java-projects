import java.util.Scanner;
import java.util.Random;
public class Rockpaper{
    public static String take(){
        Scanner scan = new Scanner(System.in);
        String choice;
        while (true) {
            System.out.println("enter rock,paper or scissor: ");
            choice = scan.nextLine().toLowerCase();
            if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissor")) {

                break;

            }
        }
        return choice;
    }
    public static String compChoice() {

        int x = new Random().nextInt(2);
        String[] choice = {"rock", "paper", "scissor"};
        return  choice[x];
    }
    public static String compare(){
        String x = take();
        String y = compChoice();
        String p;
        if (x.equals("rock") && y.equals("scissor")){
            p = "you won";
        }
        else if (x.equals("scissor") && y.equals("rock")){
            p = "you lost";
        }
        else if (x.equals("rock") && y.equals("paper")){
            p = "you lost";
        }
        else if (x.equals("paper") && y.equals("rock")){
            p = "you won";
        }
        else if (x.equals("paper") && y.equals("scissor")){
            p = "you lost";
        }
        else if (x.equals("scissor") && y.equals("paper")){
            p = "you won";
        }
        else {
            p = "tie";
        }
        return p;
    }

}
