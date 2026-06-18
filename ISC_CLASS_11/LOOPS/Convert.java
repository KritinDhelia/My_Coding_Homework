package LOOPS;
import java.util.*;
/**
 * Write a description of class Convert here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Convert
{
    int n,d,m,y;
    Convert()
    {
        n = 0;
        d = 0;
        m = 0;
        y = 0;
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day no. and year");
        n=sc.nextInt();
        y=sc.nextInt();
    }
    void day_to_date()
    {
        int c =0;
        while(n>0)
        {
            
        }
    }
    void display()
    {
        if(m==1)
            System.out.print("January ");
        else if(m==2)
            System.out.print("February ");
        else if(m==3)
            System.out.print("March ");
        else if(m==4)
            System.out.print("April ");
        else if(m==5)
            System.out.print("May ");
        else if(m==6)
            System.out.print("June ");
        else if(m==7)
            System.out.print("July ");
        else if(m==8)
            System.out.print("August ");
        else if(m==9)
            System.out.print("September ");
        else if(m==10)
            System.out.print("October ");
        else if(m==11)
            System.out.print("November ");
        else
            System.out.print("December ");
        System.out.print(d+", ");
        System.out.print(y);
    }
    void main()
    {
        Convert obj = new Convert();
        obj.accept();
        obj.day_to_date();
        obj.display();
    }
}