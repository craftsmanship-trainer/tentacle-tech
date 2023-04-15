Generating all permutations: Write a program that generates all of the permutations of a given string.
write a java program to use simple  ?


import java.util.*;
 
public class Permutation10 {
 
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        Permutation permutation = new Permutation();
        Set<String> resultSet = permutation.permute(str, 0, n - 1);
        System.out.println(resultSet);
    }
 
    private Set<String> permute(String str, int l, int r)
    {
        Set<String> resultSet = new HashSet<>();
 
        if (l == r)
            resultSet.add(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                resultSet.addAll(permute(str, l + 1, r));
                str = swap(str, l, i);
            }
        }
        return resultSet;
    }
 
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}