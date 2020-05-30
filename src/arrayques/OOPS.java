package arrayques;
abstract class OOPS {
double dim1;
double dim2;
    OOPS(double a,double b)
    {
    	dim1=a;
    	dim2=b;
    }
    abstract void area();
    void concre()
    {
    	System.out.println("hello "+dim1+" "+dim2);
    }
	public static void main(String args[])
   	{
   	  demo d=new demo(10,0);
   	  d.area();
   	  d.concre();
   	}
}
	   class demo extends OOPS
	   {
	      demo(double a,double b)
	      {
	      super(a,b);
	      dim1=a;
	      dim2=b;
	      }
	      void area()
	      {
	   	   System.out.println("helllo area demo:");
	      }
	   }
