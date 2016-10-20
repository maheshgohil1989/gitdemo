
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder test = new StringBuilder();
		//test.append("nishant");
		changeStringBuilder(test);
		System.out.println(test.toString());
		
		
	}
	
	public static void changeString(String xyz){
		xyz = "nishant";
	}
	
	public static void changeStringBuilder(StringBuilder test){
		if(test.length()==0){
			test.append("nishant shah");
		}
	}


}
