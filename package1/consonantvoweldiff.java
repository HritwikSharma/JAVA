package package1;
import java.util.*;
class consonantvoweldiff
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char c=sc.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}