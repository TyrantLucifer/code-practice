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

public class LinkedListUtils {

    private LinkedListUtils() {}

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node fromItems(int ...elements){
        Node head = new Node(elements[0]);
        Node temp = head;
        for (int i = 1; i < elements.length; i++) {
            Node node = new Node(elements[i]);
            temp.next = node;
            temp = node;
        }
        return head;
    }

    public static void printLinkedList(Node head) {
        if (Objects.nonNull(head)) {
            while (head != null) {
                System.out.print(head.data + "->");
                head = head.next;
            }
        }
        System.out.println("\b\b");
    }
}
