import java.util.Scanner;
public class factorial {
    static int factorial(int n){
        if(n==0) {
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the no");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int fact = factorial(num);
        System.out.println(fact);




        // int n = 1;
        // if(num>0) {
        //     for(int i = num;i>0;i--){
        //         n = n*i;
        //     }
        //     System.out.println(n);
        // }else if(num==0) {
        //     System.out.println("1");
        // }
    }

}
