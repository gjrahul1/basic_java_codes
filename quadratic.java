import java.util.*;
public class quadratic
{
    public static void main(String args[])
    {
        int a, b, c;
        double root1, root2;
        System.out.println("Enter the three co-efficients");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        double d = b * b - 4 * a * c;
        if (d > 0)
        {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are real and distinct");
            System.out.format("The root 1 is %.2f and root 2 is %.2f", root1, root2);
        }
        if (d == 0)
        {
            System.out.println("The roots are real and equal");
            root1 = root2 = -b / (2 * a);
            System.out.format("The root 1 and root 2 are %.2f", root1);
        }
        else
        {
            System.out.println("The root is imaginery");
            double real = -b / (2 * a);
            double img = Math.sqrt(-d) / (2 * a);
            System.out.format("The roots are %.2f and %.2f", real, img);
        }
    }
}