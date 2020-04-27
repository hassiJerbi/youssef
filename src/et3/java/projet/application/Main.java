package et3.java.projet.application;

import et3.java.projet.data.FileReader;

public class Main 
{
	public static void main(String[] args) 
	{
		if(args.length > 0)
		{
			//We start by reading the CSV file
			FileReader.getDataFromCSVFile("src/et3/java/projet/data/data.csv");
		}
		
		//TODO Project :)
	}
}
