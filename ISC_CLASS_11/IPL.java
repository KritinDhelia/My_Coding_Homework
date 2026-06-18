import java.util.*;
/**
 * Write a description of class j here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IPL
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of seasons");
        int n = sc.nextInt();
        System.out.println("Enter no. of wins in each season");
        int win[] = new int[n];
        int up8 = 0;
        for(int i = 0;i<n;i++)
        {
            win[i]=sc.nextInt();
        }
        int max = win[1];
        int total = 0;
        for(int i = 0;i<n;i++)
        {
            if(win[i]>max)
                max=win[i];
            if(win[i]>8)
            {
                up8++;
            }
            System.out.println("wins in season "+(i+1)+" = "+win[i]);
            total+=win[i];
        }
        System.out.println("max win= "+max);
        System.out.println("total win= "+total);
        System.out.println("seasons with more than 8 wins = "+up8);
    }
}