class Solution
{
    public:
    /*You are required to complete this method*/
    int findK(int a[MAX][MAX],int n,int m,int k)
    {
       // vector<int>nums;
 		int firstRow = 0;
 		int lastRow = n -1;
 		int firstCol = 0;
 		int lastCol = m -1;
 		int count = 0;
 		int totalCount = m*n;
//  		int element;
 		int ans = -1;
 	
 		
//  		int j = 0;
//  		int brr[MAX*MAX];
 		while(count<totalCount){
 		    // first Row
 		    for(int i =firstCol; i <= lastCol && count< totalCount; i++ ){
 		        count++;
 		         if (count == k)
 		        return a[firstRow][i];
 		       // count++;
 		       // nums.push_back(element);
 		     //  brr[j] = element;
 		     //  j++;
 		    }
 		    firstRow++;
 		    
 		      // last Col
 		    for(int i =firstRow; i <= lastRow && count < totalCount; i++){
 		        count++;
 		         if (count == k)
 		        return a[i][lastCol];
 		        //count++;
 		       // nums.push_back(element);
 		     //   brr[j] = element;
 		     //  j++;
 		    }
 		    lastCol--;
 		    
 		      //last Row
 		      for(int i = lastCol; i >= firstCol && count < totalCount; i--){
 		          count++;
 		           if (count == k)
 		          return a[lastRow][i];
 		          //count++;
 		         // nums.push_back(element);
 		     //     brr[j] = element;
 		     //  j++;
 		      }
 		      lastRow--;
 		      
 		      //first Col
 		      for(int i = lastRow; i >= firstRow && count < totalCount; i--){
 		          count++;
 		           if (count == k)
 		          return a[i][firstCol];
 		          //count++;
 		         // nums.push_back(element);
 		     //     brr[j] = element;
 		     //  j++;
 		      }
 		      firstCol++;
 		      
 		      
 		}
 		
//  		for(int i = 0; i < MAX*MAX; i++){
//  		    if(i==k-1){
//  		       ans = brr[i];
//  		    }
 		       
//  		}
 		
 		return ans;
    }
};


