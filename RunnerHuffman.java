import java.util.Map;
import java.util.TreeMap;
import java.util.PriorityQueue;
import java.util.ArrayList;

/**
This is a my Huffman Runner.

@author Kevin Chow
@version 2.8.16
*/

public class RunnerHuffman
{
	public static void main(String[] args)
	{
		/**
		System.out.println("Node Testing:");
		System.out.println("Testing Constructors and toString");
		HuffmanNode a = new HuffmanNode();
		System.out.println(a);
		HuffmanNode b = new HuffmanNode("b",3);
		System.out.println(b);
		HuffmanNode d = new HuffmanNode("Y",5);
		HuffmanNode e = new HuffmanNode("z",2);
		HuffmanNode c = new HuffmanNode("c",6,d,e);
		System.out.println(c);
			
		System.out.println("------------------------------------------");

		System.out.println("Testing Accessors");
		System.out.println(c.value());
		System.out.println(c.count());
		System.out.println(c.left());
		System.out.println(c.right());
	
		System.out.println("------------------------------------------");
		
		System.out.println("Testing Modifiers");
		
		c.setValue("ccc");
		c.setCount(5);
		c.setLeft(e);
		c.setRight(d);
		
		System.out.println(c.value());
		System.out.println(c.count());
		System.out.println(c.left());
		System.out.println(c.right());

		System.out.println("------------------------------------------");
		
		System.out.println("Testing compareTo");
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(c));
		System.out.println(c.compareTo(b));
		System.out.println(c.compareTo(d));


		System.out.println("------------------------------------------");
		System.out.println("Testing Done");
		*/
		
		//CHANGE THIS HERE 
		String words = "Sally sells seashells";

		ArrayList<String> letters = new ArrayList<String>();
		
		//make map
		Map<String, Integer> occur = new TreeMap<String, Integer>();
		for(int i = 0;i<words.length();i++)
		{
			String letter = Character.toString(words.charAt(i));
			if(occur.containsKey(letter))
			{
				int freq = occur.get(letter);
				freq++;
				occur.remove(letter);
				occur.put(letter,freq);
			}
			else
			{
				//magic number one because it is the first occurrence of that letter
				occur.put(letter,1);
				letters.add(letter);
			}
			
		}
		
		PriorityQueue<HuffmanNode> queue = new PriorityQueue<HuffmanNode>();

		//make all the key,values into nodes
		for(int i = 0; i < letters.size(); i++)
		{
			HuffmanNode node = new HuffmanNode(letters.get(i),occur.get(letters.get(i)));
			queue.add(node);
		}
		
		/**
		Test Print out of queue
		String print = "";
		while(queue.isEmpty() == false)
		{
			print += queue.poll();
		}
		
		System.out.println(print);
		*/

		//take first 2 off and add as one node, until one node left
		while(queue.size() > 1)
		{
			HuffmanNode node1 = queue.poll();
			HuffmanNode node2 = queue.poll();
			
			HuffmanNode nodecombine = new HuffmanNode(node1.value()+node2.value(),node1.count()+node2.count(),node1,node2);
			queue.add(nodecombine);
		}

		HuffmanNode root = queue.poll();
		HuffmanTree tree = new HuffmanTree(words,root);

		System.out.println(tree.encode("yesh"));
		System.out.println(tree.decode("0011100011010"));
	}
}

/**
		// Map Works System.out.println(occur);

*/