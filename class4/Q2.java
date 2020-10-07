import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max= 0;
        char choice;
        do {
            System.out.println("Enter the no:");
            int num = s.nextInt();
            if(max<num){
                max= num;
            }
            System.out.println("do u wish to continue(y/n):");
            choice = s.next().charAt(0);
        }while(choice=='y');
        System.out.println(max);
    }
}
