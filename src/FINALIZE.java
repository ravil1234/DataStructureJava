
public class FINALIZE
{
public void finalize()
{
	System.out.println("object is cleaned");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FINALIZE f=new FINALIZE();
		FINALIZE f1=new FINALIZE();
		f=null;
		f1=null;
       System.gc();
	}

}
