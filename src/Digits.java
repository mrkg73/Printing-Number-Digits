import java.util.Scanner;

public class Digits
{
    public static void main(String[] args)
    {
        String num;

        Scanner in = new Scanner(System.in);
        System.out.println(" Please Enter your number:");
        num=in.nextLine();
        int len=num.length();
        int counter=0;

        while(counter <len)
        {
            System.out.print(num.charAt(counter) + " ");
            counter+=1;
        }
    }
}
