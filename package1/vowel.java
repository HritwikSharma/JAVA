package package1;

import java.util.*;
class vowel{
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the alphabet:");
        char a=input.next().toUpperCase().charAt(0);
        if(a == 'A'||a == 'E'||a == 'I'||a == 'O'||a == 'U')
        {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Not a Vowel");
        }
    }
}