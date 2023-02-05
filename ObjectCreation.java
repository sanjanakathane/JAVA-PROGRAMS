public class ObjectCreation {

    int a=19,b=20,add;
    void display(){
        add=a+b;
        System.out.println(add);
    }

    public static void main(String[] args) {
        ObjectCreation ab=new ObjectCreation();
        ab.display();
    }

}
