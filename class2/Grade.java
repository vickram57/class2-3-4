import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double average = (a+b+c)/3;
        if(90<=average && average<100){
            System.out.println("A");
        }else if(80<=average && average<89){
            System.out.println("B");
        }else if(70<=average && average<79){
            System.out.println("C");
        }else if(60<=average && average<69){
            System.out.println("D");
        }else if(0<=average && average<59){
            System.out.println("F");
        } 
    }
}
