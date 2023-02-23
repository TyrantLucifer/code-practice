package com.tyrantlucifer.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目 <a href="https://leetcode.cn/problems/permutations/">leecode 46</a>
 */
public class Permutations {

    private static final List<List<Integer>> RESULT = new ArrayList<>();
    private static final List<Integer> PATH = new ArrayList<>();

    public static void backtrace(int[] nums, boolean[] used, int num) {
        if (PATH.size() == num) {
            RESULT.add(new ArrayList<>(PATH));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            PATH.add(nums[i]);
            used[i] = true;
            backtrace(nums, used, num);
            PATH.remove(PATH.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        boolean[] used = new boolean[]{false, false, false};
        backtrace(nums, used, 3);
        System.out.println(RESULT);
    }
}
