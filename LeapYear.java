import java.time.Year;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int years=sc.nextInt();
        if(years%4==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not Leap Year");
        }
    }
}
