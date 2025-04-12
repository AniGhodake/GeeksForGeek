//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        String s12 = sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            Solution obj = new Solution();

            boolean flag = obj.isRotated(s1, s2);

            if (flag == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2) {
         // Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // If length is less than or equal to 2, check for equality
        if (str1.length() <= 2) {
            return str1.equals(str2);
        }

        // Rotate str1 clockwise by 2 places
        String clockwise = str1.substring(str1.length() - 2) + str1.substring(0, str1.length() - 2);

        // Rotate str1 anti-clockwise by 2 places
        String antiClockwise = str1.substring(2) + str1.substring(0, 2);

        // Check if either rotation matches str2
        return clockwise.equals(str2) || antiClockwise.equals(str2);
    }
}