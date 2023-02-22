package com.tyrantlucifer.backtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题目 <a href="https://leetcode.cn/problems/combination-sum/">leecode 39</a>
 */
public class CombinationSum {

    private static final List<List<Integer>> RESULT = new ArrayList<>();
    private static final List<Integer> PATH = new ArrayList<>();

    public static void backtrace(int[] nums, int sum, int start) {
        if (PATH.stream().reduce(0, Integer::sum) > sum) {
            return;
        }
        if (PATH.stream().reduce(0, Integer::sum) == sum) {
            RESULT.add(new ArrayList<>(PATH));
        }
        for (int i = start; i < nums.length; i++) {
            PATH.add(nums[i]);
            backtrace(nums, sum, i);
            PATH.remove(PATH.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 6, 7};
        backtrace(nums, 7, 0);
        System.out.println(RESULT);
    }
}
