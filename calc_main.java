import java.util.Scanner;
public class calc_main
{
    //Demonstrating results of operation in main method
    //Written by G.J.Rahul, author of www.amcseminars.in
    int num1,num2;
    int res=0;
    int option(char op)
    {
        int add,sub,mul,div;
        char operator;
        operator=op;
        switch(operator)
        {
            case '+':
                add(num1,num2);
                break;
            case '-':
                sub(num1,num2);
                break;
            case '*':
                mul=mul(num1,num2);
                break;
            case '/':
                div=div(num1,num2);
                break;
            default:
                System.out.println("Invalid Operator");
        }
        return res;
    }
    int add( int num1,int num2)
    {
        int add1,add2;
        add1=num1;
        add2=num2;
        res = add1+add2;
        return res;
    }
    int sub(int num1,int num2)
    {
        int sub1,sub2;
        sub1=num1;
        sub2=num2;
        res = sub1-sub2;
        return res;
    }
    int mul(int num1,int num2)
    {
        int mul1,mul2;
        mul1=num1;
        mul2=num2;
        res = mul1*mul2;
        return res;
    }
    int div(int num1,int num2)
    {
        int div1,div2;
        div1=num1;
        div2=num2;
        int results = 0;
        try
        {
            results=div1/div2;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by 0");
        }
        res=results;
        return res;
    }
    void recivenum(int m, int n)
    {
        num1=m;
        num2=n;
    }
    public static void main(String args[])
    {
        char operator;
        int op1,op2;
        System.out.println("Enter any one operator(+,-,*,/)");
        Scanner in=new Scanner(System.in);
        operator=in.next().charAt(0);
        System.out.println("Enter first operand ");
        op1=in.nextInt();
        System.out.println("Enter Send Operand");
        op2=in.nextInt();
        calc_main obj = new calc_main();
        obj.recivenum(op1,op2);
        int res = obj.option(operator);
        System.out.printf(op1+" "+operator+" "+op2+" "+"is"+" "+res);
    }

}
