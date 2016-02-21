package org.learn.Client;

import org.learn.Question.MirrorTree;
import org.learn.Question.Node;

public class App {
	public static void main(String[] args) {
		// root level 0
		Node A = Node.createNode(55);
		// Level 1
		Node B = Node.createNode(50);
		Node C = Node.createNode(40);
		// Level 2
		Node D = Node.createNode(25);
		Node E = Node.createNode(80);
		Node F = Node.createNode(45);
		Node G = Node.createNode(90);

		// connect Level 0 and 1
		A.left = B;
		A.right = C;
		// connect level 1 and level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
		
		System.out.println("Binary Tree : ");
		MirrorTree.printTree(A);
		MirrorTree.mirrorTree(A);
		System.out.println("Mirror Binary Tree : ");
		MirrorTree.printTree(A);
	}
}
