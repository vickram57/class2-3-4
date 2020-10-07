import java.util.Scanner;
import java.lang.Math;
public class Q8 {
    public static double fact(int num) {
        int factorial = 1;
        for(int i =1;i<=num;i++) {
            factorial = factorial*i;
        }
       return  factorial;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of x and n:");
        int x = s.nextInt();
        int n = s.nextInt();
        double sum=0 ;int no=1 , sign = 1;
        for(int i=1;i<=n;i++){
            sum = sum + sign*(Math.pow(x, no)/fact(no));
            no=no+2;
            sign= -1*sign; 
        }
        System.out.println("sin"+x+": " +sum);
    }
}
