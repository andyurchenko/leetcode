package com.company;

import java.util.List;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode slowIterator = head;
        ListNode fastIterator = head.next;
        while(fastIterator.next != null) {
            if(fastIterator == slowIterator) {
                return true;
            }
            fastIterator = fastIterator.next;
            if(fastIterator == slowIterator) {
                return true;
            }
            if(fastIterator.next == null) {
                break;
            }
            fastIterator = fastIterator.next;
            if(fastIterator == slowIterator) {
                return true;
            }
            slowIterator = slowIterator.next;
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                System.out.println("fast == slow " + slow.val);
                ListNode slow2 = head;
                while (slow2 != slow) {
                    slow2 = slow2.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthOfList_A = getLengthOfList(headA);
        int lengthOfList_B = getLengthOfList(headB);

        if(lengthOfList_A > lengthOfList_B) {
            headA = passNodes(headA, lengthOfList_A - lengthOfList_B);
        } else if(lengthOfList_A < lengthOfList_B) {
            headB = passNodes(headB, lengthOfList_B - lengthOfList_A);
        }
        return  findIntersectionNode(headA, headB);
    }

    private int getLengthOfList(ListNode startPointToCount) {
        int lengthOfList = 0;
        while(startPointToCount != null) {
            lengthOfList++;
            startPointToCount = startPointToCount.next;
        }
        return lengthOfList;
    }

    private ListNode findIntersectionNode(ListNode listA, ListNode listB) {
        while (listA != listB) {
            listA = listA.next;
            listB = listB.next;
        }

        return listA;
    }

    private ListNode passNodes(ListNode list, int numberOfNodesToPass) {
        for(int i = 0; i < numberOfNodesToPass; i++) {
            list = list.next;
        }
        return list;
    }

    public ListNode removeNthFromEnd(ListNode head, int positionOfElementFromRightToDelete) {
        if(head == null || head.next == null) {
            return null;
        }
        
        ListNode rightPointer = head;
        ListNode leftPointer = head;

        int numberOfElementsBetweenLeftAndRightPointers = 0;
        while(rightPointer.next != null && numberOfElementsBetweenLeftAndRightPointers < positionOfElementFromRightToDelete) {
            rightPointer = rightPointer.next;
            numberOfElementsBetweenLeftAndRightPointers++;
        }

        if(numberOfElementsBetweenLeftAndRightPointers != positionOfElementFromRightToDelete) {
            head = leftPointer.next;
        } else {
            while (rightPointer.next != null) {
                rightPointer = rightPointer.next;
                leftPointer = leftPointer.next;
            }
            if(leftPointer.next.next != null) {
                leftPointer.next = leftPointer.next.next;
            } else {
                leftPointer.next = null;
            }
        }
        return head;
    }

    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode nodeAttachTo = head;
        ListNode firstNodeAfterCurrentNode = null;
        ListNode secondNodeAfterCurrentNode = null;

        if(currentNode != null) {
            while(currentNode.next != null) {
                firstNodeAfterCurrentNode = currentNode.next;
                if(firstNodeAfterCurrentNode.next != null) {
                    secondNodeAfterCurrentNode = firstNodeAfterCurrentNode.next;
                } else {
                    secondNodeAfterCurrentNode = null;
                }
                firstNodeAfterCurrentNode.next = nodeAttachTo;
                nodeAttachTo = firstNodeAfterCurrentNode;
                currentNode.next = secondNodeAfterCurrentNode;
            }
            return nodeAttachTo;
        } else {
            return null;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head != null) {
            ListNode currentNode = head;
            while(currentNode != null && currentNode.val == val) {
                currentNode = currentNode.next;
            }
            head = currentNode;
            ListNode previousNode = currentNode;
            while(currentNode != null) {
                if(currentNode.val == val) {
                    previousNode.next = currentNode.next;
                    currentNode = currentNode.next;
                } else {
                    previousNode = currentNode;
                    currentNode = currentNode.next;
                }
            }
            return head;
        } else {
            return null;
        }
    }
}
