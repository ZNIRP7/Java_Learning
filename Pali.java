import java.lang.*;
import java.util.Scanner;
class Pali{

public static void main(String[]args){
int num,num1;
int rever=0,remin=0;
Scanner in = new Scanner(System.in);
 num= in.nextInt();
num1=in.nextInt();

while(num!=0)
     {
       remin=num%10;
       rever=rever*10+remin;
	num/=10;
      }

System.out.println("Reversed number: "+rever);
if(rever==num1)
System.out.println("It is palindrom");
else
System.out.println("Its not Palindrom\n"); 

}
}

