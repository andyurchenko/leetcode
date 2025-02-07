package edu.leetcode.problems.problem_83;

import java.util.Arrays;
import java.util.HashSet;

import edu.leetcode.problems.problem_83.ListNode;

public class Problem_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            if (current.next != null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                    continue;
                }
            }

            current = current.next;
        }

        return head;
    }



    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev;
        ListNode current = head;
        ListNode next;
        HashSet<Integer> set = new HashSet<>();
        while (current != null) {
            set.add(current.val);
            current = current.next;
        }

        int[] arr = new int[set.size()];
        int i = 0;
        for (int e : set) {
            arr[i++] = e;
        }
        arr = Arrays.stream(arr).sorted().toArray();

        current = new ListNode();
        head = current;
        for (i = 0; i < arr.length; i++) {
            current.val = arr[i];
            if (i == arr.length - 1) {
                current.next = null;
            } else {
                current.next = new ListNode();
                current = current.next;
            }

        }

        return head;
    }
}


