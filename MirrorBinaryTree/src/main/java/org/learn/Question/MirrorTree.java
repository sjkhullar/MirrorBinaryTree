
package org.learn.Question;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {
	public static void mirrorTree(Node root) {
		if(null == root) {
			return;
		}
		mirrorTree(root.left);
		mirrorTree(root.right);
		Node swapNode = root.left;
		root.left = root.right;
		root.right = swapNode;
		return;
	}
	
	public static void printTree(Node root) {
		if (root == null) {
			System.out.println("Tree is empty");
			return ;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			Node node = queue.poll();			
			System.out.printf("%d ",node.data);		
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		System.out.println("");	
		return;
	}
}
