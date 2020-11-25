package trees;

public class BinaryTreeArraysMain 
{
	public static void main(String[] args)
	{
		BinaryTreeArrays bta=new BinaryTreeArrays(10);
		bta.insert(14);
		bta.insert(7);
		bta.insert(4);
		bta.insert(74);
		bta.insert(81);
		bta.insert(2);
		bta.insert(32);
		System.out.println("inorder traversal");
		bta.inorderTraversal(1);
		System.out.println();
		System.out.println("preorder traversal");
		bta.preorderTraversal(1);
		System.out.println();
		System.out.println("postorder traversal");
		bta.postorderTraversal(1);
		System.out.println();
		System.out.println("levelorder traversal");
		bta.levelorderTraversal();
		System.out.println();
		bta.search(81);
		bta.search(77);
		bta.delete(81);
		System.out.println("levelorder traversal");
		bta.levelorderTraversal();
		System.out.println();
		bta.delete(14);
		System.out.println("levelorder traversal");
		bta.levelorderTraversal();
		System.out.println();
	}
}
