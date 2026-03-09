import java.util.Scanner;

class Book
{
    String title;
    int bookId;
    String author;

    Book(String title,int bookId,String author)
    {
        this.title = title;
        this.bookId = bookId;
        this.author = author;
    }

    void display()
    {
        System.out.println("Book Title: " + title);
        System.out.println("Book ID: " + bookId);
        System.out.println("Author: " + author);
    }
}

class Library
{
    Book b;

    void addBook(String title,int id,String author)
    {
        b = new Book(title,id,author);
        System.out.println("Book Added");
    }

    void displayBook()
    {
        if(b != null)
            b.display();
        else
            System.out.println("No Book Data");
    }
}

class lms
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();

        int choice;

        do
        {
            System.out.println("1 Add Book");
            System.out.println("2 Display Book");
            System.out.println("3 Exit");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter Book Title:");
                    String title = sc.next();

                    System.out.println("Enter Book ID:");
                    int id = sc.nextInt();

                    System.out.println("Enter Author:");
                    String author = sc.next();

                    l.addBook(title,id,author);
                    break;

                case 2:
                    l.displayBook();
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