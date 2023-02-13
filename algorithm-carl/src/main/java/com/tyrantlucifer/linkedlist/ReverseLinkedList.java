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
 * 题目 <a href="https://leetcode.cn/problems/reverse-linked-list/">leecode 206</a>
 */
public class ReverseLinkedList {

    public static LinkedListUtils.Node reverse(LinkedListUtils.Node head) {
        if (Objects.isNull(head)) {
            return null;
        }
        if (Objects.isNull(head.next)) {
            return head;
        }
        LinkedListUtils.Node pre = null;
        LinkedListUtils.Node current = head;
        while (Objects.nonNull(current.next)) {
            LinkedListUtils.Node temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
        }
        current.next = pre;
        return current;
    }

    public static void main(String[] args) {
        LinkedListUtils.Node head = LinkedListUtils.fromItems(1, 2, 3, 4);
        LinkedListUtils.Node newHead = reverse(head);
        LinkedListUtils.printLinkedList(newHead);
    }
}
