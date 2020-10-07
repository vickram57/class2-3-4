import java.util.Scanner;
public class Valid_triangle {
    public static void main(String[] args) {
        System.out.println("Enter the angles of triangles:");
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int third = s.nextInt();
        int sum = first+second+third;
        if(sum==180){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
