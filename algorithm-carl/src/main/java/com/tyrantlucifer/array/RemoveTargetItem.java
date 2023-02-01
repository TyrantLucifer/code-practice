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
 * 题目 <a href="https://leetcode.cn/problems/remove-element/">leecode 27</a>
 */
public class RemoveTargetItem {
    public static int remove(int[] nums, int target) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;
                res--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(RemoveTargetItem.remove(nums, 2));
    }

}
