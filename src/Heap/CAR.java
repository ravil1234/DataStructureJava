package Heap;
public  class CAR implements Comparable<CAR>
 {
	int speed;
	int price;
	String color;
	public CAR(int speed,int price,String color)
	{
		this.speed=speed;
		this.price=price;
		this.color=color;
	}
	@Override
	public String toString()
	{
		return "#S: "+this.speed+" #P: "+this.price+" #C: "+this.color;
	}
	@Override
	public int compareTo(CAR other)
	{
		//return other.price-this.price;
		return other.color.compareTo(this.color);
	}
}
