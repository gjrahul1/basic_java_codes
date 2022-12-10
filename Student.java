import java.util.*;
public class Student
{
    //Demonstrating  creation of java classes,objects,contructors,declaration and initilization of variables.
    //Written by G.J.Rahul,author of www.amcseminars.in
    String branch,name,usn;
    long phone;
    void insertStudent(String reg,String nm,String br,long ph)
    {
        usn=reg;
        name=nm;
        branch=br;
        phone=ph;
    }
    void displayStudent()
    {
        System.out.println("***************");
        System.out.println("USN="+usn);
        System.out.println("Name="+name);
        System.out.println("Branch="+branch);
        System.out.println("Phone="+phone);
        System.out.println("***************");
    }
    public static void main(String args[])
    {
        System.out.println("Enter the number of students");
        Student st[]=new Student[100];
        Scanner ip = new Scanner(System.in);
        int n=ip.nextInt();
        for(int i=0; i<n; i++)
            st[i]=new Student();
        for(int j=0; j<n; j++)
        {
            System.out.println("Enter the usn,name,branch,phone number");
            String usn=ip.next();
            String nm=ip.next();
            String branch=ip.next();
            long ph=ip.nextLong();
            st[j].insertStudent(usn,nm,branch,ph);
        }
        for(int m=0; m<n; m++)
        {
            System.out.format("Student %d details are \n",m+1);
            st[m].displayStudent();
        }
    }
}
