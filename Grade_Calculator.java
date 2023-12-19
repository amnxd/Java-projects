package CodSoft;

import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of subjects -: ");
        int sub = sc.nextInt();

        System.out.println("Max number is 100 by default");
        double total_obtained = 0;
        double max_total = sub * 100;

        for(int i = 1; i <= sub; i++){
            System.out.print("Marks in subject " + i + " -: ");
            total_obtained = total_obtained + sc.nextDouble();
        }

        System.out.println("Total marks obtained -: " + total_obtained + "/" + max_total);
        System.out.println("Total percentage -: " + total_obtained*100/max_total + "%");

    }
}
