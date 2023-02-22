package com.tyrantlucifer.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目 <a href="https://leetcode.cn/problems/combinations/">leecode 77</a>
 */
public class Combinations {

    private static final List<List<Integer>> RESULT = new ArrayList<>();
    private static final List<Integer> PATH = new ArrayList<>();

    public static void backtrace(int n, int k, int start) {
        if (PATH.size() == k) {
            RESULT.add(new ArrayList<>(PATH));
            return;
        }
        for (int i = start; i <= n; i++) {
            PATH.add(i);
            backtrace(n, k, start + 1);
            PATH.remove(PATH.size() - 1);
        }
    }

    public static void main(String[] args) {
        backtrace(4, 2, 1);
        System.out.println(RESULT);
    }
}
