import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no:");
        int n = s.nextInt();
        double sum = 0.0;
        for(int i =1;i<=n;i++){
            sum = sum + (double)1/i;
        }
        System.out.println(sum);
        // System.out.println();
        // System.out.println("sum is: " +sum);
    }
}
