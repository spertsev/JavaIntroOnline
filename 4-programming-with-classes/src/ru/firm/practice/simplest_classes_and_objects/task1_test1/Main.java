package ru.firm.practice.simplest_classes_and_objects.task1_test1;

/*	1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 *	переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 *	наибольшее значение из этих двух переменных.
 */

public class Main {

	public static void main(String[] args) {

		Test1 test1 = new Test1();

		test1.setFirstVariable(5);
		test1.setSecondVariable(10);

		System.out.println(test1.getFirstVariable());
		System.out.println(test1.getSecondVariable());

		System.out.println(test1.sumOfFirstVariableAndSecondVariable());
		System.out.println(test1.maximumOfFirstVariableAndSecondVariable());

	}

}

class Test1 {

	private int firstVariable;
	private int secondVariable;

	public int getFirstVariable() {

		return this.firstVariable;

	}

	public int getSecondVariable() {

		return this.secondVariable;

	}

	public void setFirstVariable(int firstVariable) {

		this.firstVariable = firstVariable;

	}

	public void setSecondVariable(int secondVariable) {

		this.secondVariable = secondVariable;

	}

	public int sumOfFirstVariableAndSecondVariable() {

		return this.firstVariable + this.secondVariable;

	}

	public int maximumOfFirstVariableAndSecondVariable() {

		return Math.max(firstVariable, secondVariable);

	}

}