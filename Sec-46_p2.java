// import static java.lang.System.*;
// import static java.util.Scanner.*;
//                                                         prog1
// import java.util.Scanner;
// class Sec46p2{

//     public static void main (String[]args){
//         Scanner scanner = new Scanner(System.in);
//         out.print("Enter a string : ");
//         String s = scanner.nextLine();
//         out.println(s);
//     }
// }

// import static java.lang.System.*;
// import static java.util.Scanner.*;
//                                                         // prog2
// import java.util.Scanner;
// class Sec46p2{
//     public static void main (String[]args){
//         Scanner scanner = new Scanner(System.in);
//         out.print("Enter the first name : ");
//         String f = scanner.nextLine();
//         out.print("Enter the middle name : ");
//         String m = scanner.nextLine();
//         out.print("Enter the last name : ");
//         String l = scanner.nextLine();

//         out.print("The full name of yours is : "+f+" "+m+" "+l);
//         out.println(); naresh iit
//     }
// }

// import static java.lang.System.*;
// import static java.util.Scanner.*;
//                                                         // prog3
// import java.util.Scanner;
// class Sec46p2{
//     public static void main (String[]args){
//         Scanner scanner = new Scanner(System.in);

//         out.print("Enter a string : ");
//         String s = scanner.nextLine();

//         String[] a = new (s);

// //ratan it , krishna balan, c301, yashvant .. book
    
//     }}

// import static java.util.Scanner.*;

// import java.util.Scanner;                          //emoves spaces

// import static java.lang.System.*;

// class Naman{
//     public static void main (String[]args){
//         Scanner scanner = new Scanner(System.in);
//         out.print("Enter a string : ");
//         String s = scanner.nextLine();
//         String[] s2 = s.split(" ");
//         for (String a : s2){
//             out.print(a);
//         }
//     }
// }

// import  java.util.Scanner;                       //
// import static java.lang.System.*;

// class Naman{
//     public static void main (String[]args){
//         Scanner scanner = new Scanner(System.in);
//         out.print("Enter a string : ");
//         String s = scanner.nextLine();
//         String[] a = new String(s.split(" "));
//         for (String a2 : a){
//             out.print(a2);}
//         }
//     }

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