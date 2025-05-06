package practice;

import java.util.ArrayList;
import java.util.Collections;

public class Laptop1User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Laptop1> a=new ArrayList<Laptop1>();
		a.add(new Laptop1("del",60000,212,8));
		a.add(new Laptop1("hp",56000,500,16));
		a.add(new Laptop1("lenovo",80000,450,18));
		a.add(new Laptop1("Apple",70000,532,17));
		a.add(new Laptop1("Acer",50000,800,9));
		int sum=0;
		for(Laptop1 i:a) {
			sum=sum+i.price;
		}
		int avg=sum/a.size();
		ArrayList<Laptop1> a1=new ArrayList<Laptop1>();
		Collections.sort(a);
		System.out.println(a);
		System.out.println(a.get(0));
		
		

	}

}
