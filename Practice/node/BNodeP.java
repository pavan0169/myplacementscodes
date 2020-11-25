package node;

public class BNodeP 
{
	public int value;
	public BNodeP parent;
	public BNodeP left;
	public BNodeP right;
	
	
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public BNodeP getParent() {
		return parent;
	}


	public void setParent(BNodeP parent) {
		this.parent = parent;
	}


	public BNodeP getLeft() {
		return left;
	}


	public void setLeft(BNodeP left) {
		this.left = left;
	}


	public BNodeP getRight() {
		return right;
	}


	public void setRight(BNodeP right) {
		this.right = right;
	}


	public String toString()
	{
		return value+" ";
	}
}
