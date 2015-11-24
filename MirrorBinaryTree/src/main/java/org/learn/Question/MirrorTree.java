
package org.learn.Question;

import org.learn.PrepareTree.Node;

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
}
