import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a String!");
        String str = sc.nextLine();
        System.out.println("Your String is..."+ str);

        System.out.println("Please enter an integer");
        int inr = sc.nextInt();
        System.out.println("Your integer is..."+ inr);

        System.out.println("Please enter a float");
        float flt = sc.nextFloat();
        System.out.println("Your Float Number is..."+flt);
    } 
}