import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class LamdaExp {
	public static void main(String [] args){
		List<Student> studentList=getPerson();
		
		//Before java8
		Collections.sort(studentList,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		//printList(studentList);
		
		//After java 8
		/*Comparator<Student> salaryComparator = (o1,o2)-> o1.getName().compareTo(o2.getName());
		Collections.sort(studentList,salaryComparator);
		printList(studentList);*/
		
		System.out.println("Output all student");
		
		Collections.sort(studentList,(o1,o2) -> o1.getName().compareTo(o2.getName()));
		printList(studentList);
		
		studentList.forEach(n->System.out.println(n.toString()));
		
		System.out.println("Output student whose roll no empty");
		List<Student> emptyRollNoStudentList=studentList.stream().filter(x->!x.getRollNo().isEmpty()).collect(Collectors.toList());
		
		emptyRollNoStudentList.forEach(System.out::println);
		
		
		
	}
	
	public static List<Student> getPerson(){
		List<Student> studentList=new ArrayList<>();
		studentList.add(new Student("mahesh","A001",27));
		studentList.add(new Student("suresh","",21));
		studentList.add(new Student("sid","A003",23));
		studentList.add(new Student("akhil","",19));
		return studentList;
	}
	
	public static void printList(List<Student> studentList){
		System.out.println("Print list");
		for(Student student:studentList){
			System.out.println(student.toString());
		}
	}
}


class Student{

	String name;
	String rollNo;
	int age;
	
	
	
	public Student(String name, String rollNo, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
	}
	
	
	
}
