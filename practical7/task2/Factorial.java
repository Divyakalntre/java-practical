import java.util.Scanner;

class Factorial 
{

static long factIterative(int n) 
 {
if (n < 0)
return -1;         
if (n == 0 || n == 1)
 return 1;

long fact = 1;
 for (int i = 2; i <= n; i++) 
  {
  fact = fact * i;
  }
 return fact;
 }

static long factRecursive(int n) {
if (n < 0)
return -1;          
if (n == 0 || n == 1)
return 1;

return n * factRecursive(n - 1);
}

public static void main(String[] args)
 {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
long iter = factIterative(n);
long recur = factRecursive(n);

if (iter == -1)
System.out.print("Invalid Input");
else {
System.out.print("Iterative: " + iter);
System.out.print("\nRecursive: " + recur);
     }
 }
}
