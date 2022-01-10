package com.company;

public class Main
{

    public static void main(String[] args){
	// write your code here
       /* {
           /* int x=0;
            int y=0;
            for(int z=0; z<5;z++)
            {
                if((++x>2) && (++y>2))
                {
                    x++;
                }
            }
            System.out.println(x+" "+y);
            for(int row=1;row<=4; row++){
                for(int col=1; col<=row;col++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            ..................stringgggg................................*/
            String firstname="Sun"; //Declaring fname
            String lastname="shine";//Declaring lastname var,with datatype string
            //CONCATENATION
            String fullname=firstname+lastname;
            System.out.println(fullname);
            System.out.println(firstname+" "+lastname);
            System.out.println(firstname+"@"+lastname);
            System.out.println(firstname+"@ "+lastname);
            System.out.println("Hello"+firstname);
            //Length
            System.out.println(fullname.length());//space counts//give small example
            String name1="sun shine"; System.out.println(name1.length());
            //charAt------explain indexing first
            System.out.println(fullname.charAt(3));
            System.out.println(name1.charAt(3));
            System.out.println(name1.charAt(2)+"/"+name1.charAt(6));
            //nontrimmed and trim
            String nonTrimmedString = "     rva";
            System.out.println(nonTrimmedString);
            System.out.println(nonTrimmedString.trim());
            String name="sun shineee";
            //Uppercase
            String ustring = name.toUpperCase();
            System.out.println(ustring);
            //Lowercase
            String lstring = name.toLowerCase();
            System.out.println(lstring);
            //replace
            System.out.println(name.replace('u', 'o'));
            System.out.println(name.startsWith("k"));
            System.out.println(name.endsWith("e"));
            //indexof
            System.out.println(name.indexOf("e"));
            System.out.println(name.lastIndexOf("e"));


        //compareto ---returns +ve value if first>sec , -ve value if first<sec, 0 if ==
        //String str = null;
        //we need to check first character //it will print diff between character count
            String s1="hello";
            String s2="cello"; //c to h=5 char//character c is smaller than h
            System.out.println(s1.compareTo(s2));
            System.out.println(s2.compareTo(s1));
            String s3="aall";String s4="acell";//a to c=2
            System.out.println(s3.compareTo(s4));
            String s5="CELLO";// 'c' - 'C' => 99 - 67 = 32
            System.out.println(s2.compareTo(s5));
            String s6="aall";
            System.out.println(s3.compareTo(s6));//whynot ==????
            String s7= new String("aall");
            System.out.println(s6.compareTo(s7));
            if(s6==s7){
                System.out.print("Strings are equal");}
            else{
                System.out.print("Strings are not equal");
                //because object diff bnaya na
            }
            //SUBSTRING
            String sent= "Have some faith";
            String sent1=sent.substring(3,sent.length());//space counts
            System.out.print(sent1);
            // ParseInt Method of Integer class
            String str = "123";
            int number = Integer.parseInt(str);
            System.out.println(number);
            //ToString Method of String class
            int num = 123;
            String s = Integer.toString(num);//perform string methods on int
            System.out.println(s.length());
            //replace
            System.out.println(name.replace('u', 'o'));
            System.out.println(name.startsWith("u"));
            System.out.println(name.endsWith("e"));


            //...................................StringBuilder.............................
            //declaration
            StringBuilder sb = new StringBuilder("tony");
            System.out.println(sb);
            //Set Char
            System.out.println(sb.charAt(0));
            //Get Char     -replace
            sb.setCharAt(0, 'p');
            System.out.println(sb);
            //....................................................................................
            //reversing with string builder and stringbuffer
            String input = "law";
            // Converting String object to StringBuffer object
            // by
            // creating object of StringBuilder class

            StringBuilder input1 = new StringBuilder();

            // append a string into StringBuilder input1
            input1.append(input);
            // reverse StringBuilder input1
            input1.reverse();
            // print reversed String
            System.out.println(input1);//........................................................
            //StringBuffer sbr = new StringBuffer(input);
            StringBuffer sbr = new StringBuffer(input1);
            // To reverse the string
            sbr.reverse();
            System.out.println(sbr);
            //............................................................................................
            //Insert char
            sb.insert(3, 'n');
            System.out.println(sb);
            //String s1="hello";
            //s1.insert(3, 'n');
            //System.out.println(s1); RETURNS ERROR- Cannot find symbol

            //delete char
            sb.delete(0, 4);
            System.out.println(sb);
            //Append means to add something at the end.
            sb.append("ear");
            System.out.println(sb);
            sb.append(" 2022");
            System.out.println(sb);
            //length
            System.out.println(sb.length());



        }

}

