public class AddAverageArray {
    public static void main(String[] args) {
        int[] numbers={30,80,40,50,20};
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];

        }
        System.out.println(sum);
        int aversge;
        aversge=sum/numbers.length;
        System.out.println("The Average of array is: "+aversge);
        int sub=sum-aversge;
        System.out.println(sub);
    }
}
