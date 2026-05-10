package questions;

// This optimized approach uses prefix sums to avoid recomputing sums on every removal.
// It first calculates the total sum of elements at even and odd indices (right side). Then, as it iterates through the array, it simulates the removal of each element by adjusting the right sums accordingly.
// After removal, the indices to the right shift, so the roles of even and odd positions flip. If the updated left and right sums match (considering the index shift), the index is counted as valid.

// Step By Step Implementations:

// Precompute the total sum of even-indexed elements (rightEvenSum) and odd-indexed elements (rightOddSum).
// Initialize leftEvenSum and leftOddSum to 0.
// Iterate through each index i in the array.
// Subtract the current element from the right-side sum based on index parity.
// Since removing the element shifts right-side indices, swap parity when comparing sums.
// Check if leftOddSum + rightEvenSum equals leftEvenSum + rightOddSum.
// If equal, increment the count.
// Add the current element to the left-side sum based on its original parity.
public class EvenOddArray {
    static int cntWay(int[] nums){
        int n=nums.length;
        int res=0;

        int rightOddSum=0;
        int rightEvenSum=0;
        for(int i=0;i<n;i++){
            if(i%2==0)
                rightEvenSum+=nums[i];
            else
                rightOddSum+=nums[i];
        }
        int leftEvenSum=0;
        int leftOddSum=0;
        for(int i=0;i<n;i++){
            if(i%2==0)
                rightEvenSum-=nums[i];
            else
                rightOddSum-=nums[i];

            if(leftOddSum+rightEvenSum==leftEvenSum+rightOddSum)
                res++;

            if(i%2==0)
                leftEvenSum+=nums[i];
            else
                leftOddSum+=nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
         int[] arr = {1, 1, 1};
        System.out.println(cntWay(arr));
    }
}
