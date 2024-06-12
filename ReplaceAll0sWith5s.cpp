//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

int convertFive(int n);

// Driver program to test above function
int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        cout << convertFive(n) << endl;
    }
}
// } Driver Code Ends




/*you are required to complete this method*/
int convertFive(int n) {
    // Initialize result
    int result = 0;
    // Initialize decimal place
    int decimalPlace = 1;

    // Replace every zero with five
    while (n > 0) {
        // Extract the last digit of the number
        int digit = n % 10;
        // If the digit is zero, replace it with five
        if (digit == 0) {
            result += 5 * decimalPlace;
        } else {
            // Add the digit as it is
            result += digit * decimalPlace;
        }
        // Move to the next decimal place
        decimalPlace *= 10;
        // Remove the last digit from the number
        n /= 10;
    }

    return result;
}