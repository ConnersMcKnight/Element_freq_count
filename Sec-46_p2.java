import java.util.Map;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.HashMap;
import static java.lang.Integer.*;
import  java.util.Scanner;                       
import static java.lang.System.*;

class Naman{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        out.print("Enter a string : ");
        String s = scanner.nextLine();
        String[] s2 = s.split("");
        int[] a = IntStream.rangeClosed(1, s.length()).toArray();

        HashMap<Integer,String> hashMap = new HashMap<>();
        for (int i = 0; i<s.length(); i++) hashMap.put(a[i], s2[i]);

        HashMap<String, Integer> frequency= new HashMap<>();
        for (String value : hashMap.values()) {
            frequency.merge(value, 1, Integer::sum);
        }

        int limit = s.length() / 2;
        String major_ele = null;
        int max = 0;

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                major_ele = entry.getKey();
            }
        }
        out.println("The total number of elements in the string is : " + s.length());
        out.println("Character frequencies: " + frequency);

        if (max > limit) {
            out.println("Majority element : " + major_ele);
        } else {
            out.println("No Majority element eound");
        }

    }}
