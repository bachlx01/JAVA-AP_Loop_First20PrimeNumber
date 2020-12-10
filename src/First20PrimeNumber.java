import java.util.Scanner;

public class First20PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of prime number show: ");
        int count = scanner.nextInt();
        int subCount = 0;
        int num = 2;
        while (subCount <= count - 1) {
            boolean check = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(num);
                subCount++;
            }
            num++;
        }
    }
}
