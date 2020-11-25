package trees;
import node.*;
public class BinarySearchTree 
{
	BNode root;
	
	public BinarySearchTree()
	{
		root=null;
	}
	
	public void insert(int value)
	{
		root=insert(root,value);
	}
	
	public BNode insert(BNode cnode, int value)
	{
		if(cnode==null)
		{
			BNode node=new BNode();
			node.value=value;
			return node;
		}
		else if(cnode.value<=value) 
		{
			cnode.right=insert(cnode.right,value);
			return cnode;
		}
		else
		{
			cnode.left=insert(cnode.left,value);
			return cnode;
		}
	}
	
	
	public void delete(int value)
	{
		delete(root,value);
	}
	
	public BNode delete(BNode root, int value)
	{
		if (root == null) {
			System.out.println("Value not found in BST");
			return null;
		}
		else if(value<root.value)
		{
			root.left=delete(root.left,value);
		}
		else if(value>root.value)
		{
			root.right=delete(root.right,value);
		}
		else          //if current node is the node to be deleted then 3 cases 1)node has no child 2) node has one child 3)node has 2 child
		{
			if(root.getLeft() != null && root.getRight() != null)     //case 3
			{
				BNode temp=root;
				BNode min=minimumNode(temp.right);
				root.value=min.value;
				root.right=delete(root.right,min.value);
			}
			else if (root.getLeft() != null)
			{                                                           // if node has only left child
				root = root.getLeft();
			} 
			else if (root.getRight() != null) 
			{                                                             // if node has only right child
				root = root.getRight();
			}
			else
			{                                                           //if node do not have child (Leaf node)
				root = null; 
			}
		}
		return root; 
	}
	
	
	public static BNode minimumNode(BNode root) {
		if (root.getLeft() == null)
			return root;
		else {
			return minimumNode(root.getLeft());
		}
	}
	
	public void preorderTraversal(BNode node)
	{
		if(node==null)
		{
			return;
		}
		System.out.print(node);
		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}
	public void inorderTraversal(BNode node)
	{
		if(node==null)
		{
			return;
		}
		inorderTraversal(node.left);
		System.out.print(node);
		inorderTraversal(node.right);
	}
	
	public void postorderTraversal(BNode node)
	{
		if(node==null)
		{
			return;
		}
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.print(node);
	}
	
	public void search(int value)
	{
		search(root,value);
	}
	
	public BNode search(BNode croot, int value)
	{
		if(croot==null)
		{
			return null;
		}
		else if (croot.getValue() == value) 
		{
			System.out.println("Value: " + value + " found in BST.");
			return croot;
		} 
		else if (value < croot.getValue()) 
		{
			return search(croot.getLeft(), value);
		} 
		else 
		{
			return search(croot.getRight(), value);
		}
	}
}
