import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        int itr = sc.nextInt();
        
        if (itr > 10) {
            System.out.println("Number > 10");
        } else {
            System.out.println("Number < 10");
        }
        sc.close();
    }
}
