package by.epam.tr.lesson2;

import static java.lang.Math.PI;

import java.util.Scanner;

public class AllTask {
	//#1 task
	public static void main(String[] args)
	{
		//#1 printHelloWorld();
		
		//#2 printMyInfo();
		
		//#3 printText();
		
		//#4 calcHypotSqrRightTriangle(3, 4);
		
		//#5 System.out.println(getSum(1, 2, 3, 4));
		
		//#6 calcExpression();
		
		//#7 calcSumNy();
		
		//#8 calcSumNySoon();
		
		//#9 calcInteger();
		
		//#10 calcDouble();
		
		//#11 calcIntegerMultipleCond();
		
		//#12 calcSumMainParameter(args);
		
		//#13 calcTwoExpression(1.3, 5.87, 13.22, 2.3);
		
		//#14 calcPow(-1.3, 5.87, 13.22);
		
		//#15 calcFunctIncrStep(0.0, 1.0, 0.1);
		
		//#16 getCircleParameter(3.1);
		
		getFuncResult(3.1);
		
	}
	
	//#1 task
	public static void printHelloWorld()
	{
		System.out.println("Hello, world!");
	}
	
	//#2 task
	public static void printMyInfo()
	{
		System.out.println("������ ����� �������������");
		System.out.println("�. �����, ��. ��������� 13-1-41");
		System.out.println("+375297697017");
	}
	
	//#3 task
	public static void printText()
	{
		System.out.println("������� ����� ���, � ��������� ��������� �������, ���� � ����� � �������� ���������, �������� ��� ������� �����, ����� ���� ���� ��� � ����� ���������� �� ���. ������� ���� ����� ��������� �������� � ����� ��������� �����, ����������� �� ����� � ������� �� ������ ����, ������� ����� ���� ���������� ���� �");
	}
	
	//#4 task
	public static void calcHypotSqrRightTriangle(double a, double b)
	{
		double c;
		double s;
		
		c = Math.sqrt(a*a + b*b);
		s = a*b/2;
		
		System.out.println("���������� = " + c + ", ������� = " + s);
	}
	
	//#5 task
	public static int getSum(int a, int b, int c, int d)
	{
		return a + b + c + d;
	}
	
	//#6 task
	public static void calcExpression()
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		double expr;
		
		System.out.print("������� ������ �����: ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("�� ����� �� ����� �����. ���������� ��� ���: ");
		}		
		a = scanner.nextInt();
		
		System.out.print("������� ������ �����: ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("�� ����� �� ����� �����. ���������� ��� ���: ");
		}		
		b = scanner.nextInt();
		
		System.out.print("������� ������ �����: ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("�� ����� �� ����� �����. ���������� ��� ���: ");
		}		
		c = scanner.nextInt();
		
		expr = a*a - Math.pow((b-c), 2) + Math.log(b*b + 1);
		
		System.out.println(expr);
	}
	
	//#7 task
	public static void calcSumNy()
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int sum;
		
		System.out.print("������� ������ �����: ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("�� ����� �� ����� �����. ���������� ��� ���: ");
		}		
		a = scanner.nextInt();
		
		System.out.print("������� ������ �����: ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("�� ����� �� ����� �����. ���������� ��� ���: ");
		}		
		b = scanner.nextInt();
		
		if (a == b) {
			System.out.println("�����");
		}
		else {
			System.out.print("������� ������ �����: ");
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.print("�� ����� �� ����� �����. ���������� ��� ���: ");
			}		
			c = scanner.nextInt();
			
			if (a > b) {
				sum = b + c;
			}
			else {
				sum = a + b + c;
				System.out.println(sum);
				System.out.println("����� ���!");
			}
		}
	}
	
	//#8 task
	public static void calcSumNySoon()
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int sum;
		
		System.out.print("������� ������ �����: ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("�� ����� �� ����� �����. ���������� ��� ���: ");
		}		
		a = scanner.nextInt();
		
		System.out.print("������� ������ �����: ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("�� ����� �� ����� �����. ���������� ��� ���: ");
		}		
		b = scanner.nextInt();
		
		if (a == b) {
			System.out.println("����� ����� ���!");
		}
		else {
			System.out.print("������� ������ �����: ");
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.print("�� ����� �� ����� �����. ���������� ��� ���: ");
			}		
			c = scanner.nextInt();
			
			System.out.println(a + b + c);
			System.out.println(a*a + b*b);
			System.out.println("��� ������� ���������� �������");
		}
	}
	
	//#9 task
	public static void calcInteger()
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int count;
		int actualCount = 0;
		int x;
		int countEven = 0;
		int sumMultiple = 0;
		int countAbs = 0;
		
		System.out.print("������� ���������� �����: ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("�� ����� �� ����� �����. ���������� ��� ���: ");
		}		
		count = scanner.nextInt();
		
		while (actualCount < count)
		{
			System.out.print("������� �����: ");
			if (scanner.hasNextInt()) {
				actualCount++;
				x = scanner.nextInt();
				
				if (x%2 == 0) {
					countEven++;
				}
				if (x%3 == 0) {
					sumMultiple += x;
				}
				if (Math.abs(x) < 3) {
					countAbs++;
				}
			}
			else {
				scanner.next();
				System.out.print("�� ����� �� ����� �����! ");
			}
		}
		
		System.out.println("���������� ������ ����� = " + countEven);
		System.out.println("����� ������� 3 ����� = " + sumMultiple);
		System.out.println("���������� ����� �� ������ ������� 3  = " + countAbs);
	}
	
	//#10 task
	public static void calcDouble()
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int count;
		int actualCount = 0;
		double x;
		int countEven = 0;
		int countAbs = 0;
		
		System.out.print("������� ���������� �����: ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("�� ����� �� ����� �����. ���������� ��� ���: ");
		}		
		count = scanner.nextInt();
		
		while (actualCount < count)
		{
			System.out.print("������� �����: ");
			if (scanner.hasNextDouble()) {
				actualCount++;
				x = scanner.nextDouble();
				
				if (Math.ceil(x)%2 == 0) {
					countEven++;
				}
				if (Math.ceil(x) > 15) {
					countAbs++;
				}
			}
			else {
				scanner.next();
				System.out.print("�� ����� �� ����� �����! ");
			}
		}
		
		System.out.println("���������� ������ ����� = " + countEven);
		System.out.println("���������� ����� ������� 15  = " + countAbs);
	}
	
	//#11 task
	public static void calcIntegerMultipleCond()
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int count;
		int actualCount = 0;
		int x;
		int sumMultiple = 0;
		int countAbs = 0;
		
		System.out.print("������� ���������� �����: ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("�� ����� �� ����� �����. ���������� ��� ���: ");
		}		
		count = scanner.nextInt();
		
		while (actualCount < count)
		{
			System.out.print("������� �����: ");
			if (scanner.hasNextInt()) {
				actualCount++;
				x = scanner.nextInt();
				
				if (x > 15 || x < 2) {
					countAbs++;
				}
				if (x%5 == 4) {
					sumMultiple += x;
				}
			}
			else {
				scanner.next();
				System.out.print("�� ����� �� ����� �����! ");
			}
		}
		
		System.out.println("���������� ����� ������ 15 ��� <2 = " + countAbs);
		System.out.println("����� �����, ������� ������� �� 5 � �������� 4 = " + sumMultiple);
	}
	
	//#12 task
	public static void calcSumMainParameter(String[] args)
	{		
		int sum = 0;
		
		for (String argument : args) {
			sum += Integer.parseInt(argument);
		}
		System.out.println(sum);
	}
	
	//#13 task
	public static void calcTwoExpression(double a, double b, double c, double d)
	{		
		double expr1;
		double expr2;
		
		expr1 = (b + Math.sqrt(b*b + 4*a*c))/(2*a) - Math.pow(a, 3)*c + b;
		expr2 = (a/c)*(b/d) - (a*b - c)/(c*d);
		
		System.out.println(expr1);
		System.out.println(expr2);
	}
	
	//#14 task
	public static void calcPow(double a, double b, double c)
	{		
		double second;
		double fourth;
		
		if (a >= 0) {
			System.out.println("������� ����� " + a + " = " + a*a);
		}
		else {
			System.out.println("��������� ������� ����� " + a + " = " + Math.pow(a, 4));
		}
		
		if (b >= 0) {
			System.out.println("������� ����� " + b + " = " + b*b);
		}
		else {
			System.out.println("��������� ������� ����� " + b + " = " + Math.pow(b, 4));
		}
		
		if (c >= 0) {
			System.out.println("������� ����� " + c + " = " + c*c);
		}
		else {
			System.out.println("��������� ������� ����� " + c + " = " + Math.pow(c, 4));
		}
	}
	
	//#15 task
	public static void calcFunctIncrStep(double a, double b, double h)
	{		
		double f;
		
		for (double x = a; x <= b; x += h)
		{
			f = 2*Math.tan(x/2) + 1;
			System.out.println("x = " + x + " F(x) = " + f);
		}
	}
	
	//#16 task
	public static void getCircleParameter(double radius) {
        double l;
        double s;
        
        l = 2*PI*radius;
        s = PI*Math.pow(radius, 2);
		
        System.out.println("Length for circle of radius " + radius + " is " + l);
        System.out.println("Square of circle of radius " + radius + " is " + s);
    }
	
	//#17 task
	public static void getFuncResult(double x) {
        double f = 0d;
        
        if (x <= -3) {
        	f = 9;
        }
        else if (x > 3) {
        	f = 1/(x*x + 1);
        }
		
        System.out.println("For x = " + x + " F(x) = " + f);
    }  
}
