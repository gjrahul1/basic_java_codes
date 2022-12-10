import java.util.*;
public class prime2
{
    //This program uses function as the 'method' to evaluate if the given number is prime or not.
    //Written by G.J.Rahul, author of www.amcseminars.in
    int checkprime(int number) {
        int num;
        int flag = 0;
        num = number;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                flag = 1;
            }
        }
        return flag;
    }
    public static void main(String args[])
    {
        int n;
        prime2 obj = new prime2();
        System.out.println("Enter the number to be checked if it's prime or not");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int s1=obj.checkprime(n);
        if(s1==1)
            System.out.println("The number is not Prime Number");
        else
            System.out.println("The number is Prime Number");
    }
}
