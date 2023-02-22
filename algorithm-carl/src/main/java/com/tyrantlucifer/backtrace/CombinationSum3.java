package com.tyrantlucifer.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目 <a href="https://leetcode.cn/problems/combination-sum-iii/">leecode 216</a>
 */
public class CombinationSum3 {

    private static final List<List<Integer>> RESULT = new ArrayList<>();
    private static final List<Integer> PATH = new ArrayList<>();

    public static void backtrace(int n, int k, int start) {
        if (PATH.size() == n && PATH.stream().reduce(0, Integer::sum) == k) {
            RESULT.add(new ArrayList<>(PATH));
            return;
        }
        for (int i = start; i <= 9; i++) {
            PATH.add(i);
            backtrace(n, k, i + 1);
            PATH.remove(PATH.size() - 1);
        }
    }

    public static void main(String[] args) {
        backtrace(3, 7, 1);
        System.out.println(RESULT);
    }
}
