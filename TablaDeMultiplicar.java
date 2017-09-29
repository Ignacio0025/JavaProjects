public class TablaDeMultiplicar
{
	public static void main(String... arg) 
	{
		int num = 2, i = 1, tabla;
		System.out.println("Tabla de multiplicar del 2 al 10.\n");
		while(num <= 10)
		{
			System.out.println("Esta es la tabla del: "+ num +"\n");
			while(i <= 10 )
			{
				tabla = num * i;
				System.out.println(num +" x "+ i +" = "+ tabla + "\n");
				i++;
			}
			num++;
			i = 1;
		}
		System.out.println("Este programa fue creado por Luis Ignacio De los Santos 2015-2991.");
	}
}