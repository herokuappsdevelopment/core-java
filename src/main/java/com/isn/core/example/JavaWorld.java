package com.isn.core.example;

public class JavaWorld {
	
	String name;
	int age;
	String address;
	
	public JavaWorld() {
		name="Venkat";
		age=32;
		address="Hyderabad";
	}
	
	public JavaWorld(String name, int age) {
		this.name=name;
		this.age=age;
		
	}


	public JavaWorld(String name, int age, String address) {
		this(name,age);
		this.address=address;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello world");
		JavaWorld javaWorld =  new JavaWorld();
		javaWorld.sayHello();
		
		JavaWorld javaWorld1 =  new JavaWorld("S",31,"Gandipet");
		javaWorld1.sayHello("Venkat");

	}	
	
	public String sayHello() {
		return "Hellow";
	}
	
	public String sayHello(String name) {
		return "Hello! "+name;
	}
	
	public String sayHello(String name, String time) {
		return sayHello(name)+" , your time now : "+time;
	}
	
	
}
