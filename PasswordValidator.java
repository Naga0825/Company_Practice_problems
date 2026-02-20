import java.util.Scanner;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        return password.matches(regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is Valid ✅");
        } else {
            System.out.println("Password is Invalid ❌");
        }
    }
}
