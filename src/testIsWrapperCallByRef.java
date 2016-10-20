
public class testIsWrapperCallByRef {

 public static void main(String... args ){
	 
	 Boolean var=new Boolean(true);
	 setBolean(var,false);
	 System.out.println(var);
 }
 
 public static void setBolean(Boolean var,Boolean value){
	 var=value;
	 System.out.println(var);
 }
}
