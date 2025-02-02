//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
       if(arr == null || arr.length == 0){
           return new ArrayList<>();
       }
       
       Map<String,ArrayList<String>> map = new HashMap<>();
       
       for(String s : arr){
           char ch[] = s.toCharArray();
           Arrays.sort(ch);
           String sortedString = new String(ch);
           
           map.putIfAbsent(sortedString,new ArrayList<>());
           map.get(sortedString).add(s);
       }
       return new ArrayList<>(map.values());
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline after the test case input
        while (t-- > 0) {
            String inputLine = sc.nextLine();
            String[] arr = inputLine.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.anagrams(arr);
            result.sort(Comparator.comparing(a -> a.get(0)));
            for (ArrayList<String> group : result) {
                for (String word : group) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends