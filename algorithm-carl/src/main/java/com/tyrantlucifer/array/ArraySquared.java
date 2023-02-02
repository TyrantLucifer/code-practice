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

import java.util.Arrays;

/**
 * 题目 <a href="https://leetcode.cn/problems/squares-of-a-sorted-array/">leecode 977</a>
 */
public class ArraySquared {
    public static int[] arraySquared(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int index = nums.length - 1;
        int[] res = new int[nums.length];
        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                res[index--] = nums[i] * nums[i];
                i++;
            } else {
                res[index--] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-4, 1, 2, 4, 6};
        System.out.println(Arrays.toString(ArraySquared.arraySquared(nums)));
    }
}
