public class Doctor {
    int a,b;
    Doctor(){
        System.out.println("This is my clinic");
    }
    Doctor(int NumberOfPatients,int NumberOfInction){
        a=NumberOfPatients;
        b=NumberOfInction;
        System.out.println("There are "+NumberOfPatients+" patients in hospital");
        System.out.println("There are "+NumberOfInction+" patients in hospital");
    }

    public static void main(String[] args) {
        Doctor d=new Doctor();
        Doctor d1=new Doctor(10,10);
    }

}
