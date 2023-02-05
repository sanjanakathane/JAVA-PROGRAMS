import  java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        //taking input from user
        Scanner sc=new Scanner(System.in);
        // Declaring letrals
        float number=10f;
        //Declaration variables
        int subject1=sc.nextInt();
        int subject2=sc.nextInt();
        int subject3=sc.nextInt();
        int cgpa=(subject1+subject2+subject3)/30;
        //Printing statement
        System.out.println(cgpa);
        System.out.println(number);
    }
}
