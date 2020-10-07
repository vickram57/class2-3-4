import java.util.Scanner;

public class Q7 {
        public static void firstpattern() {
            for(int i = 0;i<4;i++) {
                for(int j = 0;j<10;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void secondpattern() {
            for(int i = 0;i<5;i++) {
                for(int j = 0;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void fourthpattern(){
            for(int i=1;i<=5;i++) {
                for(int j =0;j<10-2*i; j++) {
                    System.out.print(" ");
                }
                for(int k = 0;k<2*i-1; k++) {
                    System.out.print("*");
                }
                System.out.println();
        }}
        public static void fifthpattern(){
            int counter = 0;
            for(int i=1;i<=5;i++) {
                counter+=1;
                for(int j =0;j<10-2*i; j++) {
                    System.out.print(" ");
                }
                for(int k = 0;k<2*i-1; k++) {
                    System.out.print(counter);
                }
                System.out.println();
        }}
        public static void sixthpattern(){
            for(int i=1;i<=5;i++) {
                for(int j =0;j<10-2*i; j++) {
                    System.out.print(" ");
                }
                int counter = i , counter1 = 1;
                for(int k = 0;k<2*i-2; k++) {
                    if(counter!=0) {
                        System.out.print(counter);
                        counter=counter-1;
                    }
                }
                System.out.println();
        }}

        public static void seventhpattern(){
            for(int i=1;i<=5;i++) {

                for(int j =0;j<10-2*i; j++) {
                    System.out.print(" ");
                }
                for(int k = 0;k<i; k++) {
                    System.out.print("*");
                }
                System.out.println();
        }}

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // firstpattern();
        // System.out.println();
        // secondpattern();
        // System.out.println();
        // fourthpattern();
        // System.out.println();
        // fifthpattern();
        // System.out.println();
        // sixthpattern();
        // System.out.println();
        seventhpattern();
    }
}
