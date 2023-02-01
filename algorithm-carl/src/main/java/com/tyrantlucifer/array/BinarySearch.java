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
 * 题目 <a href="https://leetcode.cn/problems/binary-search/">leecode 704</a>
 */
public class BinarySearch {

    /**
     * 递归二分查找
     * @param start 开始索引
     * @param end 结束索引
     * @param nums 查找数组
     * @param target 查找目标
     * @return 索引
     */
    public static int binarySearch1(int start, int end, int[] nums, int target) {
        if (end == -1) {
            return end;
        }
        if (start == end) {
            if (nums[start] == target) {
                return start;
            }
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] > target) {
            return binarySearch1(start, mid - 1, nums, target);
        } else if (nums[mid] < target) {
            return binarySearch1(mid + 1, end, nums, target);
        }
        return mid;
    }

    /**
     * 非递归二分查找
     * @param start 开始索引
     * @param end 结束索引
     * @param nums 查找数组
     * @param target 查找目标
     * @return 索引
     */
    public static int binarySearch2(int start, int end, int[] nums, int target) {
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println(BinarySearch.binarySearch1(0, nums.length - 1, nums, 6));
        System.out.println(BinarySearch.binarySearch2(0, nums.length - 1, nums, 6));
    }
}
