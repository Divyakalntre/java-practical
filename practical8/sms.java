import java.util.Scanner;
class Student
{
    String name;
    int regNo;
    long contactNo;

    Student(String name,int regNo,long contactNo)
    {
        this.name = name;
        this.regNo = regNo;
        this.contactNo = contactNo;
    }

    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Reg No: "+regNo);
        System.out.println("Contact No: "+contactNo);
    }
}class Management
{
    Student s;

    void addStudent(String name,int reg,long contact)
    {
        s = new Student(name,reg,contact);
        System.out.println("Student Added");
    }

    void displayStudent()
    {
        if(s != null)
            s.display();
        else
            System.out.println("No Student Data");
    }
}

class sms
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Management m = new Management();

        int choice;

        do
        {
            System.out.println("1 Add Student");
            System.out.println("2 Display Student");
            System.out.println("3 Exit");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter Name:");
                    String name = sc.next();

                    System.out.println("Enter Reg No:");
                    int reg = sc.nextInt();

                    System.out.println("Enter Contact:");
                    long contact = sc.nextLong();

                    m.addStudent(name,reg,contact);
                    break;

                case 2:
                    m.displayStudent();
                    break;

                case 3:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(choice!=3);
    }
}