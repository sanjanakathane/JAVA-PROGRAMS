import java.sql.SQLOutput;
import  java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("the nuber is Even");
        }else {
            System.out.println("The number is Odd");
        }

    }

}
