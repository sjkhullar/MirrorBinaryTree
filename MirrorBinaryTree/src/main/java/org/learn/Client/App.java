package org.learn.Client;

import org.learn.PrepareTree.Node;
import org.learn.PrepareTree.Tree;
import org.learn.Question.MirrorTree;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {		
		int[] data = {50, 150, 25, 80, 125, 160};
    	Tree tree = new Tree();
    	Node root = tree.createNode(100);
    	for(int i : data ) {
    		tree.insert(root, i );
    	}   
    	System.out.println("Binary Tree");
    	tree.printTree(root);    	
    	MirrorTree.mirrorTree(root);
    	System.out.println("Mirror Binary Tree");
    	tree.printTree(root);
    }
}
