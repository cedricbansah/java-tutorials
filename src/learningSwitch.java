import java.util.*;

public class learningSwitch {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        String switchValue = sc.nextLine();

        switch (switchValue) {
            case "A":
                System.out.println("char A accepted");
                break;
            case "B":
                System.out.println("char B Accepted");
                break;
            case "C":
                System.out.println("char C Accepted");
                break;
            case "D":
                System.out.println("char D Accepted");
                break;
            case "E":
                System.out.println("char E Accepted");
                break;
            default:
                System.out.println("chars A to E not found");
                break;
        }
    }
}
