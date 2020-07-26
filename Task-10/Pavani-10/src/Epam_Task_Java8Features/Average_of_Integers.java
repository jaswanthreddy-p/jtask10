package Epam_Task_Java8Features;
import java.util.*;
import java.util.stream.IntStream;
public class Average_of_Integers {
public static double Average(int[] a) {
	IntStream st=IntStream.of(a);
	
	OptionalDouble obj=st.average();
	if(obj.isPresent()) {
		return obj.getAsDouble();
	}
	return 0;
	
}
public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter number of integers:");
	int n=ob.nextInt();
	int a[]=new int[n];
	System.out.println("Enter "+n+" integers one by one : ");
	for(int i=0;i<n;i++) {
		a[i]=ob.nextInt();
	}
	System.out.println("Average of list of numbers is : "+Average(a));
}
}