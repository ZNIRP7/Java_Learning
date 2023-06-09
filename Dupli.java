import java.io.*;
import java.util.Arrays;
class Dupli{
	public static boolean duplicate(int[] ar){
	  for(int i=0;i<ar.length;i++){
		  for(int j=0;j<ar.length;j++){
			  if(ar[i]==ar[j] && i!=j)
				  return true;}
				  }
				  return false;}
	
  public static void main(String[]args){
    int[]array ={1,4,2,5,4,1,3};
    int i,j;
      for(i=0;i<array.length-1;i++){
      for(j=i;j<array.length;j++){
      if(array[i]==array[j] && i!=j){
		  System.out.println("Duplicate values: " +array[j]);
	  } }}
 
     System.out.print( duplicate(array));
 
 
 }
  }
