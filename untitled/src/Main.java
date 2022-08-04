import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
       char[] arr = {'A', 'b', 'c', 'd', 'E', 'y'};
        MyString myString1 = new MyString("a b c d e f g");
        MyString myString2 = new MyString(arr);

        //starts with
        System.out.println(myString1.startsWith('a'));
        System.out.println();

        //ends with
        System.out.println(myString2.startsWith("abc"));
        System.out.println();
        System.out.println(myString2.endsWith('y'));
        System.out.println();

        //contains
        System.out.println(myString2.contains('t'));
        System.out.println();

        //length
        System.out.println(myString2.length());
        System.out.println();

        //substring
        System.out.println(myString2.subString(2,6));
        System.out.println();

        //to int (poluchilas parasha)
        try {
        System.out.println(myString1.toInteger());}
        catch (Exception e){
         System.out.println("Something went wrong");
        }
        finally {
         System.out.println("Try again");
        }
        System.out.println();

        //to upper case
        System.out.println(myString2.toUpperCase());
        System.out.println();

        //to lower case
        System.out.println(myString2.toLowerCase());
        System.out.println();

        //char at
        System.out.println(myString2.charAt(3));
        System.out.println();

        //concat
        System.out.println(myString2.concat("oAoB"));
        System.out.println();

        //index of
        System.out.println(myString2.indexOf('a'));
        System.out.println();

        //split at
        System.out.println(myString2.splitAtIndex(3));




    }

}