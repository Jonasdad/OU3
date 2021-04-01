package OU3;

import java.util.Scanner;
import java.lang.Math;

public class OU3
{

	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);

		//Antal v�ger fr�n Zon 1 till Zon 2
		System.out.print("Ange antal stationer fr�n Zon 1 till Zon 2 \nm = " );
		int m = in.nextInt();

		//Antal v�gar fr�n Zon 2 till Zon 3
		System.out.print("Ange antal stationer fr�n Zon 1 till Zon 2 \nn = ");
		int n = in.nextInt();

		double a[] = new double [m + 1];
		double b[][] = new double [m + 1][n + 1];
		double c[] = new double [n + 1];

		for (int i = 1; i <= m; i++)
		{
			System.out.print("Avst�nd till station " + i + " i Zon 2 fr�n Zon 1 \n");
			System.out.print("a[" + i + "]  =  ");
			a[i] = in.nextDouble();
		}

		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				{
					System.out.print("Avst�nd till station " + j + " i Zon 3 fr�n Zon 2 " + "\nb[" + i + "][" + j + "] = ");
				b[i][j] = in.nextDouble();

				}
			}
		}
		for (int j = 1; j <= n; j ++)
		{
			System.out.print("Avst�nd till station " + j + " i Zon 4 fr�n 3 \nc[" + j + "] = ");
			c[j] = in.nextDouble();
		}
		int d[] = DenKortasteVagen.mellanstationer(a, b, c);
		double dist = DenKortasteVagen.distance(a,b,c);

		System.out.println("\nkortaste v�gen �r: \n"
		+ "Zon 1 till Zon 2 - Station " + d[0] + " �r " + a[d[0]] + " l�ng. \n"
		+ "Zon 2 - Station " + d[0] + " till Zon 3 - station " + d[1] + " �r "
		+ b[d[0]][d[1]] + " l�ng. \n" + "Zon 3 - Station " + d[1]
		+ " till Zon 4 �r " + c[d[1]] + "l�ng. \nTotal Str�cka: " + dist);
  }
}

