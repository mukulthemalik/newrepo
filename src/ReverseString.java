
import java.util.Scanner;

/*olalala again
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mukulthemalik
 */
public class ReverseString {
    public static void main (String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("type any number");
        String a=obj.next();
        char[] b=new char[a.length()];
        for(int i=0;i<a.length();i++)
        {
            b[i]=a.charAt(i);
        }
        for(int i=a.length()-1;i>=0;i--)
        {
            System.out.println(b[i]);
        }
    }
}
