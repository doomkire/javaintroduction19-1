package ua.dp.ort.homework3;

public class HomeWork3 {

	public static void main(String[] args) {
		// 1) ��� ������� ������������ ���� ������ (byte short int long float double):
		// - ��������� 3 �������� ������� ����� � ������ ����
		// - ���� ���������� ����������� ��� (�������� java convention)
		// - ������� �������� ���������� � �������
		// ������
//		        short chicoladWeight = 90;     // ��� ���������
//		        System.out.println(chicoladWeight);
//		        short matches = 75;            // ������
//		        System.out.println(matches);
//		        short lightbulbs = 75;         // �������
//		        System.out.println(lightbulbs);
		    	  byte age = 34;
		    	  byte weight = 79;
		    	  short heiht = 170;
		    	  System.out.println("��� �������: " + age + " ���");
		    	  System.out.println("��� ���: " + weight + " ���������");
		    	  System.out.println("��� ����: " + heiht + " �����������");
		    	  System.out.println("----------------------------------------------------------------");
		    	  short onlineStore = 1;
		    	  short categories = 9;
		    	  int products = 5936;
		    	  System.out.println("� ���� ���� " + onlineStore + " ��������-�������");
		    	  System.out.println("� ��� ���� " + categories + " ��������� �������");
		    	  System.out.println("� ��� " + products + "�������");
		    	  System.out.println("----------------------------------------------------------------");
		    	  long earthPopulation1990 = 528800000000l;
		    	  long earthPopulation2000 = 612200000000l;
		    	  long earthPopulation2019 = 770000000000l;
		    	  System.out.println("��������� ����� �� 1990 ��������� " + earthPopulation1990 + " �����");
		    	  System.out.println("��������� ����� �� 2000 ��������� " + earthPopulation2000 + " �����");
		    	  System.out.println("��������� ����� �� 2019 ��������� " + earthPopulation2019 + " �����");
		    	  System.out.println("----------------------------------------------------------------");
		    	  System.out.println("�������� ��� ����� �������� ������ ��������� ����� ����� �������");
		    	  float earthPopulation1990f = 5.288f;
		    	  float earthPopulation2000f = 6.122f;
		    	  float earthPopulation2019f = 7.7f;
		    	  System.out.println("��������� ����� �� 1990 ��������� " + earthPopulation1990f + " �����");
		    	  System.out.println("��������� ����� �� 2000 ��������� " + earthPopulation2000f + " �����");
		    	  System.out.println("��������� ����� �� 2019 ��������� " + earthPopulation2019f + " �����");
		    	  System.out.println("----------------------------------------------------------------");
		          double Pi = 3.14159265359;
		          double acelerationOfGravity = 9.80665;
		          double electricConstant = 0.00000000000885;
		          System.out.println("���� ��������� �� ������:");
		          System.out.println("�������������� ���������� ��=" + Pi);
		          System.out.println("��������� ���������� ������� �� ����������� ����� g = " + acelerationOfGravity + " �/�2");
		          System.out.println("������������� ���������� = " + electricConstant+ " �/�");
		    	  System.out.println("================================================================");
		          System.out.println("����� 2");
		          System.out.println("----------");
		    	  
		          


		         
		// ��� ���� char ������� 3 ����������, ��������� �� ��� ������� � ������� �� � �������

		//-------------------------------------------------------------------------------------
		// 2) ��������� �������, � �������� 3 ������� ������������ � ���������.
		// ���������� ��� ����� ������������ �����
		        
		//������ 
		// ��� ���������� ������� ��������� 7 ���� ������, � ����� ���������� ��� ��� 
		// ������� ��� ��������, ��� ����� �� ����� ������������ 8 ���
		// 8� ��� 1-������� 0-�������� ����
		// 1-7 ��� ��� ��� ������ 1-���� �����������, 0-���� �� �����������
		// ���������� ����� ���� � ����� �� ����.
		// 1000 0001     ������� �����������
		// 0110 0000     �������� ������� � �����������
		// 1111 1111     �������� ��� ������ ��� ��������
		          //���� �����. ������� ������� ���. ������� ��� = 1;
		         System.out.println("������� ��� � ������: 1111 0011110 0011111 0011111 0011111, ��� 1 ��� ������� ����");
		         System.out.println("������� ������: 10011111");
		         System.out.println("����������� ���: 1000 0000001 0000000 0000000 0000000");
		         System.out.println("================================================================");
		         System.out.println("����� 3");
		         System.out.println("----------");         
		        
		// 3) �������� �� ������ ��������� �����������, ����������� ��� � �� Windows.
		// ������� 5 ��������, �������� �� �������� � �������.
		         System.out.println("����������� ��� �������� ���������� ������������ ����������� ��� ���������");
		         // ��������� ���������
		         final int hallway = 100;
		         final int classroom = 300;
		         final int office = 450;
		         final int bedroom = 200;
		         final int sportHall = 400;
		         double lenghtRoom = 10;
		         double widthRoom = 12;
		         double heightRoom = 3.5;
		         int normLux;
		         int lamp;
		         normLux = bedroom;
		         lamp = 600;
		         double roomVolume = lenghtRoom * widthRoom * heightRoom;
		         double NumberOfLamp = (roomVolume * normLux) / lamp;
		         System.out.println("\n" + "���������� ������������ = " +  NumberOfLamp);
		         
		         
		    }
		    
		}

