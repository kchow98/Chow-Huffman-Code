import java.util.Map;
import java.util.TreeMap;
/**
This is a my HuffmanNode class. 

I choose
@author Kevin Chow
@version 1.29.16
*/
public class HuffmanNode<Character> implements Comparable<HuffmanNode<Character>>
{
	private Character value;
	private int count;
	private HuffmanNode<Character> left;
	private HuffmanNode<Character> right;
	
	/**
	Default Constructor. Value, left, and right are all null, count is zero
	*/
	public HuffmanNode()
	{
		value = null;
		count = 0;
		left = null;
		right = null;
	}

	/**
	Set value equal to v and count equal to c, left and right are null
	@param Character v the value of the node
	@param int c number of occurrences  of the character
	*/
	public HuffmanNode(Character v, int c)
	{
		value = v;
		count = c;
		left = null;
		right = null;
	}
	
	/**
	Set value to v, count to c, left to l, right to r.
	@param Character v the value of the Binary Tree
	@param BinaryTree<E> l the value of the left pointer
	@param BinaryTree<E> r the value of the right pointer
	*/
	public HuffmanNode(Character v, int c, HuffmanNode<Character> l, HuffmanNode<Character> r)
	{
		value = v;
		count = c;
		left = l;
		right = r;
	}
	
	/**
	Accessor method for the value
	@return Character the value of the node
	*/
	public Character value()
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
	@return HuffmanNode<Character> the node the left pointer points to.
	*/
	public HuffmanNode<Character> left()
	{
		return left;
	}
	
	/**
	Accessor method for right pointer.
	@return HuffmanNode<Character> the binary node the right pointer points to.
	*/
	public HuffmanNode<Character> right()
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
	@param HuffmanNode<Character> node the new tree to point to
	*/
	public void setLeft(HuffmanNode<Character> node)
	{
		left = node;
	}
	
	/**
	Modifier for the right pointer
	@param HuffmanNode<Character> node the new tree to point to
	*/
	public void setRight(HuffmanNode<Character> node)
	{
		right = node;
	}
	
	/**
	How the HuffmanNode will be displayed once printed
	@return String string visual of the node.
	*/
	public String toString()
	{
		String s = "[";
		s += "Value: "; 
		s += value;
		s += " - Count: "; 
		s += count;
		s += "]"; 
		return s;
	}
	
	/**
	Compares the node with another node for order. 
	@param HuffmanNode<Character> other node that is to be compared to
	@return int Returns a negative integer, zero, or a positive integer as this object is 
	less than, equal to, or greater than the specified object.
	*/
	public int compareTo(HuffmanNode<Character> other)
	{
		return count - other.count();
	}
	
}