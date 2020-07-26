package Epam_Task_Java8Features;
import java.util.*;
import java.util.stream.Stream;
public class String_startwith_Lowercase {
public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter no.of Strings:");
	int n=ob.nextInt();
	String s[]=new String[n];
	System.out.println("Enter strings one by one : ");
	for(int i=0;i<n;i++) {
		s[i]=ob.next();
	}
	strings(s);
	
}

static void strings(String[] s) {
	Stream<String> st=Stream.of(s);
	System.out.println("strings starting with a and length equal to 3 : ");
	st.filter(p->p.startsWith("a")).filter(p->(p.length()==3)).peek(p->System.out.println(p)).count();
}
}