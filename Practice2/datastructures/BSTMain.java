package datastructures;

public class BSTMain {
	public static void main(String[] args) {
		BST bst=new BST();
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
		
		System.out.print("PRE ORDER:");
		bst.preorderTraversal(bst.root);
		
		System.out.println();
		System.out.print("IN ORDER:");
		bst.inorderTraversal(bst.root);
		
		System.out.println();
		System.out.print("POST ORDER:");
		bst.postorderTraversal(bst.root);
		
		System.out.println();
		System.out.print("deleting 70:");
		bst.delete(70);
		System.out.println();
		System.out.print("IN ORDER:");
		bst.inorderTraversal(bst.root);
		
		System.out.println();
		System.out.println("searching 300:");
		bst.search(300);
		System.out.println();
	}
}
