import java.util.Scanner;

public class Alpha
{
    public static void main(String args[])
    {
        char chr;
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter a Character : ");
        chr = scan.next().charAt(0);
    
        if((chr>='a' && chr<='z') || (chr>='A' && chr<='Z'))
        {
            System.out.print(chr + " is an Alphabet");
        }
        else
        {
            System.out.print(chr + " is not an Alphabet");
        }
    }
}7
