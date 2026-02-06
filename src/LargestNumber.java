import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
   
        

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TODO: Read N
        int n = sc.nextInt();

        // TODO: Read N strings into an array
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // TODO: Sort the strings using a custom comparator
        // Comparator logic: (str1, str2) -> (str2 + str1).compareTo(str1 + str2)
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String str1, String str2) {
                return (str2 + str1).compareTo(str1 + str2);
            }
        });

        // TODO: Handle edge case where all numbers are "0"
        if (arr[0].equals("0")) {
            System.out.println("0");
            return;
        }

        // TODO: Concatenate sorted strings and print
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        System.out.println(result.toString());
        sc.close();
    }
}

    

