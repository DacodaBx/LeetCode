public class TwoSum {
    public static void main(String[] args){
        
    }
    
        public int[] twoSum(int[] nums, int target) {
             
            for(int i = 0;  i < nums.length; i++ ){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] + nums[j] == target){
                        return new int[]{i, j};
                    }
                }
            }
                
           return nums;     
        }  
    }

    /*EXPLANATION: int the twoSum method you have two parameters. An integer array
      of numbers and a target number. What you are seeking are the two numbers in the 
      int array that will add together to make the target. 
      First: in order to look at two numbers at the sametime you will have to traverse 
      through the int array using two pointers, both starting from the left traversing
      through to the right of the int array.  "int i" and "int j" will be the pointers
      "int i" beginning at index 0 while "int j" begins at index 1. Therefore the two pointers 
      are next to eachother.  As "int i" is at index 0 we will ask if "i" added to "j"
      will eaqual the target. If so put them in a new array.  Now give up the answer by
      returning the nums; Which is the initial array but now it only contains two numbers
      from original array that add up to the target*/

