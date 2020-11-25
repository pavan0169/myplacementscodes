package node;

public class DoubleNode 
{
	public int value;
	public DoubleNode prev;
	public DoubleNode next;
	
	public DoubleNode()
	{	}
	
	public DoubleNode(int value)
	{
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public DoubleNode getPrev() {
		return prev;
	}

	public void setPrev(DoubleNode prev) {
		this.prev = prev;
	}

	public DoubleNode getNext() {
		return next;
	}

	public void setNext(DoubleNode next) {
		this.next = next;
	}
	
	public String toString()
	{
		return value+" ";
	}
}
