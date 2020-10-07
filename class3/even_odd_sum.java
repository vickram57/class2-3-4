import java.util.Scanner;
public class even_odd_sum {
    public static void main(String[] args) {
        System.out.println("Enter the six no");
        Scanner s = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int[] num = new int[6];
        for(int i=0;i<num.length;i++){
            num[i] = s.nextInt();
        }
        for(int i = 0;i<num.length;i++){
            if(num[i]%2 ==0) {
                even = even+num[i];
            }else {
                odd = odd+num[i];
            }
        }
        System.out.println(even+ " "+odd);
    }
}
