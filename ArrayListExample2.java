package ArrayList1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample2 {
	public static void AddMean(ArrayList<Float> l) {
	    float sum=0;
		for(float i:l) {
			sum=sum+i;
		}
		System.out.println("sum is "+sum);
		System.out.println(" ");
		float n =sum/l.size();
		System.out.println("Mean is "+n);
		
	}
	
	public static void Median(ArrayList<Float> l) {
		if(l.size()%2!=0) {
			float n= ( (l.size() +1)/2 )-1;
			System.out.println("median is "+l.get((int) n));
		}
		else
		{
			int m1 =((l.size()/2)-1);
			int m2 =(l.size())/2 ;
			float m3 =((l.get(m2) +l.get(m1))/  (2) ) ;
			System.out.println("median is "+(m3));
		}
	}
	public static void main(String[] args){
		ArrayList<Float> l =new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of arrayList");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			l.add(sc.nextFloat());
		}
		
		System.out.println(l);
		
		AddMean(l);
		Collections.sort(l);
		
		Median(l);
	}


}
