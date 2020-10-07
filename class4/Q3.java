import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no:");
        int num = s.nextInt();
        int sum=0, temp = num;
        
        while(temp!=0){
            int rem = temp%10;
            int Q = temp/10;
            sum=sum+rem*rem*rem;
            temp = Q;
        }
        if(sum==num){
            System.out.println("Armstrong No");
        }else {
            System.out.println("Not");
        }

    }
}
