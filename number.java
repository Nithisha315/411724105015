import java.util.Scanner;

public class number {     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int m=sc.nextInt();
        System.out.print("Enter a number: ");
        int n = sc.nextInt();


        /* 
        //gcd
        int gcd=1;
           for ( int i=1;i<=Math.min(n,m);i++){
           
            if(n % i ==0 && m%i==0){
                gcd=i;
                gcd=Math.max(gcd,i);
            
              
            }
        }
        System.out.println("the gcd of a number is:"+gcd); 
        //lcm



        int lcm=(n*m)/gcd;
        System.out.println("the lcm of a number is :"+lcm);
*/




//euclideans method to find gcd
/* 
while(m!=0){

int temp= n%m;
 n=m;
 m=temp;}
System.out.println("the gcd of this number is:"+n);
    */



}
}
        