package com.company;

public class Main {

    // Write the code necessary to convert the following sequence of ListNode objects:
    //
    // list -> [1] -> [2] -> [3] /
    // Into these sequences of ListNode objects:
    //
    // list -> [2] /
    // list2 -> [1] -> [3] /
    // Assume that you are using ListNode class as defined in the textbook:
    //
    // public class ListNode {
    //    public int data;       // data stored in this node
    //    public ListNode next;  // a link to the next node in the list
    //
    //    public ListNode() { ... }
    //    public ListNode(int data) { ... }
    //    public ListNode(int data, ListNode next) { ... }
    // }

    public static void main(String[] args) {
	// write your code here

        ListNode listNodeOne = new ListNode(1);
        ListNode listNodeTwo = new ListNode(2);
        ListNode listNodeThree = new ListNode(3);

        LinkedIntList linkedIntList = new LinkedIntList("list", listNodeTwo.data);

        LinkedIntList list2 = new LinkedIntList("list2", listNodeOne.data);
        list2.add(listNodeThree.data);

        System.out.println(linkedIntList);
        System.out.println(list2);
    }
}
