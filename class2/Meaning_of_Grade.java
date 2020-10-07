import java.util.Scanner;
public class Meaning_of_Grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char grade = s.next().charAt(0);
        if(grade == 'A'){
            System.out.println("Excellent");
        }else if(grade == 'B'){
            System.out.println("Good");
        }else if(grade == 'C'){
            System.out.println("Average");
        }else if(grade == 'D'){
            System.out.println("Deficient");
        }else if(grade == 'F'){
            System.out.println("Failing");
        }
    }
}
