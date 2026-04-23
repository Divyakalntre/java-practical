import java.util.Scanner;

// User Defined Exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class ExceptionDemo {

    // throws keyword
    static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            // throw keyword
            throw new InsufficientBalanceException("Not enough balance!");
        }

        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + (balance - amount));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        try {
            System.out.print("Enter withdrawal amount: ");
            int amt = sc.nextInt();

            withdraw(balance, amt);
        }

        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Invalid Input!");
        }

        finally {
            System.out.println("Thank you for using the bank system.");
        }

        sc.close();
    }
}