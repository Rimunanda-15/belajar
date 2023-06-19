package Java;
import java.util.*;

class reverseString {
	public static void main (String[] args) {
	
        Scanner s = new Scanner(System.in);
		String str= s.nextLine(), hurufBalik="";
		char charKosong;
	
	System.out.print("Original word: ");
	System.out.println(str); //Example word
	
	for (int i=0; i<str.length(); i++)
	{
		charKosong= str.charAt(i); //extracts each character ke char
		hurufBalik= charKosong+hurufBalik; //adds each character in front of the existing string
	}
	System.out.println("Reversed word: "+ hurufBalik);
    s.close();
	}
    
}

