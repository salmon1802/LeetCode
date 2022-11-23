import com.sun.org.apache.xml.internal.serialize.OutputFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class No_15_threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        int len = nums.length;
        if (len < 3 || nums[len - 1] < 0 || nums[0] > 0) {
            return res;
        }
        /*
          定义三个指针，第一个指针i指向第一个元素，负责遍历数组，二次遍历时如果和一次遍历元素相同则跳过
            第二个指针left指向i + 1个元素，第三个指针right指向len - 1最后的元素
            如果三数相加大于0则right左移，如果小于0则left右移
            若等于0则left与right跳过相同元素继续寻找
            当i指向的元素大于0时循环结束
         */

        for (int i = 0; i < len && nums[i] <= 0; i++) {
            //todo 这里跳过相同元素处理，不能处理为：到达相同元素的最后一个，这样会损失很多组合，
            // 应该在第一个进行循环，找到后再移动到下一个相同数组的第一个元素
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int lef = i + 1;
            int rig = len - 1;
            while (lef < rig) {
                int tmp = nums[i] + nums[lef] + nums[rig];
                if (tmp > 0) {
                    rig--;
                } else if (tmp < 0) {
                    lef++;
                } else {
                    List<Integer> threeNum = new ArrayList<>();
                    threeNum.add(nums[i]);
                    threeNum.add(nums[lef]);
                    threeNum.add(nums[rig]);
                    Collections.sort(threeNum);
                    res.add(threeNum);

                    while (lef < rig) {
                        if (nums[lef + 1] != nums[lef]) {
                            lef++;
                            break;
                        } else {
                            lef++;
                        }
                    }

                    while (lef < rig) {
                        if (nums[rig - 1] != nums[rig]) {
                            rig--;
                            break;
                        } else {
                            rig--;
                        }
                    }

                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        No_15_threeSum fun = new No_15_threeSum();
        int[] nums = new int[]{0,0,0};
        System.out.println(fun.threeSum(nums));
    }
}
