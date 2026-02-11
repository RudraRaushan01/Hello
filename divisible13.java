import java.util.Scanner;

public class divisible13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the large number: ");
        String number = sc.nextLine();

        if (isDivisibleBy13(number)) {
            System.out.println("The number is divisible by 13.");
        } else {
            System.out.println("The number is NOT divisible by 13.");
        }
    }

    public static boolean isDivisibleBy13(String num) {
        int remainder = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            remainder = (remainder * 10 + digit) % 13;
        }
        return remainder == 0;
    }
}
