package tareas;
import java.util.Scanner;

public class botellas_agua
{
	public static void main (String[] args)
	{
		//1 minuto en la ducha = 12 botellas de agua 
		Scanner minutes = new Scanner (System.in);
		int min, time;
		System.out.println("Ingresa el tiempo que dura en la ducha: ");
		min = minutes.nextInt();
		time = min * 12;
		System.out.println("La cantidad de tiempo expresado en botellas de agua es de: ");
		System.out.println(time);
	}
}
