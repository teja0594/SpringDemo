package com.vm.entity;

public class Employee {

	private int id;
	private String name;
	private Adress adress;
	public Employee(int id) {
		super();
		this.id = id;
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee(int id, String name, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	
	
	
}
