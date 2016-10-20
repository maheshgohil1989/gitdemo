
public class TestException {

	
	public static void main(String... args){
		TestException test=new TestException();
		try {
			test.m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void m1() throws Exception{
		m2();
	}
	
	public void m2() throws Exception{
		throw new NullPointerException();
	}
}
