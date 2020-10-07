import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        boolean isLeap = false;
        if(year%4 == 0)
         { 
             if(year%100 == 0) 
             { 
                 if(year%400 == 0)
                 {
                    isLeap = true;
                 } else
                 {
                 isLeap = false;
                }
        }else { 
            isLeap = true;
        }
    }else{
            isLeap = false;
    }
    if(isLeap){
        System.out.println("Leap Year");
    }else {
        System.out.println("Not a leap year");
    }
    }
}
