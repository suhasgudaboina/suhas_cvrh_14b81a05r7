
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		int length;
		int id;
		String name;
		Date birthdate=null;
		String bd;
		double avgmarks;
		String dateFormat = "yyyy-MM-dd";
		SimpleDateFormat date = new SimpleDateFormat(dateFormat);
		Scanner sc=new Scanner(System.in);
		length=sc.nextInt();
		StudentGroup sg=new StudentGroup(length);
		for(int i=0;i<length;i++)
		{
			id=sc.nextInt();
			name=sc.next();
			bd=sc.next();
//			String ch=sc.next();
			avgmarks=sc.nextDouble();
			try {
			    birthdate = date.parse(bd);
				} 
			catch (ParseException e) {
			    e.printStackTrace();
				}
			Student s=new Student(id,name,birthdate,avgmarks);
			sg.add(s,i);
		}
		
//		System.out.println(Arrays.toString(sg.getStudents()));
		Student[] a=new Student[(sg.getStudents()).length];
		a=sg.getStudents();
		Student stu=sg.getStudent(1);
		String str = new SimpleDateFormat("yyyy-MM-dd").format(stu.getBirthDate());
		System.out.println(stu.getId()+" "+stu.getFullName()+" "+str+" "+stu.getAvgMark());
		for(int i=0;i<(sg.getStudents()).length;i++)
		{
			System.out.print(a[i].getId()+ " ");
			System.out.print(a[i].getFullName()+ " ");
			Date dob=a[i].getBirthDate();
			str = new SimpleDateFormat("yyyy-MM-dd").format(dob);
			System.out.print(str+ " ");
			System.out.print(a[i].getAvgMark()+ " ");
			System.out.println();
		}
		
		
	}

}
