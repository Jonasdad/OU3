  package OU3;

  public class DenKortasteVagen{
  public static int[] mellanstationer(double[] a, double[][] b, double[] c)
   {
	   int d[] = {1, 1};
	   double min = a[0]+b[0][0]+c[0];

	   for (int i = 1; i < a.length; i++)
	   {
		   for(int j = 1; j < c.length; j++)
		   {
			   if (min > a[i]+b[i][j]+c[j])
			   {
				   min = a[i]+b[i][j]+c[j];
				   d[0] = i;
				   d[1] = j;
			   }
		   }
		}
		return d;
   }
   public static double distance(double[] a, double[][] b, double[] c)
   {
	   int[] d = mellanstationer(a, b, c);
	   double dist = ( (a[d[0]]) + (b[d[0]][d[1]]) + (c[d[1]]) );
	   return dist;
	   }
}
