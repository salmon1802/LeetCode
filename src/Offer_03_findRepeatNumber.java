import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Offer_03_findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashset.contains(nums[i])) {
                return nums[i];
            } else {
                hashset.add(nums[i]);
            }
        }
        return -1;
    }
}
