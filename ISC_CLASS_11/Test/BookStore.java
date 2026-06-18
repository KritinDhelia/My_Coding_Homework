package Test;
import LOOPS.*;

/**
 * Write a description of class Bookstore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookStore
{
    public static void main(String args[])
    {
        Book obj = new Book();
        obj.input("angels and demons","dan brown",350);
        System.out.print("\n"+obj);
        obj.display();
    }
}