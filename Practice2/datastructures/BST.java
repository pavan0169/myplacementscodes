package datastructures;

class Node{
	int value;
	Node left;
	Node right;
	Node(int value){
		this.value=value;
	}
	Node(){  } 
	public String toString() {
		return value+" ";
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////
public class BST {
	Node root;
	public BST(){
		root=null;
	}
	
	public void insert(int value) { 
		root=insert(root,value);
	}
	
	public Node insert(Node croot, int value) {
		if(croot==null){
			Node node=new Node();
			node.value=value;
			return node;
		} else if(croot.value<=value) {
			croot.right=insert(croot.right,value);
			return croot;
		} else {
			croot.left=insert(croot.left,value);
			return croot;
		}
	}
	
	public void delete(int value) {
		delete(root,value);
	}
	
	public Node delete(Node croot, int value) { 
		if(croot==null) {
			System.out.println("Value not found");
			return null;
		}
		else if(croot.value<value) {
			croot.right=delete(croot.right,value);
		} else if(croot.value>value) {
			croot.left=delete(croot.left,value);
		} else {               //if the croot is the root which we are going to delete 3 cases
			if(croot.left!=null && croot.right!=null) {           //root with two childs
				Node temp=croot;
				Node min=minimumNode(temp.right);
				croot.value=min.value;
				croot.right=delete(croot.right,min.value);
			} else if (croot.left!=null) {
				croot=croot.left;
			} else if(croot.right!=null) {
				croot=croot.right;
			} else {
				croot=null;
			}
		}
		return croot;
	}
	
	public Node minimumNode(Node node) {
		if(node.left==null) {
			return node;
		} else {
			return minimumNode(node.left);
		}
	}
	
	public void preorderTraversal(Node root) {
		if(root==null){
			return;
		}
		System.out.print(root);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}
	
	public void inorderTraversal(Node root) {
		if(root==null){
			return;
		}
		inorderTraversal(root.left);
		System.out.print(root);
		inorderTraversal(root.right);
	}
	
	public void postorderTraversal(Node root) {
		if(root==null){
			return;
		}
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root);
	}
	
	public void search(int value)
	{
		search(root,value);
	}
	
	public Node search(Node croot, int value) {
		if(croot==null) {
			return null;
		} else if(croot.value>value) {
			return search(croot.left,value);
		} else if(croot.value<value) {
			return search(croot.right,value);
		} else {
			System.out.println("Value: " + value + " found in BST.");
			return croot; 
		}
	}
}
