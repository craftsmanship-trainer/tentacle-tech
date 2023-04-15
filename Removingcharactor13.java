package kanmaniAssingment;

public class Removingcharactor13 {

    public static void main(String[] args) {

        String str = "Hello gulugulu";
        char removeChar = 'l';
        String strWithoutChar = str.replaceAll(Character.toString(removeChar), "");
        System.out.println("Original String : "+str);
        System.out.println("String without character : "+strWithoutChar);
    }

}
