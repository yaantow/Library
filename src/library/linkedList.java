/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.LinkedList;

/**
 *
 * @author bolly
 */
public class linkedList {
  

	Node head; // head of list 

	// Linked list Node. 
	// This inner class is made static 
	// so that main() can access it 
	static class Node { 

		int data; 
		Node next; 

		// Constructor 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
	
	// Method to insert a new node 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
		// Create a new node with given data 
		Node new_node = new Node(data); 
		new_node.next = null; 
                

		// If the Linked List is empty, 
		// then make the new node as head 
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			// Else traverse till the last node 
			// and insert the new_node there 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			// Insert the new_node at last node 
			last.next = new_node; 
		} 

		// Return the list by head 
		return list; 
	} 
	
	// Method to print the LinkedList. 
	public static void printList(LinkedList list) 
	{ 
		Node currNode = list.head; 

		System.out.print("LinkedList: "); 

		// Traverse through the LinkedList 
		while (currNode != null) { 
			// Print the data at current node 
			System.out.print(currNode.data + " "); 

			// Go to next node 
			currNode = currNode.next; 
		} 
		
		System.out.println(); 
	} 

	// **************DELETION BY KEY************** 

	// Method to delete a node in the LinkedList by KEY 
	public static LinkedList deleteByKey(LinkedList list, int key) 
	{ 
		// Store head node 
		Node currNode = list.head, prev = null; 

		// 
		// CASE 1: 
		// If head node itself holds the key to be deleted 

		if (currNode != null && currNode.data == key) { 
			list.head = currNode.next; // Changed head 

			// Display the message 
			System.out.println(key + " found and deleted"); 

			// Return the updated List 
			return list; 
		} 

		// 
		// CASE 2: 
		// If the key is somewhere other than at head 
		// 

		// Search for the key to be deleted, 
		// keep track of the previous node 
		// as it is needed to change currNode.next 
		while (currNode != null && currNode.data != key) { 
			// If currNode does not hold key 
			// continue to next node 
			prev = currNode; 
			currNode = currNode.next; 
		} 

		// If the key was present, it should be at currNode 
		// Therefore the currNode shall not be null 
		if (currNode != null) { 
			// Since the key is at currNode 
			// Unlink currNode from linked list 
			prev.next = currNode.next; 

			// Display the message 
			System.out.println(key + " found and deleted"); 
		} 

		// 
		// CASE 3: The key is not present 
		// 

		// If key was not present in linked list 
		// currNode should be null 
		if (currNode == null) { 
			// Display the message 
			System.out.println(key + " not found"); 
		} 

		// return the List 
		return list; 
	} 
}
	
 


