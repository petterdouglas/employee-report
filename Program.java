package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Report;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		Report[] vect = new Report[n];

		List<Report> list = new ArrayList<>();

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Employee #%d:%n", (i + 1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			vect[i] = new Report(id, name, salary);
			list.add(vect[i]);
		}

		System.out.println("List of employees: ");
		for (Report x : list) {
			System.out.print(x);
		}

		System.out.print("Enter the emplyee id that will have salary increse: ");
		int y = sc.nextInt();
		int z = 1;

		while (z == 1) {
			for (int i = 0; i < vect.length; i++) {
				if (vect[i].getId() == y) {
					z += 1;
				}
			}
			if (z == 1) {
				System.out.print("This id does not exist! Please try another one: ");
				y = sc.nextInt();
			}
		}

		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getId() == y) {
				list.remove(vect[i]);
				vect[i].increaseSalary(percentage);
				list.add(vect[i]);
			}
		}

		System.out.println("List of employees: ");
		for (Report x : list) {
			System.out.print(x);
		}

		sc.close();

	}

}
