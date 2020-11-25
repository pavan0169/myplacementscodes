package trees;
import node.*;
public class AVLTree {
	BNode root;
	
	public AVLTree()
	{
		root=null;
	}
	
	//helper methods are 4 1)calculate height 2)get balanced 3) left rotate 4) right rotate
	public int calculateHeight(BNode cnode)
	{
		if(cnode==null)
		{
			return 0;
		}
		return 1+Math.max((cnode.right!=null ? cnode.right.height:-1), (cnode.left!=null ? cnode.left.height:-1));
	}
	
	public int getBalance(BNode left, BNode right)
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
	
	public BNode leftRotate(BNode cnode)
	{
		BNode newroot=cnode.right;
		cnode.right=cnode.right.left;
		newroot.left=cnode;
		cnode.height=calculateHeight(cnode);
		newroot.height=calculateHeight(newroot);
		return newroot;
	}
	
	public BNode rightRotate(BNode cnode)
	{
		BNode newroot=cnode.left;
		cnode.left=cnode.left.right;
		newroot.right=cnode;
		newroot.height=calculateHeight(newroot);
		cnode.height=calculateHeight(cnode);
		return cnode;
	}
	
	public static BNode minimumNode(BNode root) {
		if (root.getLeft() == null)
			return root;
		else {
			return minimumNode(root.getLeft());
		}
	}
	
	public void insert(int value)
	{
		root=insert(root,value);
	}
	
	public BNode insert(BNode croot, int value)
	{
		if(croot==null)
		{
			BNode node=new BNode();
			node.value=value;
			node.height=0;
			return node;
		}
		else if(croot.value>=value)                        //   normally in bst we return croot for each if loop now it is not
		{
			croot.left=insert(croot.left, value);
		}
		else if(croot.value<value)
		{
			croot.right=insert(croot.right, value);
		}
		                            //this is where avl spicific work is done
		int balance=getBalance(croot.left, croot.right);
		if(balance>1)                               //left side is problem because -ve means right +ve means left  but we have to find LL OR LR
		{
			if(getBalance(croot.left.left, croot.left.right)>0)   //this is where we find its LL because -ve means right +ve means left
			{
				croot=rightRotate(croot);
			}
			else                  //this is where we find its LR because -ve means right +ve means left
			{
				croot.left=leftRotate(croot.left);
				croot=rightRotate(croot);
			}
		}
		else if(balance<-1)              //right side is problem because -ve means right +ve means left  but we have to find LL OR LR
		{
			if(getBalance(croot.right.right,croot.right.left)>0)  //this is where we find its RR because -ve means right +ve means left
			{
				croot=leftRotate(croot);
			}
			else                  //this is where we find its RL because -ve means right +ve means left
			{
				croot.right=rightRotate(croot.right);
				croot=leftRotate(croot);
			}
		}

		if (croot.left != null) 
		{
			croot.left.height=calculateHeight(croot.left);
		}
		if (croot.right != null) 
		{
			croot.right.height=calculateHeight(croot.right);
		}
		croot.height=calculateHeight(croot);
		return croot;
	}
	
	public void delete(int value)
	{
		delete(root,value);
	}
	
	public BNode delete(BNode croot, int value)
	{
		if (croot == null) 
		{
			System.out.println("Value not found in BST");
			return null;
		}
		else if(value<croot.value)
		{
			croot.left=delete(croot.left,value);
		}
		else if(value>croot.value)
		{
			croot.right=delete(croot.right,value);
		}
		else          //if current node is the node to be deleted then 3 cases 1)node has no child 2) node has one child 3)node has 2 child
		{
			if(croot.getLeft() != null && croot.getRight() != null)     //case 3
			{
				BNode temp=croot;
				BNode min=minimumNode(temp.right);
				croot.value=min.value;
				croot.right=delete(croot.right,min.value);
			}
			else if (croot.getLeft() != null)
			{                                                           // if node has only left child
				croot = croot.getLeft();
			} 
			else if (croot.getRight() != null) 
			{                                                             // if node has only right child
				croot = croot.getRight();
			}
			else
			{                                                           //if node do not have child (Leaf node)
				croot = null; 
			}
			return croot; 
		}
		int balance=getBalance(croot.left, croot.right);
		if(balance>1)                               //left side is problem because -ve means right +ve means left  but we have to find LL OR LR
		{
			if(getBalance(croot.left.left, croot.left.right)>0)   //this is where we find its LL because -ve means right +ve means left
			{
				croot=rightRotate(croot);
			}
			else                  //this is where we find its LR because -ve means right +ve means left
			{
				croot.left=leftRotate(croot.left);
				croot=rightRotate(croot);
			}
		}
		else if(balance<-1)              //right side is problem because -ve means right +ve means left  but we have to find LL OR LR
		{
			if(getBalance(croot.right.right,croot.right.left)>0)  //this is where we find its RR because -ve means right +ve means left
			{
				croot=leftRotate(croot);
			}
			else                  //this is where we find its RL because -ve means right +ve means left
			{
				croot.right=rightRotate(croot.right);
				croot=leftRotate(croot);
			}
		}

		if (croot.left != null) 
		{
			croot.left.height=calculateHeight(croot.left);
		}
		if (croot.right != null) 
		{
			croot.right.height=calculateHeight(croot.right);
		}
		croot.height=calculateHeight(croot);
		return croot;
	}
	
	
	
	//traversal is as same as bst
	
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
}
