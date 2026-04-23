import java.util.Scanner;

/* -------- Interface 1 -------- */
interface StudentService {

    int MAX_MARKS = 100;

    void addMarks(int m) throws Exception;
    void showResult();

    default void welcome() {
        System.out.println("Welcome to Student Management System");
        log("Student session started");
    }

    static void rules() {
        System.out.println("Rule: Marks must be between 0 and 100");
    }

    private void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}

/* -------- Interface 2 (Ambiguity) -------- */
interface ExtraRules {
    default void welcome() {
        System.out.println("Academic integrity rules verified successfully.");
    }
}

/* -------- Abstract Class -------- */
abstract class AbstractStudent {

    protected String name;
    protected final String college = "XYZ College";

    public AbstractStudent(String name) {
        this.name = name;
    }

    public abstract void display();
}

/* -------- User Defined Exception (Marks) -------- */
class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}

/* -------- User Defined Exception (Name) -------- */
class InvalidNameException extends Exception {
    public InvalidNameException(String msg) {
        super(msg);
    }
}

/* -------- Student Class -------- */
class Student extends AbstractStudent
        implements StudentService, ExtraRules {

    private int marks;

    public Student(String name) throws InvalidNameException {
        super(name);
        validateName(name);
    }

    // Name validation method
    private void validateName(String name)
            throws InvalidNameException {

        // allows only alphabets and spaces
        if (!name.matches("[a-zA-Z ]+")) {
            throw new InvalidNameException(
                "Invalid Name! Name should contain only alphabets.");
        }
    }

    // ambiguity resolution
    @Override
    public void welcome() {
        StudentService.super.welcome();
        ExtraRules.super.welcome();
    }

    @Override
    public void addMarks(int m)
            throws InvalidMarksException {

        if (m < 0 || m > MAX_MARKS)
            throw new InvalidMarksException(
                "Marks must be between 0 and 100");

        marks = m;
    }

    @Override
    public void showResult() {
        System.out.println("Marks Obtained: " + marks);
    }

    @Override
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("College: " + college);
    }
}

/* -------- Main Application -------- */
public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService.rules();

        try {

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            Student s = new Student(name); // may throw exception

            s.welcome();
            s.display();

            System.out.print("Enter Marks: ");
            int m = sc.nextInt();

            s.addMarks(m);
            s.showResult();

        }
        catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}