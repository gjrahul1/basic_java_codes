import java.util.*;
public class calc
{
    //Demonstration of results of operation within sub-method
    int op1,op2;
    int sw;
    int op(int r)
    {
        int recieve;
        recieve=r;
        switch (recieve) {
            case 1:
                add(op1, op2);
                break;
            case 2:
                sub(op1, op2);
                break;

            case 3:
                 multi(op1, op2);
                break;

            case 4:
                 div(op1, op2);
                break;
            default:
                System.out.println("Invalid Operator");
        }
        return 1;
    }
    void add(int op1, int op2)
    {
        int add1,add2;
        add1=op1;
        add2=op2;
       int results=add1+add2;
      System.out.format("%d + %d is %d",add1,add2,results);
    }
    void sub(int op1, int op2)
    {
        int sub1,sub2;
        sub1=op1;
        sub2=op2;
        int results=sub1-sub2;
        System.out.format("%d - %d is %d",sub1,sub2,results);
    }
    void multi(int op1,int op2)
    {
        int mul1, mul2;
        mul1=op1;
        mul2=op2;

        int results=mul1*mul2;
        System.out.format("%d * %d is %d",mul1,mul2,results);
    }
    void div(int op1, int op2)
    {
        int div1, div2;
        int results = 0;
        div1 = op1;
        div2 = op2;
        try {
            results = div1 / div2;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        System.out.format("%d / %d is %d",div1,div2,results);
    }
    int number(int num1, int num2)
    {
        op1=num1;
        op2=num2;
        return 0;
    }
    public static void main(String args[])
    {
        int recive;
        int op1,op2;
        calc main = new calc();
        System.out.println("Enter \n 1 for Addition \n 2 for Subtraction \n 3 for Multipliation \n 4 for Division");
        Scanner in=new Scanner(System.in);
        int get=in.nextInt();
        System.out.println("Enter the first operand");
        op1=in.nextInt();
        System.out.println("Enter the second operand");
        op2=in.nextInt();
        int n = main.number(op1,op2);
        recive=main.op(get);
    }
}
