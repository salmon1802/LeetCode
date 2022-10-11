public class No_1035_Disjoint_lines {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
//        if (nums1.length == 0 || nums2.length == 0) {
//            return 0;
//        }
//
//        //*
//        // 思路非常简单，就是双指针遍历数组，如果上下匹配成功，
//        // 则上层up到下一个位置，下层不动接着遍历
//        int flag = 0;
//        int res = 0;
//        int temp = 0;
//        for (int i = 0; i < nums1.length; i++) { // 总遍历次数
//            for (int up = i; up < nums1.length; up++) {
//                for (int down = flag; down < nums2.length; down++) {
//                    if (nums1[up] == nums2[down]) {
//                        flag = down + 1;
//                        temp++;
//                        break;
//                    }
//                }
//            }
//            if (temp > res) {
//                res = temp;
//            }
//            temp = 0;
//            flag = 0;
//        }
//        return res;

        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            int num1 = nums1[i - 1];
            for (int j = 1; j <= n; j++) {
                int num2 = nums2[j - 1];
                if (num1 == num2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }


    public static void main(String[] args) {
        No_1035_Disjoint_lines no_1035_disjoint_lines = new No_1035_Disjoint_lines();
        int[] nums1 = {1,1,2,1,2};
        int[] nums2 = {1,3,2,3,1};
        System.out.println(no_1035_disjoint_lines.maxUncrossedLines(nums1,nums2));
    }
}
