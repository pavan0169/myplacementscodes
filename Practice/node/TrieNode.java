package node;
import java.util.*;
public class TrieNode 
{
	public Map<Character, TrieNode> children;
	public boolean endOfWord;
	
	public TrieNode()
	{
		this.children=new HashMap<>();
		this.endOfWord=false;
	}
}
