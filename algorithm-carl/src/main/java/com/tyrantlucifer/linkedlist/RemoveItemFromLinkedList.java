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

package com.tyrantlucifer.linkedlist;

import java.util.Objects;

/**
 * 题目 <a href="https://leetcode.cn/problems/remove-linked-list-elements/">leecode 203</a>
 */
public class RemoveItemFromLinkedList {

    public static LinkedListUtils.Node removeItem(LinkedListUtils.Node head, int target) {
        if (Objects.nonNull(head)) {
            LinkedListUtils.Node current = head.next;
            LinkedListUtils.Node pre = head;
            while (Objects.nonNull(current.next)) {
                if (current.data == target) {
                    pre.next = current.next;
                    pre = pre.next;
                    current = pre.next;
                } else {
                    pre = pre.next;
                    current = current.next;
                }
            }
            if (current.data == target) {
                pre.next = current.next;
            }
            if (head.data == target) {
                return head.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedListUtils.Node head = LinkedListUtils.fromItems(1, 2, 3, 1);
        LinkedListUtils.Node newHead = removeItem(head, 1);
        LinkedListUtils.printLinkedList(newHead);
    }
}
