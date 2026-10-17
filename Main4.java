import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a Number");
        int num = sc.nextInt();

        if (num>0) {
            System.out.println("Number is positive");
        } else if (num == 0) {
            System.out.println("Number is neutral");
        } else {
            System.out.println("Number is negative");
        }
    }
}
