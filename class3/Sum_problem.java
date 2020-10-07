import java.util.Scanner;
public class Sum_problem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        do {
            i = 0;
            System.out.println("enter two no:");
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            int sum = n1+n2;
            System.out.println(sum);
            System.out.println("Press 1 to continue or 0 to exit:");
            i = s.nextInt();
        }while(i==1);
    }
}
