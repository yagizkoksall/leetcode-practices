package practices;

import java.util.*;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
// Hashset kullanmak mantıklı.

        //HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);

        int numsLength = nums.length;
        for (int i = 0; i < numsLength - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }


//
//        Set<Integer> numSet = new HashSet<>();
//
//        return Arrays.stream(nums).anyMatch(num -> !((numSet.add(num))));



        return false;






       //int count = (int) Arrays.stream(nums).filter(item -> !set.add(item)).count();

       // return count == 0;
    }
}
