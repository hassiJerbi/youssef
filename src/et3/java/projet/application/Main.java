package et3.java.projet.application;

import et3.java.projet.file.FileReader;

public class Main 
{
	public static void main(String[] args) 
	{
		//We start by reading the CSV file
		FileReader.getDataFromCSVFile("src/data.csv");
	}
}
