import java.util.*;
/**
 * Write a description of class j here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IPL2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of matches");
        int n = sc.nextInt();
        System.out.println("Enter winning margin of match");
        int margin[] = new int[n];
        int up50 = 0;
        double avg=0;
        for(int i = 0;i<n;i++)
        {
            margin[i]=sc.nextInt();
        }
        int max = margin[1];
        int min = margin[1];
        for(int i = 0;i<n;i++)
        {
            if(margin[i]>max)
                max=margin[i];
            if(margin[i]<min)
                min=margin[i];
            if(margin[i]>50)
            {
                up50++;
            }
            System.out.println("margin in match "+(i+1)+" = "+margin[i]);
            avg+=(double)margin[i];
        }
        avg/=(double)n;
        System.out.println("largest margin= "+max);
        System.out.println("closest match= "+min);
        System.out.println("match with margin more than 50 = "+up50);
    }
}