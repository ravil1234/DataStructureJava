package Hashmap;
import java.util.*;
public class HashTable<K,V> {
	private class HTPair
	{
		K key;
		V value;
		HTPair(K key,V value)
		{
			this.key=key;
			this.value=value;
		}
		public boolean equals(Object other)
		{
			HTPair op=(HTPair) other;
			return this.key.equals(op.key);
		}
		public String toString()
		{
			return "{"+this.key+"-"+this.value+"}";
		}
	}
		private static final int DEFAULT_CAPACITY=10;
		private LinkedList<HTPair>[] bucketArray;
		private int size;
		public HashTable()
		{
			this(DEFAULT_CAPACITY);
		}
		public HashTable(int capacity)
		{
			this.bucketArray=(LinkedList<HTPair>[]) new  LinkedList[capacity];
			this.size=0;
		}
		public void put(K key ,V value) throws Exception
		{
			int bi=hashFunction(key);
			LinkedList<HTPair> bucket=this.bucketArray[bi];
			HTPair pta =new HTPair(key,value);
			if(bucket==null)
			{
			bucket=new LinkedList<>();
			bucket.addLast(pta);
			this.bucketArray[bi]=bucket;
			this.size++;
			}
			else
			{
				int findAt=bucket.find(pta);
				if(findAt==-1)
				{
					bucket.addLast(pta);
					this.size++;
				}
				else
				{
					HTPair pair=bucket.getAt(findAt);
					pair.value=value;
					
				}
			  }
			double lamda=(this.size*1.0)/(this.bucketArray.length);
			if(lamda>.75)
			{
				this.size=0;
			   rehash();	
			}
		}
			
		public V get(K key) throws Exception
		{
			int bi=hashFunction(key);
			LinkedList<HTPair> bucket=this.bucketArray[bi];
			HTPair pfa=new HTPair(key,null);
			if(bucket==null)
			{
				return null;
			}
			else
			{
				int findat=bucket.find(pfa);
				if(findat==-1)
				{
					return null;
				}
				else
				{
					HTPair pr=bucket.getAt(findat);
					return pr.value;
				}
			}	
		}
		public V remove(K key) throws Exception
		{
			int bi=hashFunction(key);
			LinkedList<HTPair> bucket=this.bucketArray[bi];
			HTPair pfa=new HTPair(key,null);
			if(bucket==null)
			{
				return null;
			}
			else
			{
				int fin=bucket.find(pfa);
				if(fin==-1)
				{
					return null;
				}
				else
				{
						HTPair pr=bucket.removeAt(fin);
						this.size--;
						return pr.value;
				}
				
			}
		}
		private void rehash() throws Exception
		{
			LinkedList<HTPair>[] oba=this.bucketArray;
		  this.bucketArray=(LinkedList<HTPair>[]) new LinkedList[2*oba.length];
		  for(LinkedList<HTPair> ob:oba)
		  {
			  while(ob!=null&&!ob.isEmpty())
			  {
				  HTPair h=ob.removeFirst();
				  put(h.key,h.value);
				  
			  }
		  }
		}
	private int hashFunction(K key)
	{
		int hc=key.hashCode();
		hc=Math.abs(hc);
		int bi=hc%this.bucketArray.length;
		return bi;
	}
	public void display() throws  Exception
	{
		for(LinkedList<HTPair> bc:bucketArray)
		{
			if(bc!=null&&!bc.isEmpty())
			{
				bc.display();
			}
			else
			{
				System.out.println("NULL");
			}
			System.out.println("------------------");
		}
		System.out.println("*************************************");
	}
public static void main(String args[]) throws Exception
{
	HashTable<String,Integer> h=new HashTable<>(4);
	h.put("USA",200);
	h.put("UK", 175);
	h.put("INDIA", 300);
	h.display();
	h.put("CHINA", 350);
	h.display();
	h.put("SWEDEN", 100);
	h.put("NEPAL", 50);
	h.put("IRELAND", 90);
	h.display();
}
}
