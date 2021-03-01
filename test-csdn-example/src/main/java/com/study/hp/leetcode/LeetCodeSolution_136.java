package com.study.hp.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 * <p>
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class LeetCodeSolution_136 {
    /**
     * 异或
     *
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    /**
     * 数组桶排序法
     *
     * @param nums
     * @return
     */
    public static int singleNumberByArrayBucketSort(int[] nums) {
        int[] bucket = new int[50];
        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i]]++;
        }
        int result = 0;
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] == 1) {
                result = i;
            }
        }
        return result;
    }

    /**
     * map桶排序法
     *
     * @param nums
     * @return
     */
    public static int singleNumberByMapBucketSort(int[] nums) {
        Map<Integer, Integer> bucket = new HashMap<>(100);
        bucket.put(0,0);
        bucket.put(1,0);
        bucket.put(2,0);
        bucket.put(3,0);
        bucket.put(4,0);
        bucket.put(5,0);
        bucket.put(6,0);
        bucket.put(7,0);
        bucket.put(8,0);
        bucket.put(9,0);
        bucket.put(10,0);
        bucket.put(11,0);

        for (int i = 0; i < nums.length; i++) {
            int a = 0;
            a = bucket.get(nums[i]);
            a++;
            bucket.put(nums[i], a);
        }
        int result = 0;
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i) == 1) {
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumberByArrayBucketSort(nums));
        System.out.println(singleNumberByMapBucketSort(nums));
    }
}
