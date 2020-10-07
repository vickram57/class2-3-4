
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no:");
        int num = s.nextInt();
        int x = 0, y = 1;
        System.out.print(x+" "+ y);
        for(int i =2 ; i<num;i++) {
            int z= x+y;
            x = y;
            y=z;
            System.out.print(" "+z);
        }
    }
}
