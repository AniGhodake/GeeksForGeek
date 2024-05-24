//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
	public:
	   void findSubsequences(string s, string subseq, int index, vector<string> &result) {
        if (index == s.length()) {
            if (!subseq.empty()) {
                result.push_back(subseq);
            }
            return;
        }
        // Exclude current character
        findSubsequences(s, subseq, index + 1, result);

        // Include current character
        subseq += s[index];
        findSubsequences(s, subseq, index + 1, result);
    }

    vector<string> AllPossibleStrings(string s){
        vector<string> result;
        findSubsequences(s, "", 0, result);
        sort(result.begin(), result.end());
        return result;
    }
};


//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		string s;
		cin >> s;
		Solution ob;
		vector<string> res = ob.AllPossibleStrings(s);
		for(auto i : res)
			cout << i <<" ";
		cout << "\n";

	}
	return 0;
}
// } Driver Code Ends