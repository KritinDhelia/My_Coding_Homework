package LOOPS;
import java.util.*;

/**
 * Write a program to input 2 numbers and find out quotient and remainder without using (*, /, %(modulus))
 * @author (Kritin)
 * @version (1.0,14/4/26)
 */
public class Divide_Operation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter 2 integer values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int q=0;
        for(;b<a;a-=b,q++);
        System.out.println("Quotient="+q);
        System.out.println("Remainder="+a);
    }
}