package CodSoft;
import java.util.Random;
import java.util.Scanner;

public class Random_guess {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int random1 = random.nextInt(1, 100);

        for (int i = 0; i <= 3; i++){
            System.out.print("Guess your number -: ");
            int user = sc.nextInt();

            if(user < random1){
                System.out.println("too low");
            }

            else if (user > random1) {
                System.out.println("too high");
            }

            else {
                System.out.println("Correct Guess :) ");
                break;
            }
        }

        System.out.println("Computer number is -: " + random1);





    }
}
