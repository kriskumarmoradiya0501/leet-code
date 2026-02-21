import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // hashset we are using this cause it hase one methos call contains which will simply return true if any of value is exist in the container
        HashSet<Integer> seen = new HashSet<>();
        // here nus array is goes to hashset container named seen
        for(int num : nums){
          // this conditon is return true or false after chacking the number is present of not in the perticular hashset container
            if(seen.contains(num)){\
              // as the contains method returns true it will return true and stop the execution 
                return true;
            }
          // this enters num value in hashset container
            seen.add(num);
        }
      // if any value is not repeating it will simply return false
        return false;
    }
}
// yes the time complexity is n we can solve it by O(1)
import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 1. Array ne chadhata kram ma sort karo
        Arrays.sort(nums);
        
        // 2. Loop feravo (last element thi ek step pela sudhi javanu, jethi array out of bounds error na aave)
        for (int i = 0; i < nums.length - 1; i++) {
            
            // 3. Jo current number ane eno next number sarakho hoy, toh duplicate che
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        
        // 4. Koi duplicate na malyo
        return false;
    }
}
