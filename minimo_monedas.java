package tareas;
import java.util.Scanner;
public class minimo_monedas
{
	public static void main (String[] args)
	{
		double c25 = 0, c10 = 0, c5 = 0, c1 = 0, cambio, division;
		Scanner c = new Scanner(System.in);
		System.out.print("Ingresa cuanto te debo de cambio:");
		cambio = c.nextDouble();
		do
		{
			division = cambio/25.0; //Aqui empezaremos a dividir para ver cuantas monedas de c/u tocan
			
			if(division%2==0)
			{
				c25++;
				cambio = cambio-0.25;
			}
			
			division = cambio/10.0;
			
			if(division%2==0)
			{
				c10++;
				cambio = cambio-0.10;
			}
			
			division = cambio/5.0;
			
			if(division%2==0)
			{
				c5++;
				cambio = cambio-0.05;
			}
			
			division = cambio/1.0;
			
			if(division%2==0)
			{
				c1++;
				cambio = cambio-0.01;
			}
		} while(cambio>0);
		System.out.println("25c = "+ c25 + "10c = " + c10 + "5c = " + c5 + "1c= "+ c1);
	}
}