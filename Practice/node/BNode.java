package node;

public class BNode 
{
	public int value;
	public BNode left;
	public BNode right;
	public int height;
	
	public BNode()
	{
		this.left=null;
		this.right=null;
	}
	
	
	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public BNode getLeft() {
		return left;
	}


	public void setLeft(BNode left) {
		this.left = left;
	}


	public BNode getRight() {
		return right;
	}


	public void setRight(BNode right) {
		this.right = right;
	}


	public String toString()
	{
		return value+" ";
	}
}
