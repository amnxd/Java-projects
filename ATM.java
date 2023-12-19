import java.util.Scanner;

public class ATM{

    private static int balance;

    private static void withdraw(int amount){
        balance = balance - amount;
        System.out.println("Amount withdrawn -: " + amount);
    }

    private static void deposit(int amount){
        balance = balance + amount;
        System.out.println("Amount added -: " + amount);
    }

    private static void check_balance(){
        System.out.println("\nCurrent Balance : " + balance);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n1. Withdraw \n2. Deposit \n3. Check Balance \n99. Exit");
            System.out.print("What you want to do -: ");
            int in = sc.nextInt();
            System.out.println("");

            if(in == 1){
                System.out.print("Amount to withdraw -: ");
                int wd = sc.nextInt();
                withdraw(wd);
            }

            else if(in == 2){
                System.out.print("Amount to deposit -: ");
                int wd = sc.nextInt();
                deposit(wd);
            }

            else if (in == 3) {
                check_balance();
            }

            else if (in == 99) {
                break;
            }

            else{
                System.out.println("Wrong input");
            }
        }
    }

}
