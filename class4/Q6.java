import java.util.Scanner;
import java.lang.Math;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no:");
        int n = s.nextInt();
        double sum = 0;
        for(int i=1;i<=n;i++) {
            if(i%2!=0) {
                sum = sum+ (double)1/i;
            }else{
                sum = sum- (double)1/i;
            }
        }
        System.out.println("sum: "+ sum);
        System.out.println("log sum: "+ Math.log(sum));
    }
}
