
public interface A0 extends A {
 void input();
 static int cube(int x)
 {
	 int result=x*x*x;
	 return result;
 }
 default public void km()
 {
	 System.out.println("hello a0");
 }
}
