import java.util.Scanner;
public class Switch
{
public static void main(String args[])
{
    char operator;
    int op1,op2;
    int results=0;
    System.out.println("Choose any one of these operator(+,-,*,/)");
    Scanner in=new Scanner(System.in);
    operator=in.next().charAt(0);
    System.out.println("Enter the first operand");
    op1=in.nextInt();
    System.out.println("Enter second operand");
    op2=in.nextInt();
    switch(operator)
    {
        case '+':
            results=op1+op2;
            System.out.format("The results of %d + %d is %d",op1,op2,results);
            break;
        case'-':
            results=op1-op2;
            System.out.format("The results of %d - %d is %d",op1,op2,results);
            break;
        case '*':
            results=op1*op2;
            System.out.format("The results of %d * %d is %d",op1,op2,results);
            break;
        case '/':
            results=op1/op2;
            System.out.format("The results of %d / %d is %d",op1,op2,results);
            break;
        default:
            System.out.println("Invalid Operator");

    }
}
}
