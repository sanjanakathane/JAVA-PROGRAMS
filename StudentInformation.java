import java.util.Scanner;
class studentinfo
{
    public static void main(String[] args)
    {
        String studentName, studentClass;
        char studentGrade;
        int rollNumber, marksSub1, marksSub2, marksSub3, marksSub4, marksSub5;
        double totalMarks, percentageMarks;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Students Name:");
        studentName=sc.nextLine();

        System.out.println("Enter Class:");
        studentClass=sc.nextLine();

        System.out.println("Enter Roll Number:");
        rollNumber=sc.nextInt();

        System.out.println("Enter Marks Of 5 Subjects");
        marksSub1=sc.nextInt();
        marksSub2=sc.nextInt();
        marksSub3=sc.nextInt();
        marksSub4=sc.nextInt();
        marksSub5=sc.nextInt();

        totalMarks=marksSub1+ marksSub2+ marksSub3+ marksSub4+ marksSub5;

        percentageMarks=(totalMarks/500.0)*100;

        if(percentageMarks>=90)
            studentGrade='A';
        else if ((percentageMarks >= 70) && (percentageMarks<90))
            studentGrade='B';
        else if ((percentageMarks >= 50) && (percentageMarks<70))
            studentGrade='C';
        else if ((percentageMarks >= 40) && (percentageMarks<50))
            studentGrade='D';
        else
            studentGrade='E';

        System.out.println("Student's Name: "+ studentName);
        System.out.println("Class: "+ studentClass);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Marks: "+marksSub1 + "," +marksSub2 + "," +marksSub3 + "," +marksSub4 + "," +marksSub5);
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Percentage Marks: "+percentageMarks);
        System.out.println("Grade: "+studentGrade);

        sc.close();
    }
}