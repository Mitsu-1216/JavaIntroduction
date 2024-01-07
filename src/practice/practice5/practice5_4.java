package practice.practice5;

import java.io.Console;

public class practice5_4 {
	public static void main(String[] args) {
		double triangle = calcTriangleArea(10.0, 5.0);
		double circle = calcCircleArea(5.0);
		System.out.println(triangle);
		System.out.println(circle);
	}

	public static double calcTriangleArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;
	}

	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}