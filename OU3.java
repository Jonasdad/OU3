package OU3;

import java.util.Scanner;
import java.lang.Math;

public class OU3
{

	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);

		//Antal väger från Zon 1 till Zon 2
		System.out.print("Ange antal stationer från Zon 1 till Zon 2 \nm = " );
		int m = in.nextInt();

		//Antal vägar från Zon 2 till Zon 3
		System.out.print("Ange antal stationer från Zon 1 till Zon 2 \nn = ");
		int n = in.nextInt();

		double a[] = new double [m + 1];
		double b[][] = new double [m + 1][n + 1];
		double c[] = new double [n + 1];

		for (int i = 1; i <= m; i++)
		{
			System.out.print("Avstånd till station " + i + " i Zon 2 från Zon 1 \n");
			System.out.print("a[" + i + "]  =  ");
			a[i] = in.nextDouble();
		}

		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				{
					System.out.print("Avstånd till station " + j + " i Zon 3 från Zon 2 " + "\nb[" + i + "][" + j + "] = ");
				b[i][j] = in.nextDouble();

				}
			}
		}
		for (int j = 1; j <= n; j ++)
		{
			System.out.print("Avstånd till station " + j + " i Zon 4 från 3 \nc[" + j + "] = ");
			c[j] = in.nextDouble();
		}
		int d[] = DenKortasteVagen.mellanstationer(a, b, c);
		double dist = DenKortasteVagen.distance(a,b,c);

		System.out.println("\nkortaste vägen är: \n"
		+ "Zon 1 till Zon 2 - Station " + d[0] + " är " + a[d[0]] + " lång. \n"
		+ "Zon 2 - Station " + d[0] + " till Zon 3 - station " + d[1] + " är "
		+ b[d[0]][d[1]] + " lång. \n" + "Zon 3 - Station " + d[1]
		+ " till Zon 4 är " + c[d[1]] + "lång. \nTotal Sträcka: " + dist);
  }
}

