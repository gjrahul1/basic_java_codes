import java.util.Scanner;

public class prime
{
    public static void main(String args[])
    {
        int n,i;
        int flag=0;
        System.out.println("Enter the number to check if it is prime or not");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        for(i=2; i<n; i++)
        {
            if(n%i==0)
                flag=1;
        }
        if(flag==0)
        {
            System.out.println("This is a Prime Number \n");
        }
        else
            System.out.println("This is not a Prime Number");

    }

}
