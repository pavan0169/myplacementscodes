package trees;

public class TrieMain 
{
	public static void main(String[] args)
	{
		Trie t=new Trie();
		t.insert("PAVAN");
		t.insert("PANDA");
		t.insert("TEJA");
		t.insert("PAJA");
		t.insert("TEJAS");
		t.insert("PAVANS");
		t.insert("PANDAS");
		t.insert("PANDAVAS");
		
		t.delete("PAVAN");
		t.delete("PANDAVAS");
		System.out.println(t.search("PANDA"));
	}
}
