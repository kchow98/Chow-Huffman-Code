/**
This is a my Huffman Runner.

@author Kevin Chow
@version 1.29.16
*/

public class RunnerHuffman
{
	public static void main(String[] args)
	{
		System.out.println("Testing Constructors and toString");
		HuffmanNode<String> a = new HuffmanNode<String>();
		System.out.println(a);
		HuffmanNode<String> b = new HuffmanNode<String>("b",3);
		System.out.println(b);
		HuffmanNode<String> d = new HuffmanNode<String>("Y",5);
		HuffmanNode<String> e = new HuffmanNode<String>("z",2);
		HuffmanNode<String> c = new HuffmanNode<String>("c",6,d,e);
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
	}
}