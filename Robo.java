import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Arrays;
class Robo{
public static void main(String[]args){
//String [] array = {"RRLLL"};
Scanner in = new Scanner(System.in);
System.out.println("Enter ur String count");
 int n= in.nextInt();
System.out.println("Enter ur position");
  int x= in.nextInt();
System.out.println("Enter ur String");
 String str= in.next();
 int len = str.length();
 System.out.println("Enter the length of ==>"+ len);
 
 //Set<Integer> st = new HashSet();
 //st.add(x);
 
  String[]array = str.split("");
  System.out.println(Arrays.toString(array));
  System.out.println("P: "+ array[0]);
  
  Set<Integer> st = new HashSet();
 st.add(x);
  int i;

   for(i=0;i<array.length;i++){
	 if(array[i]=="R")
		x=x+1;
		st.add(x+1);
		System.out.println("ps: "+x);
		  
	 if(array[i]=="L")
		 x=x-1;
		 st.add(x-1);
		 System.out.println("ps: "+x);
	 
	 System.out.println("P: "+ array[i]);
	 System.out.println("P1:" +i);
          x++;
	
   }
	
  System.out.println("P: "+ i);
  System.out.println("ps: "+x);
  System.out.println("step" + st);
  System.out.println("Size: "+ st.size());
  
  
  
}
}
