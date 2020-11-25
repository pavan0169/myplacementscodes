package trees;

public class BinarySearchTreeMain 
{
	public static void main(String[] args)
	{
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(100);
		bst.insert(80);
		bst.insert(200);
		bst.insert(70);
		bst.insert(90);
		bst.insert(150);
		bst.insert(300);
		bst.insert(250);
		bst.insert(400);
		bst.insert(50);
		bst.insert(40);
		bst.insert(60);

		System.out.println();
		System.out.print("PRE ORDER:");
		bst.preorderTraversal(bst.root);
		
		System.out.println();
		System.out.print("IN ORDER:");
		bst.inorderTraversal(bst.root);
		
		System.out.println();
		System.out.print("POST ORDER:");
		bst.postorderTraversal(bst.root);
		System.out.println();
		System.out.print("deleting 150:");
		bst.delete(150);
		System.out.println();
		System.out.print("IN ORDER:");
		bst.inorderTraversal(bst.root);
		
		System.out.println();
		System.out.print("deleting 60:");
		bst.delete(60);
		System.out.println();
		System.out.print("IN ORDER:");
		bst.inorderTraversal(bst.root);
		
		System.out.println();
		System.out.print("deleting 300:");
		bst.delete(300);
		System.out.println();
		System.out.print("IN ORDER:");
		bst.inorderTraversal(bst.root);
		
		System.out.println();
		System.out.print("deleting 100:");
		bst.delete(100);
		System.out.println();
		System.out.print("IN ORDER:");
		bst.inorderTraversal(bst.root);
		System.out.println();
		bst.search(200);
		
	}
}
