import java.util.*;

public class homework1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1:System.out.println("January");
            break;

            case 2:System.out.println("February");
            break;

            case 3:System.out.println("March");
            break;

            case 4:System.out.println("April");
            break;

            case 5:System.out.println("May");
            break;

            case 6:System.out.println("June");
            break;

            default: System.out.println("Not valid");
        }
    }
}
