package com.tyrantlucifer.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目 <a href="https://leetcode.cn/problems/permutations/">leecode 46</a>
 */
public class Permutations {

    private static final List<List<Integer>> RESULT = new ArrayList<>();
    private static final List<Integer> PATH = new ArrayList<>();

    public static void backtrace(int[] nums, int num, int start) {
        if (PATH.size() == num) {
            RESULT.add(new ArrayList<>(PATH));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            PATH.add(nums[i]);
            backtrace(nums, num, i + 1);
            PATH.remove(PATH.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        backtrace(nums, 3, 0);
        System.out.println(RESULT);
    }
}
