import java.util.*;

public class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            List<Integer> brr = new ArrayList<>();
            List<Integer> crr = new ArrayList<>();

            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }

            String input2 = sc.nextLine();
            Scanner ss2 = new Scanner(input2);
            while (ss2.hasNextInt()) {
                brr.add(ss2.nextInt());
            }

            String input3 = sc.nextLine();
            Scanner ss3 = new Scanner(input3);
            while (ss3.hasNextInt()) {
                crr.add(ss3.nextInt());
            }

            Solution ob = new Solution();
            List<Integer> res = ob.commonElements(arr, brr, crr);

            if (res.size() == 0) System.out.print(-1);
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        
         List<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;
        Integer lastAdded = null; // To handle duplicates in the result
        
        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            int a1 = arr1.get(i), a2 = arr2.get(j), a3 = arr3.get(k);
            
            if (a1 == a2 && a2 == a3) {
                // Common element found
                if (lastAdded == null || !lastAdded.equals(a1)) {
                    result.add(a1);
                    lastAdded = a1;
                }
                i++;
                j++;
                k++;
            } else if (a1 < a2) {
                i++;
            } else if (a2 < a3) {
                j++;
            } else {
                k++;
            }
        }
        
        // if (result.isEmpty()) {
        //     result.add(-1); // No common elements found
        // }
        
        return result;
      
    }
}