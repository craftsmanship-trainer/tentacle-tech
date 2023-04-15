package kanmaniAssingment;
public class Delimiter9 {
    public static void main(String[] args) {
        String[] strings = {"Hi", "beauty", "love", "your", "self", "enjoy", "your", "life"};
        String delimiter = "-";
        StringBuilder resultString = new StringBuilder();
        for (String string : strings) {
            resultString.append(string).append(delimiter);
        }
        // remove last delimiter
        resultString.deleteCharAt(resultString.length() - 1);
        System.out.println(resultString.toString());
    }
}