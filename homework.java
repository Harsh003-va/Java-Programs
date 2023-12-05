import java.util.*;

public class homework {
    public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int button=sc.nextInt();

switch(button){
    case 1: System.out.println(a + b);
    break;

    case 2: System.out.println(a - b);
    break;

    case 3: System.out.println(a * b);
    break;

    case 4: System.out.println(a / b);
    break;

    case 5: System.out.println(a % b);
    break;

   default: System.out.println("Invalid Button");

}

    }
}
