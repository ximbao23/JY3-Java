package com.neuedu.duotai;

public class Person {
	public static void main(String[] args) {
		Person person=new Person();
		//Train t=new Train();
		Plane p=new Plane();
		person.play(p);
		
		
	}
	public void play(Vehicle v){
		v.trip();
	}
}
