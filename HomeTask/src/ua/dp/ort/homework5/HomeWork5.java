package ua.dp.ort.homework5;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		System.out.println("C������ ������� ��������������");
		Scanner scanner = new Scanner(System.in);
		
		String userInput;
		System.out.println("������� ������ ��������������: ");
		userInput = scanner.nextLine();
		int width = Integer.parseInt(userInput);
		System.out.println("������� ����� ��������������: ");
		userInput = scanner.nextLine();
		int length = Integer.parseInt(userInput);
		int square = width * length;
		System.out.println("������� �������������� = " + square);
				



	}

}
