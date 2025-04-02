//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int edges[][] = new int[m][2];
            for (int i = 0; i < m; i++) {
                s = in.readLine().trim().split(" ");
                edges[i][0] = Integer.parseInt(s[0]);
                edges[i][1] = Integer.parseInt(s[1]);
            }
            Solution obj = new Solution();
            List<List<Integer>> adj = obj.printGraph(n, edges);
            boolean empty = true;
            for (int i = 0; i < n; i++) {
                if (adj.get(i).isEmpty()) {
                    continue;
                }
                empty = false;
                break;
            }

            if (empty) {
                System.out.println("[]");
                // System.out.println("~");
                continue;
            }

            for (int i = 0; i < n; i++) {
                Set<Integer> st =
                    new TreeSet<>(adj.get(i)); // TreeSet to ensure ordering
                System.out.print("[");

                Iterator<Integer> it = st.iterator();
                while (it.hasNext()) {
                    int value = it.next();
                    System.out.print(value);
                    if (it.hasNext()) {
                        System.out.print(" ");
                    }
                }
                System.out.println("]");
            }
            // System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>>adjList = new ArrayList<>(V) ;
        
        for(int i = 0; i < V; i++){
            adjList.add(new ArrayList<>());
        }
        
        int E = edges.length;
        
        for(int i = 0; i < E; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        return adjList;
    }
}