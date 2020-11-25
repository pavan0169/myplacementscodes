package datastructures;

public class AVLMain 
{
	public static void main(String[] args)
	{
		AVLTree avl=new AVLTree();
		
		for(int i=1; i<16; i++)
		{
			avl.insert(i*10);
		}
		
		System.out.println();
		System.out.print("PRE ORDER:");
		avl.preorderTraversal(avl.root);
		
		System.out.println();
		System.out.print("IN ORDER:");
		avl.inorderTraversal(avl.root);
		
		System.out.println();
		System.out.print("POST ORDER:");
		avl.postorderTraversal(avl.root); 
		System.out.println();
		
		avl.delete(40);
		System.out.println();
		System.out.print("PRE ORDER:");
		avl.preorderTraversal(avl.root);
		System.out.println();
		System.out.print("IN ORDER:");
		avl.inorderTraversal(avl.root);
		
		
		System.out.println();
		avl.delete(50);
		System.out.println();
		System.out.print("PRE ORDER:");
		avl.preorderTraversal(avl.root);
		System.out.println();
		System.out.print("IN ORDER:");
		avl.inorderTraversal(avl.root);
		
		System.out.println();
		avl.delete(60);
		System.out.println();
		System.out.print("PRE ORDER:");
		avl.preorderTraversal(avl.root);
		System.out.println();
		System.out.print("IN ORDER:");
		avl.inorderTraversal(avl.root);

	}
}
