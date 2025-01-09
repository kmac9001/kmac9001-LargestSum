
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int a = nums.get(0);
        int index = 0;
        int b = nums.get(0);
        for(int x = 0; x < nums.size(); x++){
            if(nums.get(x) > a){
                a = nums.get(x);
                index = x;
            }
        }
        nums.remove(index);
        for(int x = 0; x < nums.size(); x++){
            if(nums.get(x) > b){
                b = nums.get(x);
            }
        }
        return a+b;
    }
}