package ru.firm.practice.simplest_classes_and_objects.task3_student;

/*
 *	3.Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 *	  Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10. 
 */

public class Student {
	private String surname;
	private String initials;
	private String groupNumber;
	private int[] grades = new int[5];
	
	public Student(String surname, String initials, String groupNumber, int[] grades) {
		this.surname = surname;
		this.initials = initials;
		this.groupNumber = groupNumber;
		this.grades = grades;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setInitials(String initials) {
		this.initials = initials;
	}
	
	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}
	
	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public String getSurname() {
		return surname;
	}
	
	public String getInitials() {
		return initials;
	}
	
	public String getGroupNumber() {
		return groupNumber;
	}
	
	public int[] getGrades() {
		return grades;
	}
}
