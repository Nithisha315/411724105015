import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String rev="";
        for (int i = s.length()-1; i>=0; i--) {
            {
            rev=rev + s.charAt(i);
        }
        if(s.equals(rev))
         {   System.out.println("IT IS A PALINDROME");
        }
        else{
            System.out.println("IT IS NOT A PALINDROME");
        }
    } 
        sc.close();
}}
