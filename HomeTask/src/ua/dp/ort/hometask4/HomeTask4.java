package ua.dp.ort.hometask4;

public class HomeTask4 {

	public static void main(String[] args) {
		System.out.println("1) ������� �������������� �������� +, -, *, %");
		System.out.println("------------------------------------------------------------");
		System.out.println("����: �=5, b=10");
		int a = 5;
		int b = 10;
	    System.out.println("����� = " + (a + b));
		System.out.println("�������� = " + (a - b));
		System.out.println("������������ = " + (a * b));
		System.out.println("������� = " + (float)a/b);
		System.out.println("------------------------------------------------------------");
		int a1 = 5;
		System.out.println("2) ���������� ����� 5 � ������� 5 ����� ���������");
		System.out.println("�������������� ������: a*a*a*a*a=" + a1*a1*a1*a1*a1);
		System.out.println("������� Math.pow = " + (int)Math.pow(a1, a1));
		System.out.println("------------------------------------------------------------");
		System.out.println("3) ���� ������� y=2x+5. ������� ����� y, ���:" + "\n" + "1) x = 2;" + "\n" + "2) x = 9.5");
        int x = 2;
        int y;
        System.out.println("��� �=2: y=" + (y = (2 * x) + 5));
        double x1 = 9.5;
        System.out.println("��� �=9.5: y=" + (y = (int)(2 * x1) + 5));
		System.out.println("------------------------------------------------------------");
		System.out.println("4) ���� ������� ��������������: x = 4.5 �����, y = 3.1 �����");
        double sideTriangleX = 9.5;
        double sideTriangleY = 3.1;
		System.out.println("������� �������������� = " + (sideTriangleX * sideTriangleY));
		System.out.println("���������� ������ ���������� ������ ������� = " + Math.rint(sideTriangleX * sideTriangleY));
		System.out.println("------------------------------------------------------------");
		System.out.println("5) ���� 11 �����, ��� ������ ������� 3� ����� ��� ����� ���� ��������� ���������� ���������� ����� �����");
		int apple = 11;
		int children = 3;
		System.out.println("������� ������� ��������� " + Math.rint(apple / children));
		System.out.println("����� �������� " + (apple - ((apple / children) * children)));
		System.out.println("------------------------------------------------------------");
		System.out.println("6) ���� ������������ ���������, �� ������� ������ ��������. ��������� ����� 1 ���� � 43 ����������. ������� ���������� ��������� ���� ��������� � �������� �������.");
		double distance = 1.43;
		double jumpFrog = 0.025;
		double startFrog = distance / 2;
		System.out.println("������ ������� �� ������ = " + (Math.floor(startFrog / jumpFrog)));
		System.out.println("------------------------------------------------------------");
		System.out.println("7) ����� ����� 1999999999 � 1999999999");
		int number1 = 1999999999;
		int number2 = 1999999999;
		long number2Long = number2;
		long sum = number1 + number2Long;
		System.out.println("1999999999 + 1999999999 = " + sum);
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println("8) ���� 6�� ������� �����, ������� ����� ���� ����� �� 100000 �� 999999 ����������� ��������, � �������������� ������ �������������� ��������,������� �� �������� ��� ����� ��������� 6�� ������� ����� ��������� ����� ���� ��� �����.");
		int sixDigitNumber;
		sixDigitNumber = 123456;
		int firstNumber = sixDigitNumber/100000;
		Math.rint(firstNumber);
		int secondNumber = ((sixDigitNumber - (firstNumber*100000))/10000);
		Math.rint(secondNumber);
		int thirdNumber = ((sixDigitNumber - (secondNumber*10000 + firstNumber*100000))/1000);
		Math.rint(thirdNumber);
		int fourthNumber = ((sixDigitNumber - (secondNumber*10000 + firstNumber*100000 + thirdNumber*1000))/100);
		Math.rint(fourthNumber);
		int fifthNumber = ((sixDigitNumber - (secondNumber*10000 + firstNumber*100000 + thirdNumber*1000 + fourthNumber*100))/10);
		Math.rint(fifthNumber);
		int sixthNumber = (sixDigitNumber - (secondNumber*10000 + firstNumber*100000 + thirdNumber*1000 + fourthNumber*100 + fifthNumber*10));
		Math.rint(fifthNumber);
		System.out.println("����� = " + (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber));
		System.out.println("------------------------------------------------------------");
		System.out.println("� ��� ���� 8 ���, ��������� ����� ���� ����� �� ����� 1-7 ��� ��� ��� ������, ��� ���������� � 1 - ���� �����������, � 0 - ���� �� ����������� 8�  ��� ��� ��� ���, ��� ���������� � 1 - ������� ����, � 0 - �������� ����");
		short workDays = 0b1111_1111;
		short dayOff = 0b0000_0000; 
		short task1 = 0b1111_1111;
		System.out.println("1. �������� ��� � 1111_1111 " + (dayOff & task1));
		System.out.println("2. �������� ��� � 1111_1111 " + (workDays & task1));
		short task2 = 0b1010_0101;
		System.out.println("3. 1010_0101 ������� ���:");
		
		short monday = 0b1000_0000;
		short tuesday = 0b0100_0000;
		short wednesday = 0b0010_0000;
		short thursday = 0b0001_0000;
		short friday = 0b0000_1000;
		short saturday = 0b0000_0100;
		short sunday = 0b0000_0010;
		// 0b0001_1001
		// 0b1000_0001
		short task3 = 0b0001_1001;
				
    	System.out.println(" - ����������� " + (task3 & monday));
    	System.out.println(" - ������� " + (task3 & tuesday));
    	System.out.println(" - ����� " + (task3 & wednesday));
    	System.out.println(" - ������� " + (task3 & thursday));
    	System.out.println(" - ������� " + (task3 & friday));
    	System.out.println(" - ������� " + (task3 & saturday));
    	System.out.println(" - ����������� " + (task3 & sunday));
        System.out.println("4. 0001_1001 �������� ���:");
    	short task4 = 0b0001_1001;
    	
    	System.out.println(" - ����������� " + (~task4 & monday));
    	System.out.println(" - ������� " + (~task4 & tuesday));
    	System.out.println(" - ����� " + (~task4 & wednesday));
    	System.out.println(" - ������� " + (~task4 & thursday));
    	System.out.println(" - ������� " + (~task4 & friday));
    	System.out.println(" - ������� " + (~task4 & saturday));
    	System.out.println(" - ����������� " + (~task4 & sunday));

    	
		System.out.println("------------------------------------------------------------");
		System.out.println("���� ��������� �������� ���� ���������� �����");
		System.out.println("R (������� ����) = 115");
	    System.out.println("G (������� ����) = 15");
	    System.out.println("B (����� ����) = 200");
	    System.out.println("A (������������) = 67");
	    int red = 115;
	    int green = 15;
	    int blue = 200;
	    int transparent = 67;
	    int nullTest = 0;
	    System.out.println(Integer.toBinaryString(red) + "_"+ Integer.toBinaryString(green) + "_"+ Integer.toBinaryString(blue) + "_"+ Integer.toBinaryString(transparent));
        
	    System.out.println("------------------------------------------------------------"); 
	 
	}

}
