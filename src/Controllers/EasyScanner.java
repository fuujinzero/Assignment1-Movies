package Controllers;

import java.util.Scanner;

public class EasyScanner {
	
	public static int nextInt()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}

	public static byte nextByte()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		byte b = sc.nextByte();
		return b;
	}
	
	public static double nextDouble()
	{
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		double d = sc.nextDouble();
		return d;
	}

	public static String nextString()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}

	public static char nextChar()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		return c;
	}

}
