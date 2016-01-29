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


Note: I don't think I quite understand how we are to combine  HuffmanNode, HuffmanTree and
TreeMap to do Huffman Code. I plan on seeing you asap next week.



@author Kevin Chow
@version 1.29.16
*/
public class HuffmanTree
{
	private String value;
	
	private int count;
	
	//for root pointer
	private HuffmanTree<String> root;
	
	private HuffmanTree<String> left;
	private HuffmanTree<String> right;

	//string value used to generate the tree
	private String words;
	
	/**
	Default constructor
	*/
	public HuffmanTree()
	{
	
	}
	
	/**
	Constructor takes in the string value for generating the tree.
	@param String s the string value used to generate the tree
	*/
	public HuffmanTree(String s)
	{
		
	}
	
	/**
	Root accessor method
	@return HuffmanTree<String> root node
	*/
	public HuffmanTree<String> root()
	{
		
	}
	
	/**
	Modifier for root
	@param HuffmanTree<String> the new root
	*/
	public void setRoot(HuffmanTree<String> r)
	{
	
	}

	/**
	Words accessor method
	@return String words used to generate the tree
	*/
	public String words()
	{
	
	}
	
	
	
	/**
	Accessor method for the value
	@return String the value of the node
	*/
	public String value()
	{
		return value;
	}
	
	/**
	Accessor Method for the count
	@return int the number of occurrences 
	*/
	public int count()
	{
		return count;
	}
	
	/**
	Accessor method for left pointer.
	@return HuffmanTree<String> the node the left pointer points to.
	*/
	public HuffmanTree<String> left()
	{
		return left;
	}
	
	/**
	Accessor method for right pointer.
	@return HuffmanTree<String> the binary node the right pointer points to.
	*/
	public HuffmanTree<String> right()
	{
		return right;
	}
	
	/**
	Modifier for the value
	@param Character val the value to set to
	*/
	public void setValue(Character val)
	{
		value = val;
	}
	
	/**
	Modifier for the count
	@param int c the new count
	*/
	public void setCount(int c)
	{
		count = c;
	}
	
	/**
	Modifier for the left pointer
	@param HuffmanTree<String> node the new tree to point to
	*/
	public void setLeft(HuffmanTree<String> node)
	{
		left = node;
	}
	
	/**
	Modifier for the right pointer
	@param HuffmanTree<String> node the new tree to point to
	*/
	public void setRight(HuffmanTree<String> node)
	{
		right = node;
	}
	
	/**
	Returns if the node is a leaf or not, which is when there are no children
	@return boolean whether or not the node has any children
	*/
	public boolean isLeaf()
	{
	}
	
	/**
	Encoding method
	@return String the binary code for words
	*/
	public String encode()
	{
	}
	
	/**
	Decode Method
	@return String the decoded message
	*/
	public String decode()
	{
	}
	
	/**
	Creates a String Representation of the Huffman Tree
	@return String string representation of the Huffman Tree
	*/
	public String toString()
	{
	}
	
	
	

}