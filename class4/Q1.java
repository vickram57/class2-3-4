import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pos = 0,neg = 0,zero=0;
        char choice;
        do {
            System.out.println("enter the no:");
            int num = s.nextInt();
            if(num<0){
                neg+=1;
            }else if(num>0){
                pos+=1;
            }else {
                zero+=1;
            }
            System.out.println("do u wish to continue:(y/n)");
            choice = s.next().charAt(0);
        }while(choice=='y');

        // int[] num = new int[n];
        // System.out.println("enter no one by one:");
        // for(int i = 0;i<num.length;i++){
        //     num[i] = s.nextInt();
        // }

        // for(int i=0;i<num.length;i++){
        //     if(num[i]<0){
        //         neg+=1;
        //     }else if(num[i]>0){
        //         pos+=1;
        //     }else {
        //         zero+=1;
        //     }
        // }
        System.out.println("positive no:" + pos);
        System.out.println("negative no:" + neg);
        System.out.println("Zero:" + zero);
    }
}
