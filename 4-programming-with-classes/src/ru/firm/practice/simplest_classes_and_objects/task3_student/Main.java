package ru.firm.practice.simplest_classes_and_objects.task3_student;

/*
 *	3.Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 *	  Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10. 
 */

public class Main {

	public static void main(String[] args) {
		
		Student[] ourStudents = new Student[10];
		
		ourStudents[0] = new Student("Иванов", "И.И.", "ТР-1", new int[] {9,10,9,9,9});
		ourStudents[1] = new Student("Петров", "А.И.", "ТР-2", new int[] {9,1,9,9,9});
		ourStudents[2] = new Student("Сидоров", "Б.И.", "ТР-3", new int[] {9,9,2,9,9});
		ourStudents[3] = new Student("ИванОвич", "В.И.", "ТР-1", new int[] {9,3,9,9,9});
		ourStudents[4] = new Student("ПетровИч", "Г.И.", "ТР-2", new int[] {9,9,4,9,9});
		ourStudents[5] = new Student("СидоровИч", "Д.И.", "ТР-3", new int[] {10,9,9,9,9});
		ourStudents[6] = new Student("Ивановский", "Е.И.", "ТР-1", new int[] {9,2,9,9,9});
		ourStudents[7] = new Student("Петровский", "Ё.И.", "ТР-2", new int[] {9,9,9,9,7});
		ourStudents[8] = new Student("Сидоровский", "Ж.И.", "ТР-3", new int[] {9,9,9,8,9});
		ourStudents[9] = new Student("Водкинский", "З.И.", "ТР-1", new int[] {9,9,9,9,10});
		
		System.out.println("Good students list: ");
		
		for (Student currentStudent : ourStudents) {
					
			int[] currentStudentGrades;
			int badGradesCount;
			
			currentStudentGrades = currentStudent.getGrades();
			badGradesCount = 0;
			
			for (int ourStudentGrade : currentStudentGrades) {
				if (ourStudentGrade < 9) {
					badGradesCount++;
					break;
				}
			}
			
			if (badGradesCount == 0) {
				System.out.println(currentStudent.getSurname() + " " + currentStudent.getGroupNumber());
			}
			
		}
		
	}
	
}