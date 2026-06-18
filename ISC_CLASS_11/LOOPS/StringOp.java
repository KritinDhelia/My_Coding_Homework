package LOOPS;
import java.util.*;
/**
 * Write a description of class BinSearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringOp
{
    String str,msk,nstr;
    StringOp()
    {
        str = " ";
        msk = " ";
        nstr = " ";
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter original and masking string in lower case");
        str = sc.nextLine();
        msk = sc.nextLine();
    }
    void form()
    {
        int ch=0;
        for(int i = 0;i<str.length();i++)
        {
            ch=0;
            for(int j = 0;j<msk.length();j++)
            {
                if(str.charAt(i)==msk.charAt(j))
                {
                    ch=1;
                }
            }
            if(ch==0)
                nstr=nstr+str.charAt(i);
        }
    }
    void display()
    {
        System.out.println("original string = " + str);
        System.out.println("new string = " + nstr);
    }
    void main()
    {
        StringOp obj = new StringOp();
        obj.accept();
        obj.form();
        obj.display();
    }
}