import java.util.Map;
import java.util.TreeMap;

/**
My HuffmanTree Class

How Huffman Code works:

1)Take the string that is used to make the tree and create a map based on each character's
occurrences
2)Create a node for each character and put into a queue sorted from least to greatest
3)Take the 2 smallest nodes off and make a new node combining the two, add back into the 
queue
4)Continue until queue has only 1 node left
5)Using the Huffman built while messing with the nodes, create a code of the original
string.

Why I choose to use a TreeMap:
Based on the api pages, Hashmap is the more efficient (a constant time for get, put) while 
Treemaps are log(n). However, Treemaps maintain order while Hashmaps are more random or
unorganized. For the sanity's sake while programming, it seems Treemaps are easier to work
with.

@author Kevin Chow
@version 2.8.16
*/
public class HuffmanTree
{
	
	//for root pointer
	private HuffmanNode root;	

	//string value used to generate the tree
	private String words;
	
	/**
	Constructor takes in the string value for generating the tree.
	@param String s the string value used to generate the tree
	*/
	public HuffmanTree(String s, HuffmanNode r)
	{
		root = r;
		words = s;
	}
	
	/**
	Root accessor method
	@return HuffmanNode root node
	*/
	public HuffmanNode root()
	{
		return root;
	}

	/**
	Words accessor method
	@return String words used to generate the tree
	*/
	public String words()
	{
		return words;
	}

	/**
	Helper Method for Encode
	@param String l letter to be encoded
	@param HuffmanNode node to look at
	@return String binary code of the letter
	*/
	private String encodehelp(String l, HuffmanNode node)
	{
		if(node.isLeaf())
		{
			return "";
		}
	
		if(node.left().value().contains(l))
		{
			return "0" + encodehelp(l, node.left());
		}
		else if(node.right().value().contains(l));
		{
			return "1" + encodehelp(l, node.right());
		}
	}

	/**
	Encoding Method
	@param String words to encode
	@return String the binary code for words
	@precondition the characters being encoded are a part of the HuffmanNode tree
	*/
	public String encode(String words)
	{
		String code = "";
		for(int i = 0;i < words.length();i++)
		{
			String letter = Character.toString(words.charAt(i));
			code += encodehelp(letter, root);
		}
		return code;
	}
	
	/**
	Decode Method
	@param String coded the code to decode
	@return String the decoded message
	*/
	public String decode(String coded)
	{
		String decoded = "";
		
		int count = 0;
		HuffmanNode temp = root;;
		while (count < coded.length())
		{
			if (temp.isLeaf() == true)
			{
				decoded += temp.value();
				temp = root;
			}
			
			else if(coded.charAt(count) == '0')
			{
				temp = temp.left();
				count++;
			}
			
			else if(coded.charAt(count) == '1')
			{
				temp = temp.right();
				count++;
			}
		}
		
		//because the final letter is not added in the while loop
		decoded += temp.value();

		return decoded;
	}
	
	
	
}