import  java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Marks");
        int mrk = sc.nextInt();
        
        if (mrk > 90) {
            System.out.println("Grade: O");
        } else if (mrk > 80 && mrk<=90) {
            System.out.println("Grade: A*");
        } else if (mrk > 70 && mrk<=80) {
            System.out.println("Grade: A");
        } else if (mrk > 60 && mrk<=70) {
            System.out.println("Grade: B");
        } else if (mrk > 50 && mrk<=60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
