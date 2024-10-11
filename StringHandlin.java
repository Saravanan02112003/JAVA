package first;

import java.util.Arrays;

public class StringHandlin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to find the Length of the string
		String type="hello";
		System.out.println("Mystring is"+type);
		int length1=type.length();
		System.out.println("MyString length is "+length1);
		
		//Concatenation between strings
		String str1 = "hai";
		String str2="saravanan";
		System.out.println(str1+str2);
		String JoinedString=str1.concat(str2);
		System.out.println("Concated string is"+JoinedString);

		//Equals check both the strings are equal or not
		boolean result=str1.equals(str2);
		System.out.println("string are not equal");
		
		//create a string using new keyword
		//compareTo is used to comapre the strings
		String str3=new String("hai i am string using new");
		int result2=str1.compareTo(str3);
		System.out.println(result2);
		
		//indexOf returns the occurences of the string
		String str5="hai iam string using new";
		int result3=str5.indexOf("i");
		System.out.println(result3);
		
		String text1="java is a programming language";
		//split string from space 
		String[] resultany=text1.split("");
		for(String strany:resultany)
		{
			System.out.println(strany+" ");
		}
		
		//split--1.regex(div the string)
		//2.limit--n of resulting substrings
		
		String vowels="a::b::c::d::e::";
		//splitting the string ::
		//stroing the result in an array
		String[] resultvowel=vowels.split("::");
		//converting array to string and printing it
		System.out.println("result"+Arrays.toString(resultvowel));
		
		//replace the text or char with the given text
		String str34="hai bat and ball";
		System.out.println(str34.replace('b','h'));
		
		String substringresult="welcome to javaworld";
		System.out.println(substringresult.substring(4,6));
		
		
		//4th charcter to the last charcter
		String substringresult1="welcometo java world mamee";
		System.out.println(substringresult1.substring(4));
		
		
		
		
		
		
		
		
		
	
	}

}
