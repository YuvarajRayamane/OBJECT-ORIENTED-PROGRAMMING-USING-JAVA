import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
		System.out.println("Input the number(n):");
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int ans = check(c);
		System.out.println("Number of combinations of a, b, c and d :");
        System.out.println(ans);
    }
    static int check(int c) {
        int ctr = 0;
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    for(int l = 0; l < 10; l++) {
                        if(i + j + k + l == c) {
                            ctr++;
                        }
                    }
                }
            }
        }
        return ctr;
    }
}
