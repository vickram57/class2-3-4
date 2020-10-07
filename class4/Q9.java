import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Q9 {
    public static double fact(int num) {
        int factorial = 1;
        if(num==0) {
            return factorial;
        }else {
            for(int i =1;i<=num;i++) {
                factorial = factorial*i;
            }
           return  factorial;
        }
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of x and n :");
        int x = s.nextInt();
        int n = s.nextInt();
        double sum =0; int power = 0 , sign=1;
        for(int i = 1;i<=n;i++) {
            sum = sum + sign*( (Math.pow(x,power)/fact(power)));
            power+=2;
            sign = -1*sign;
        }
        System.out.println("cos"+x+": " +sum);
    }
}
