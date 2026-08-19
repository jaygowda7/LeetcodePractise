class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int n=numbers.length-1;
      int i=0;

      while(i<n){

        if(numbers[i]+numbers[n]==target){
            return new int [] {i+1,n+1};
        }

        else if (numbers[i]+numbers[n]<target){
            i++;
        }
        else{
            n--;
        }
      }
      return new int [] {};
    }
}