package com.chainsys.strings;
import java.util.Scanner;

public class StringLessonA {

        public static void lessonOne() {
                String firstString = "Chainsys";
                System.out.println(firstString);
                char dataone[] = { 'c', 'h', 'a', 'i', 'n' };
                String secondString = new String(dataone);
                System.out.println(secondString);
                String thirdString = new String(new char[] { 'c', 'h', 'a', 'i', 'n' });
                System.out.println(thirdString);
        }

        public static void lessontwo() {
                String firstString = "Hello";
                String secondString = "Hello";
                String thirdString = "Hello";
                int firstnumber = 100;
                int secondnumber = 200;
                int thirdnumber = 300;
                System.out.println(firstnumber);
                System.out.println(secondnumber);

                firstString = "Welcome";
                System.out.println(firstString);
                System.out.println(secondString);
        }

        public static void creatingStringForLoop() {
                for (int count = 0; count < 10; count++) {
                        String s1 = "Hello";
                        System.out.println(count);
                }

        }

       
        public static void StringToUpperLower() 
        {
        	
                String secndString="Hope     is        rain     ";
                System.out.println("Before Trim:"+secndString);
        	
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a word");

                String firstString = sc.nextLine();
                sc.close();
                int stringLength = firstString.length();

                System.out.println("Lenght " + stringLength);
                char[] data = firstString.toCharArray();
                int dataarraylength = data.length;

                System.out.println("Lenght is " + dataarraylength);
        }
        
    

        

        public static void stringToUpperLower() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a word");

                String firstString = sc.nextLine();
                sc.close();

                System.out.println(firstString);
                String stringInUppercase = firstString.toUpperCase();

                System.out.println("to upper case is " + stringInUppercase);

                System.out.println("s1 = " + firstString);

                String stringLowerCase = firstString.toLowerCase();

                System.out.println("Lower case is " + stringLowerCase);
                System.out.println("s1 = " + firstString);
                
                String substring=firstString.substring(3);
                System.out.println(substring);
                
                String replaceString=firstString.replace('a','e');
                System.out.println(replaceString);
                
                boolean flag1=firstString.equals(stringInUppercase);
                System.out.println(flag1);
                
                boolean flag=firstString.equalsIgnoreCase(stringInUppercase);
                System.out.println(flag);
        }
                public static void toSplit() {
                	String firstString = "	Tom and Jerry are god friends	";
                	String trimmedstring=firstString.trim();
                	String[] data =trimmedstring.split(" ");
                	System.out.println("Word Count " + data.length);
                
                			
                }
               /* public static void reverse()
                {
                	java.util.Scanner Sc=new java.util.Scanner(System.in);
                	//System.out.println("Enter a Sentence");
                	
                	String sentence="Gokul";
                	char c[] =sentence.toCharArray();
                	char r='';
                	for(i=sentence.length-1;i>0;i--)
                	{
                		r+=c[i];
                	}
                	System.out.println(r);
                	
                }*/



        //public static void reverse() 
        
        public static void verifyString(String s1)	// verify and print
        {												
        	if(null==s1)
        	{
        		System.out.println("String is NUll");
        		return;
        	}
        	else
        		System.out.println("String id Not Null"+s1);
        if(!s1.isEmpty())
    	{
    		System.out.println("\t is Not Empty");
    	}
    	else 
    	{
    		System.out.println("String is Empty" + s1);
        }
        
        }
}


