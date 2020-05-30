package Heap;
public class HeapGClient {

	public static void main(String[] args) {
		
		CAR[] cars = new CAR[5];
		cars[0] = new CAR(1000, 400, "Red");
		cars[1] = new CAR(2000, 200, "Yellow");
		cars[2] = new CAR(500, 900, "Black");
		cars[3] = new CAR(300, 30, "Grey");
		cars[4] = new CAR(700, 60, "White");
		
		HeapGeneric<CAR> heapg = new HeapGeneric<>();
		heapg.add(cars[0]);
		heapg.add(cars[1]);
		heapg.add(cars[2]);
		heapg.add(cars[3]);
		heapg.add(cars[4]);
		
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());

	}

}