
class EachWordReverse{
public static void main(String[]args){
	int i;
	String word= "PYTHON WORLD DIFFERENT FROM JAVA ENVOR";
	 int len =word.length();
	 String [] word1= word.split(" ");
	 String wordRev="";
	 for(String w:word1)
	 {
		 String eachWordRev="";
		 for(i=w.length()-1;i>=0;i--)
		   {
			   eachWordRev = eachWordRev+w.charAt(i);
		   }
			 wordRev= wordRev+eachWordRev+" ";
		 } 
		 
		 System.out.println(wordRev+ " ");
		 
		 for(i=0;i<word1.length();i++){
		   if(word1[i] == 't'){
		   }
		 }
		 
}
}
