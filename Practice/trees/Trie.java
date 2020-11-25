package trees;
import node.TrieNode;
public class Trie 
{
	public TrieNode root;
	
	public Trie()
	{
		this.root=new TrieNode();
	}
	
	public void insert(String word)
	{
		TrieNode current=root;
		for(int i=0; i<word.length(); i++)
		{
			char ch=word.charAt(i);
			TrieNode node=current.children.get(ch);
			if(node==null)
			{
				node=new TrieNode();
				current.children.put(ch,node);
			}
			current=node;
		}
		current.endOfWord=true;
	}
	
	public boolean search(String word)
	{
		TrieNode current=root;
		for(int i=0; i<word.length(); i++)
		{
			char ch=word.charAt(i);
			TrieNode node=current.children.get(ch);
			if(node==null)
			{
				return false;
			}
			current=node;
		}
		return current.endOfWord;
	}
	
	public void delete(String word)
	{
		delete(root,word,0);
	}
	
	public boolean delete(TrieNode parent, String word, int index)   // CASE#1 -- Some other word's prefix is same as Prefix of this word (BCDE, BCKG)
	{                                                               // CASE#2 -- We are at last character of this word and This word is a Prefix of some other word (BCDE, BCDEFG)
		char ch=word.charAt(index);                                // CASE#3 -- Some other word is a Prefix of this word (BCDE, BC)
		TrieNode current = parent.children.get(ch);           // CASE#4 -- No one is dependent on this Word (BCDE, BCDE)
		boolean DeletingNode;
		if(current.children.size()>1)          //case1 situation
		{
			delete(current,word,index+1);
			return false;
		}
		
		if(index==word.length()-1)    //case2 situation
		{
			if(current.children.size()>=1)        //dependency is there so,   updating endOfWord will signify that this word is not there in Trie
			{
				current.endOfWord=false;
				return false;
			}
			else
			{
				parent.children.remove(ch);         //Character " + ch + " has no dependency, hence deleting it from last
				return true;// If this word is not a prefix of some other word, and since this is last character, we should
				                                                                 // return true, indicating we are ok to delete this node
			}
		}
		
		if (current.endOfWord == true)                  // CASE#3
		{ 
			delete(current, word, index + 1); 
			return false;
		}
		
		DeletingNode=delete(current,word,index+1);           //case 4
		if (DeletingNode == true)                                //Character " + ch + " has no dependency, hence deleting it
		{
			parent.children.remove(ch);
			return true; // Current node can also be deleted
		} 
		else 
		{
			return false; // Someone is dependent on this node, hence dont delete it
		}
	}
}

