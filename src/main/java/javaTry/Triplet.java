package javaTry;

public class Triplet {
    //You are given a 0-indexed integer array nums.
    //
    //Return the maximum value over all triplets of indices (i, j, k) such that i < j < k. If all such triplets have a negative value, return 0.
    //
    //The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [12,6,1,2,7]
    //Output: 77
    //Explanation: The value of the triplet (0, 2, 4) is (nums[0] - nums[2]) * nums[4] = 77.
    //It can be shown that there are no ordered triplets of indices with a value greater than 77.
    public static void main(String[] args) {
        System.out.println(maximumTripletValue(new int[]{
                1000000,1,1000000
        }));
    }
    public static long maximumTripletValue(int[] nums) {
        long sum=0;
        long maxSum=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    sum=(long)(nums[i]-nums[j])*(long)nums[k];
                    maxSum=Math.max(sum,maxSum);
                }
            }
        }
        return maxSum;
    }
}

