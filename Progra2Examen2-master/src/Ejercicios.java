import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicios {
	
	//Devuelve true si todos los elementos de mi_lista (dada) son pares, de lo contrario devuelve false
	static boolean sonPares(ArrayList<Integer> mi_lista)
	{
		int numero=0;
		for	(int i=0;i<mi_lista.size();i++)
		{
				if(mi_lista.get(i)%2==0) 
					numero=numero+1;
					if(numero==mi_lista.size())
						return true;		
		}
		return false;		
	}
	
	//Escribe n1, n2 y n3 (dados) en un archivo con nombre nombre_archivo (dado) separados por espacios
	static void escribir3Numeros(String nombre_archivo,int n1, int n2,int n3)
	{
		try
		{
			PrintWriter pw= new PrintWriter(
											new FileOutputStream(
											new File(nombre_archivo),false));	
			
			pw.write(n1+" "+n2+" "+n3);
			pw.close();
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	//Devuelve true si el archivo con nombre nombre_archivo (dado) contiene al menos 2 palabras repetidas
	static boolean existenRepetidas(String nombre_archivo)
	{
		s = new Scanner(new File(nombre_archivo));	
	if (s = )
		
		
	}
}
