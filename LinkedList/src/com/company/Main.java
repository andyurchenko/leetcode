package com.company;

public class Main {

    public static void main(String[] args) {
//     MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.addAtHead(3);
//        myLinkedList.addAtTail(4);
//        myLinkedList.addAtHead(2);
//        myLinkedList.addAtTail(5);
//        myLinkedList.addAtHead(1);
//        myLinkedList.addAtTail(6);
//        myLinkedList.addAtIndex(6, 7);
//        System.out.println(myLinkedList.get(4));
//
//        myLinkedList.addAtHead(7);
//        myLinkedList.addAtTail(0);
//        myLinkedList.deleteAtIndex(1);
//        myLinkedList.addAtTail(5);
//        myLinkedList.addAtIndex(1, 1);
//        myLinkedList.addAtIndex(2, 6);
//        myLinkedList.deleteAtIndex(2);
//        myLinkedList.deleteAtIndex(1);
//        myLinkedList.addAtTail(7);
//        myLinkedList.addAtIndex(1, 7);
//        myLinkedList.addAtTail(6);
//
//        MyLinkedList.Node currentNode = myLinkedList.head;
//        while (currentNode != null){
//            System.out.print(currentNode.value + ", ");
//            currentNode = currentNode.next;
//
//        }
        LinkedListCycle linkedListCycle = new LinkedListCycle();
//
//        ListNode nodeC1 = new ListNode(8);
//        ListNode nodeC2 = new ListNode(4);
//        ListNode nodeC3 = new ListNode(5);
//        nodeC1.next = nodeC2;
//        nodeC2.next = nodeC3;
//        nodeC3.next = null;
//
//        ListNode nodeA1 = new ListNode(4);
//        ListNode nodeA2 = new ListNode(1);
//        nodeA1.next = nodeA2;
//        nodeA2.next = nodeC1;
//
//        ListNode nodeB1 = new ListNode(5);
//        ListNode nodeB2 = new ListNode(6);
//        ListNode nodeB3 = new ListNode(1);
//        nodeB1.next = nodeB2;
//        nodeB2.next = nodeB3;
//        nodeB3.next = nodeC1;
//
//        linkedListCycle.getIntersectionNode(nodeA1, nodeB1);
        ListNode nodeC1 = new ListNode(1);
        ListNode nodeC2 = new ListNode(2);
        nodeC1.next = nodeC2;
        linkedListCycle.removeNthFromEnd(nodeC1, 2);

//        System.out.print(linkedListCycle.detectCycle(node0).val);
    }
}
