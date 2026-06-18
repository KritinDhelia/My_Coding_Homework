package LOOPS;
import java.util.*;
public class PrimePalinGen
{
    int start,end;
    PrimePalinGen(int a,int b)
    {
        start = a;
        end = b;
    }
    void generate()
    {
        for(int i = start;i<=end;i++)
        {
            if(isPrime(i)+isPalin(i)==2)
                System.out.println(i);
        }
    }
    int isPrime(int i)
    {
        for(int j = 2;j<i;j++)
        {
            if(i%j==0)
            {
                return(0);
            }
        }
        return(1);
    }
    int isPalin(int i)
    {
        int z = 0;
        String str = Integer.toString(i);
        String nstr = "";
        for(int j=0;j<str.length();j++)
        {
            nstr=str.charAt(j)+nstr;
        }
        if(nstr .equals(str))
            z=1;
        return(z);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 no.s");
        int x = sc.nextInt();
        int y = sc.nextInt();
        PrimePalinGen obj = new PrimePalinGen(x,y);
        obj.generate();
    }
}