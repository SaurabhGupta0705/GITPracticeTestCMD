package runners;

import java.util.Scanner;

import pageClasses.StringClass1;

public class StringClass1Runner {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentance");
		String sentance = sc.nextLine();
		sc.close();
		StringClass1 sobj = new StringClass1();
		System.out.println(sobj.wordsInString(sentance));
	}
}
