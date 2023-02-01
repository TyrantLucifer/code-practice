/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tyrantlucifer.array;

/**
 * 题目 <a href="https://leetcode.cn/problems/search-insert-position/">leecode 34</a>
 */
public class SearchInsertIndex {
    public static int binarySearch(int start, int end, int[] nums, int target) {
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                // 找到值，返回索引
                return mid;
            }
        }
        // 分三种情况
        // 1.目标值小于数组中的任意一个元素，所以应该插在0处，当循环结束时，end = -1
        // 2.目标值大于数组中的任意一个元素，所以应该插在length处，当循环结束时，end = length - 1
        // 3.目标值在某一个区间，end是区间的边界，所以应该插在end后面
        return end + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,7,9};
        System.out.println(SearchInsertIndex.binarySearch(0, nums.length - 1, nums, 2));
    }
}
