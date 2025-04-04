//{ Driver Code Starts
import java.util.*;


class StackUsingQueues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queues g = new Queues();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		
System.out.println("~");
}
	}
}


// } Driver Code Ends



class Queues
{
    Queue<Integer> q = new LinkedList<Integer>();
    //Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	   q.offer(a);
	   for(int i = 0; i < q.size()-1; i++){
	       int front = q.poll();
	       q.offer(front);
	   }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
        if(q.isEmpty()){
            return -1;
        }
	    int front = q.poll();
	    return front;
    }
	
}

