package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double priceMoney = sc.nextDouble();
		
		System.out.printf("How many dollars will be bought? ");
		double moneyConvert = sc.nextDouble();		
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.ConverterMoney(priceMoney, moneyConvert));
		
		sc.close();

	}

}
