package com.greatlearning.skewedtree;

//Class of the node
public class Node {
	public int data;
	public Node leftNode;
	public Node rightNode;

	public Node(int value) {
		data = value;
		leftNode = rightNode = null;
	}
}
