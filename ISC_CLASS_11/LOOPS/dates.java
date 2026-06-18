package LOOPS;
import java.util.*;
public class dates
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in the order dd/mm/yyyy");
        String str = sc.nextLine();
        String t[]= str.split("/");
        int d = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        int y = Integer.parseInt(t[2]);
        int days_till_date = 0;
        int days_in_months[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        days_in_months[2]=(y%400==0 || (y%100!=0 && y%4==0))?29:28;
        String Dayname[]={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Enter day on 1st january of that year");
        String day = sc.nextLine();
        int dayno = -1;
        for(int i =1;i<=7;i++)
        {
            if(Dayname[i].equalsIgnoreCase(day))
            {
                dayno = i;
                break;
            }
        }
        for(int i=1;i<m;i++)
        {
            days_till_date +=days_in_months[i];
        }
        days_till_date+=(d-1)+ dayno;
        
        System.out.println(Dayname[days_till_date%8]);
    }
}