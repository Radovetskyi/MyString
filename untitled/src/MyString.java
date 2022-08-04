public class MyString {
    private final char[] chars;

    public MyString(MyString myString) {
        this.chars = myString.getChars();
    }

    public MyString(char[] chars) {
        this.chars = chars;
    }

    public MyString(String string) {
        this.chars = string.toCharArray();
    }

    public char[] getChars() {
        return chars;
    }

    public boolean startsWith(char myString)
    {
        for (int i = 0; i < chars.length; i++) {
            if (myString == chars[i]) {
                return true;
            } else {
                return false;
            }
        }
                return false;
    }
    public boolean startsWith(String myString)
    {
        var a = myString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (a[i] == chars[i])
                return true;
            else{
                break;
            }
        }
        return  false;
    }
    public boolean endsWith(char myString){
        int a = chars.length;
        return chars[a-1] == myString;
    }

    public boolean endsWith(String myString){
        var a = myString.toCharArray();
        for (int i = chars.length - 1; i >=0; i--) {
            if (a[i] == chars[i])
                return true;
            else{
                break;
            }
        }
        return  false;
    }
    public boolean contains(char character) {
            boolean rtrn = false;
            for (int i = 0; i < chars.length; i++){
                rtrn = character == chars[i];
                if(rtrn)
                    break;
                System.out.println(i);
            }
            return rtrn;
    }
    public int length(){
        int i = 0;
        while(i < chars.length)
        {
            i++;
        }
        return i +1;
    }

    //zachem delat` substring chiselnim tipom?
    public int subString(int start, int end){
        for (int i = 0; i < chars.length; i++){
            if(i == start) {
                start++;
                System.out.print(chars[i]);
            }
            else if (start == end)
                break;
        }
        System.out.println();
        return 1;
    }

    public int toInteger () {
        var string = new String(chars);
        return Integer.parseInt(string);
        }
    public String toUpperCase(){
            var a = new int[chars.length];
            //var b = new char[chars.length];
        for (int i = 0; i < chars.length; i++){
            if ((int)chars[i] >= 97 && (int)chars[i] <= 122)
            {
                a[i] = chars[i] - 32;
            }
            else {
                a[i] = chars[i];
            }
            chars[i] = (char) a[i];
       }
            return String.valueOf(chars);
    }
    public String toLowerCase(){
        var a = new int[chars.length];
        //var b = new char[chars.length];
        for (int i = 0; i < chars.length; i++){
            if ((int)chars[i] >= 65 && (int)chars[i] <= 90)
            {
                a[i] = chars[i] + 32;
            }
            else {
                a[i] = chars[i];
            }
            chars[i] = (char) a[i];
        }
        return String.valueOf(chars);
    }

    public char charAt(int index){
        return chars[index];
    }

    public String concat(String myString){
        return String.valueOf(chars) + myString;
    }
    public int indexOf(char character){
        int index = 0;

            for (char aChar : chars) {
                index++;
                if (aChar == character)
                    return index;
            }
    System.out.println("No such character");
    return 0;
    }

    public String splitAtIndex(int index){
        String st1 = " ", st2 = " ";
        var a = new char[index];
        var a1 = new char[chars.length];
        for (int i = 0; i < index; i++){
            a[i] = chars[i];
            st1 = String.valueOf(a);
        }
        for (int i = index; i < chars.length; i++){
            a1[i] = chars[i];
            st2 = String.valueOf(a1);
        }
        return st1 + ',' + st2;
    }

}

