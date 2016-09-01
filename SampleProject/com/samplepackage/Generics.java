package com.samplepackage;

import java.util.ArrayList;

public class Generics<T> {
	T z;
	T y;
	T s;
	Generics(T f,T y,T d){
		this.z=f;
		this.y=y;
		this.s=d;
		
	}
	
	
	
	 
	
public static void main(String[] args){
	Generics ge=new Generics(23,23.5,"Suma");
	ArrayList<String> obj=new ArrayList<String>();
	obj.add("Suma");
	
	for(String X:obj){
		System.out.println("the list of String is :"+X);
	}
	ArrayList<Integer> in=new ArrayList<Integer>();
	in.add(23);
	for(Integer y :in){
		System.out.println("the list of String is :"+ in);
		
	}
	
	
}
}
