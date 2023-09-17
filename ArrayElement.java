import java.util.*;
public class ArrayElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n] ;
        System.out.println("Elements of given array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

