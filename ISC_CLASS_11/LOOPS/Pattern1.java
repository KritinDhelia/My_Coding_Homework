package LOOPS;
import java.util.*;

/**
 * Write a description of class d here.
 *
 * @author (Kritin)
 * @version (1.0,4/14/26)
 */

/*
 * 1234567
 *  234567
 *   34567
 *    4567
 *     567
 *      67
 *       7
 */
public class Pattern1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\fEnter no. of rows");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int k=1;k<i;k++)
                System.out.print(" ");
            for(int j =i;j<=r;j++)
                System.out.print(j);
            System.out.println("");
        }
    }
}