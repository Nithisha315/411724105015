import java.util.Scanner;
public class recursion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        //multiplication of three numbers
        /* 
        int mul=product(a,b,c);
        System.out.println(mul);
    sc.close();}
        public static int product(int a,int b,int c){
            int mul=a*b*c;
            
            return mul;
            */





           // product of n numbers
           /* 
        int fact = fact(1,n,1);
        System.out.println(fact);
        System.out.println("success");
        sc.close();
        }
        
        
        public static int fact(int i,int n,int fact){
            if(i>n){
                return fact;
            }
           fact=fact * i;
           return fact(i+1,n,fact);
           */





           //sum the digits(123=6)
           /* 
          int s = sum(n,0);
        System.out.println(s);
        System.out.println("success");
        sc.close();
        }
        
        
        public static int sum(int n,int s){
            if(n ==0){
                return s;
            }
           s=s+(n%10);
           return sum(n/10,s);
           */



        
        fib(1,n,0,1);
        System.out.println("success");
        sc.close();
        }
        
        
        public static int fib(int i,int n,int a,int b){
            if(i>n){
                return;
            }
           System.out.print(a+" ");
           int c=a+b;
           fib(i+1, n, a, b,c);
        }
    }
