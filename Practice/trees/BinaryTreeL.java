package trees;
import node.*;
public class BinaryTreeL 
{
	public BNode root;
	public BNode point;
	public BNode pin;
	
	public BinaryTreeL()                           /////          /////           /////         ///////       ///  ///               
	{                                              /////          /////       ///////////      ///    ///     /// ///                              
		this.root=null;                            /////          /////      ////   ////       ///   ///      ///////                    
	}                                              /////    //    /////     ////    ////       ////////       ///  ///              
                                                   /////    //    /////     ///////////        ///   ///      ///   ///               
	public void insertNode(int value)              ////////////////////       /////            ///    ///     ///    ///                          
	{
		BNode node=new BNode();
		node.value=value;
		node.left=null;
		node.right=null;
		if(root==null)
		{
			root=node;
			point=node;
			pin=node;
			return;
		}
		else if(root==point)
		{
			if(point.left==null)
			{
				point.left=node;
				return;
			}
			else if(point.right==null)
			{
				point.right=node;
				point=point.left;
				return;
			} 
		}
		else if(point!=pin && (point.left==null || point.right==null))
		{
			if(point.left==null)
			{
				point.left=node;
				return;
			}
			else if(point.right==null)
			{
				point.right=node;
				point=pin;
				point=point.right;
				return;
			}
		}
		else if(point==pin && (point.right==null || point.right==null))
		{
			point.right=point;
			if(point.left==null)
			{
				point.left=node;
				return;
			}
			else if(point.right==null)
			{
				point.right=node;
				return;
			}
		}
	}
}
