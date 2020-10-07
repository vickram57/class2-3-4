import java.util.Scanner;
public class prime_no {
    public static void main(String[] args) {
        System.out.println("Enter the positive no:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        
        boolean flag = true;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
    }

