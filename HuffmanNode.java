import java.util.Map;
import java.util.TreeMap;
/**
This is a my HuffmanNode class. 


@author Kevin Chow
@version 2.5.16
*/
public class HuffmanNode implements Comparable<HuffmanNode>
{
	private String value;
	private int count;
	private HuffmanNode left;
	private HuffmanNode right;
	
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
	@param String v the value of the node
	@param int c number of occurrences  of the String
	*/
	public HuffmanNode(String v, int c)
	{
		value = v;
		count = c;
		left = null;
		right = null;
	}
	
	/**
	Set value to v, count to c, left to l, right to r.
	@param String v the value of the Binary Tree
	@param BinaryTree<E> l the value of the left pointer
	@param BinaryTree<E> r the value of the right pointer
	*/
	public HuffmanNode(String v, int c, HuffmanNode l, HuffmanNode r)
	{
		value = v;
		count = c;
		left = l;
		right = r;
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
	@return HuffmanNode the node the left pointer points to.
	*/
	public HuffmanNode left()
	{
		return left;
	}
	
	/**
	Accessor method for right pointer.
	@return HuffmanNode the binary node the right pointer points to.
	*/
	public HuffmanNode right()
	{
		return right;
	}
	
	/**
	Modifier for the value
	@param String val the value to set to
	*/
	public void setValue(String val)
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
	@param HuffmanNode node the new tree to point to
	*/
	public void setLeft(HuffmanNode node)
	{
		left = node;
	}
	
	/**
	Modifier for the right pointer
	@param HuffmanNode node the new tree to point to
	*/
	public void setRight(HuffmanNode node)
	{
		right = node;
	}
	
	/**
	How the HuffmanNode will be displayed once printed
	@return String string visual of the node.
	*/
	public String toString()
	{
		String s = "";
		if(isLeaf() == true)
		{
			s += value;
			return s;
		}
		else if(left == null)
		{
			s += value + "[";
			s += "[_]";
			s += "[";
			s += right.toString();
			s += "]";

		}
		else if(right == null)
		{
			s += value + "[";
			s += "[";
			s += left.toString();
			s += "]";
			s += "[_]";
			s += "]";

		}
		
		else
		{
			s += value;
			s += "[";
			s += left.toString();
			s += "]";
			s += "[";
			s += right.toString();
			s += "]";
		
		}
		return s;
	}
	/**
	Returns if the node is a leaf or not, which is when there are no children
	@return boolean whether or not the node has any children
	*/
	public boolean isLeaf()
	{
			return (left == null && right == null);

	}
	
	/**
	Compares the node with another node for order. 
	@param HuffmanNode other node that is to be compared to
	@return int Returns a negative integer, zero, or a positive integer as this object is 
	less than, equal to, or greater than the specified object.
	*/
	public int compareTo(HuffmanNode other)
	{
		return count - other.count();
	}
	
}