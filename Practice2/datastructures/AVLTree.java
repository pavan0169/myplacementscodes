package datastructures;


public class AVLTree 
{
	class Node
	{
		int value;
		Node left;
		Node right;
		int height;
		Node(int value)
		{
			this.value=value;
		}
		Node(){  } 
		public String toString() 
		{
			return value+" ";
		}
	}
	
	Node root;
	public AVLTree()
	{
		root=null;
	}
	
	public int calculateHeight(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		else
		{
			return 1+Math.max( (node.left!=null?node.left.height:-1),(node.right!=null?node.right.height:-1) );
		}
	}
	
	public int getBalance(Node left, Node right)
	{
		if(left==null && right==null)
		{
			return 0;
		}
		else if(left==null)
		{
			return -1*(right.height+1);
		}
		else if(right==null)
		{
			return left.height+1;
		}
		else
		{
			return left.height-right.height;
		}
	}
	
	public Node leftRotate(Node node)
	{
		Node newroot=node.right;
		node.right=node.right.left;
		newroot.left=node;
		node.height=calculateHeight(node);
		newroot.height=calculateHeight(newroot);
		return newroot;
	}
	public Node rightRotate(Node node)
	{
		Node newroot=node.left;
		node.left=node.left.right;
		newroot.right=node;
		node.height=calculateHeight(node);
		newroot.height=calculateHeight(newroot);
		return newroot;
	}
	
	public void insert(int value)
	{
		root=insert(root,value);
	}
	public Node insert(Node cnode, int value)
	{
		if(cnode==null)
		{
			Node node=new Node();
			node.value=value;
			return node;
		}
		else if(cnode.value>=value)
		{
			cnode.left=insert(cnode.left,value);
		}
		else if(cnode.value<value)
		{
			cnode.right=insert(cnode.right,value);
		}
		
		
		int balance=getBalance(cnode.left,cnode.right);
		
		if(balance>1)
		{
			int leftbalance=getBalance(cnode.left.left,cnode.left.right);
			if(leftbalance>0)
			{
				cnode=rightRotate(cnode);
			}
			else
			{
				cnode.left=leftRotate(cnode.left);
				cnode=rightRotate(cnode);
			}
		}
		else if(balance<-1)
		{
			int rightbalance=getBalance(cnode.right.right,cnode.right.left);
			if(rightbalance>0)
			{
				cnode=leftRotate(cnode);
			}
			else
			{
				cnode.right=rightRotate(cnode.right); 
				cnode=leftRotate(cnode);
			}
		}
		
		if (cnode.left != null) 
		{
			cnode.left.height=calculateHeight(cnode.left);
		}
		if (cnode.right != null) 
		{
			cnode.right.height=calculateHeight(cnode.right);
		}
		cnode.height=calculateHeight(cnode);
		return cnode;
		
	}
	
	
	public Node getminimum(Node node)
	{
		if(node.left==null)
		{
			return node;
		}
		else
		{
			return getminimum(node.left);
		}
	}
	
	public void delete(int value)
	{
		delete(root,value);
	}
	public Node delete(Node cnode, int value)
	{
		if(cnode==null)
		{
			return null;
		}
		else if(cnode.value>value)
		{
			cnode.left=delete(cnode.left, value);
		}
		else if(cnode.value<value)
		{
			cnode.right=delete(cnode.right,value);
		}
		else
		{
			if(cnode.left!=null && cnode.right!=null)
			{
				Node temp=cnode;
				Node min=getminimum(temp.right);
				cnode.value=min.value;
				cnode.right=delete(cnode.right, min.value);
			}
			else if(cnode.left!=null)
			{
				cnode=cnode.left;
			}
			else if(cnode.right!=null)
			{
				cnode=cnode.right;
			}
			else
			{
				cnode=null;
			}
			return cnode;
		}
		
		
		int balance=getBalance(cnode.left,cnode.right);
		
		if(balance>1)
		{
			int leftbalance=getBalance(cnode.left.left,cnode.left.right);
			if(leftbalance>0)
			{
				cnode=rightRotate(cnode);
			}
			else
			{
				cnode.left=leftRotate(cnode.left);
				cnode=rightRotate(cnode);
			}
		}
		else if(balance<-1)
		{
			int rightbalance=getBalance(cnode.right.right,cnode.right.left);
			if(rightbalance>0)
			{
				cnode=leftRotate(cnode);
			}
			else
			{
				cnode.right=rightRotate(cnode.right);
				cnode=leftRotate(cnode);
			}
		}
		
		if (cnode.left != null) 
		{
			cnode.left.height=calculateHeight(cnode.left);
		}
		if (cnode.right != null) 
		{
			cnode.right.height=calculateHeight(cnode.right);
		}
		cnode.height=calculateHeight(cnode);
		return cnode;
	
	}
	
	public void preorderTraversal(Node node)
	{
		if(node==null)
		{
			return;
		}
		System.out.print(node);
		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}
	public void inorderTraversal(Node node)
	{
		if(node==null)
		{
			return;
		}
		inorderTraversal(node.left);
		System.out.print(node);
		inorderTraversal(node.right);
	}
	
	public void postorderTraversal(Node node)
	{
		if(node==null)
		{
			return;
		}
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.print(node);
	}

}
