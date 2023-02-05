public class Thiskey {
      Thiskey(){
          System.out.println("My nationality is India indian");
      }
      Thiskey(int a){
          this();
          System.out.println("MY PINCODE IS "+a);
      }

    public static void main(String[] args) {
        Thiskey th=new Thiskey(441802);
    }
}