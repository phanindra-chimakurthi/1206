package com.streams;
import java.util.*;

class Employee{
	private String name;
	private String account;
	private Integer salary;
	public Employee(String name, String account, Integer salary) {
		super();
		this.name = name;
		this.account = account;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", account=" + account + ", salary=" + salary + "]";
	}
	
	
}
public class StreamEx1 {
	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("Nataraj g","Accounts",8000));
		empList.add(new Employee("Nagesh g","Admin",15000));
		empList.add(new Employee("vasu V","Security",2500));
		empList.add(new Employee("Amar","Admin",3000));
		
		empList.stream().filter(emp->emp.getAccount().matches("Admin"))
		              .findFirst()
		              .ifPresent(System.out::println);
		empList.stream().filter(emp->emp.getAccount().matches("Security"))
        .findAny()
        .ifPresent(System.out::println);
		
		
	}

}
