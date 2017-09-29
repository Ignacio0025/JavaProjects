public class ProgramaDos
{
	public static void main(String... arg)
	{
	int numero1 = 1;
	/*while (numero1 <= 500)
		{
			numero1 = numero1 + 1;
			System.out.println(numero1);
			numero1++;
		}*/
		System.out.println("Programa que imprime los numeros pares del 1 al 500.\n");

		while(numero1 <= 500)
		{
			if (numero1 % 2 == 0){
				System.out.println(numero1);
				numero1++;
			}
			numero1++;
		}
		System.out.println("Este programa fue creado por Luis Ignacio De los Santos 2015-2991.");
	}

}
