package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.println("Enter the number of shapes:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c):");
			char c = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED):");
			Color color = Color.valueOf(sc.next());

			if (c == 'r') {
				System.out.println("Width:");
				double width = sc.nextDouble();
				System.out.println("height:");
				double height = sc.nextDouble();

				list.add(new Rectangle(color, width, height));

			} else {

				System.out.println("Radius:");
				double radius = sc.nextDouble();

				list.add(new Circle(color, radius));

			}
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
			}
		sc.close();
	}
}