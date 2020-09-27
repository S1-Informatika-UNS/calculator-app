package com.hello;

// TODO :
// tulis NIM - Nama - Kelas di sini
// write your Student ID Number - Name - Class (A/B/C)

public class Calculator {
	// attributes
	int number1, number2;

	// constructor
	public Calculator(int numb1, int numb2) {
		// number1 and number2 will replace with the value from numb1 and numb2
		this.number1 = numb1;
		this.number2 = numb2;
	}

	// implement addition inside addNumbers method
	public int addNumbers() {
		int result = this.number1 + this.number2;
		return result;
	}

	// TODO :
	// tambahkan method untuk mengurangi, mengkalikan, dan membagi bilangan
	// add new method to subtract, multiply, and divide numbers
	// gunakan nama-nama method sebagai berikut (use this methods name)
	// subtractNumbers (mengurangi bilangan / subtract numbers)
	// multiplyNumbers (mengkalikan bilangan / multiply numbers)
	// divisionNumbers (memembagi bilangan / divide numbers)
	
	// main method
	public static void main(String[] args) {
		// create calculator object
		Calculator calculator = new Calculator(3, 4);
		System.out.println("first number : " + calculator.number1);
		System.out.println("second number : " + calculator.number2);
		
		// add two numbers
		double resultOfAddition = calculator.addNumbers();
		System.out.println(calculator.number1 + " + " + calculator.number2 + " = " + resultOfAddition);

		// TODO :
		// tambahkan code untuk menampilkan hasil pengurangan, perkalian, dan pembagian
		// add new code to show the result of subtraction, multiplication, and division of the numbers
	}
}
