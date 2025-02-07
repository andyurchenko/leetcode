package edu.leetcode.problems.problem_83;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Problem_83Test {

    @Test
    void deleteDuplicates() {
        Problem_83 problem_83 = new Problem_83();
        ListNode head = problem_83.deleteDuplicates(getListNode());
        assertEquals(1, head.val);
        head = head.next;
        assertEquals(2, head.val);
        assertNull(head.next);
    }

    private ListNode getListNode() {
        ListNode head;
        ListNode current = new ListNode();
        head = current;

        current.val = 1;
        current.next = new ListNode();
        current = current.next;

        current.val = 1;
        current.next = new ListNode();
        current = current.next;

        current.val = 2;
        current.next = null;

        return head;
    }
}