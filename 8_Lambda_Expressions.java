import java.util.*;
interface performOperation{
    boolean operation(int x);
}

public class Prog8 {
    public static void main(String[] args) {
        performOperation isOdd = (int a) -> a%2 != 0;
        performOperation isPrime = (int a) ->{
            for(int i=2; i<=a/2; i++)
                if(a%i == 0)
                    return false;
            return true;
        };
        performOperation isPalindrome = (int a) ->{
            int n = 0, t = a;
            while (t>0){
                n*=10;
                n+=t%10;
                t/=10;
            }
            return n==a;
        };
        Scanner in = new Scanner(System.in);
        while(true){
            int ch=0, n=0;
            System.out.println("Enter choice \n1.isOdd \t2.isPrime \t3.isPalindrome");
            ch = in.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the number");
                    n = in.nextInt();
                    System.out.println("isOdd"+isOdd.operation(n));
                    break;
                case 2:
                    System.out.println("Enter the number");
                    n = in.nextInt();
                    System.out.println("isPrime"+isPrime.operation(n));
                    break;
                case 3:
                    System.out.println("Enter the number");
                    n = in.nextInt();
                    System.out.println("isPalindrome"+isPalindrome.operation(n));
                    break;
                default:
                    System.exit(1);
            }
        }
    }
}
