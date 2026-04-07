import java.util.Scanner;

class Practical12{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
	
 System.out.print("Enter the number: ");
   int  n=sc.nextInt();
		if(n%2==0){
      String str="*";
	  String spc=" ";
	  for(int i=n-1;i>=1;i-=2){
		System.out.println(spc.repeat(i-1)+str.repeat(n-i)+str.repeat(n-i-1));
	  }
	  for(int i=1;i<n;i+=2){
		System.out.println(spc.repeat(i-1)+str.repeat(n-i)+str.repeat(n-i-1));
	  }
	}

  else{
	
      String str="*";
	  String spc=" ";
	  for(int i=n-1;i>=0;i-=2){
		System.out.println(spc.repeat(i)+str.repeat(n-i)+str.repeat(n-i-1));
	  }
	  for(int i=2;i<n;i+=2){
		System.out.println(spc.repeat(i)+str.repeat(n-i)+str.repeat(n-i-1));
	  }
     
	}
}
}