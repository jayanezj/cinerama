class printers
/**
*Cinerama for IES Galileo
*version 0.1
*Author Jos� Antonio Y��ez Jim�nez
*/
	{
	public static void showLogo()
		{
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.print("\n--------------------------");
		System.out.print("\n   Cinerama IES Galileo");
		System.out.print("\n--------------------------\n");
		}
	public static void showSamples()
		{
		System.out.print("\nEscoge entre uno de los siguientes rellenos:");
		System.out.print("\n\t(1) Relleno Express:");
		System.out.print("\n\t\tCine con 4 salas");
		System.out.print("\n\t\t4 proyecciones aleatorias, 2 de ellas en 3D");
		System.out.print("\n\t\tLas salas comienzan al 50% de su capacidad");
		System.out.print("\n\t(2) Relleno 1:");
		System.out.print("\n\t\tCine con 4 salas");
		System.out.print("\n\t\t4 proyecciones aleatorias, 2 de ellas en 3D");
		System.out.print("\n\t(2) Relleno 2:");
		System.out.print("\n\t\tCine con 2 salas");
		System.out.print("\n\t\t2 proyecciones aleatorias");
		System.out.print("\nRelleno (1-2):");
		}
	public static void showInfo(String info)
		{
		System.out.print(info);
		}
	public static void showMainMenu()
		{
		System.out.print("\nEscoge entre una de las siguientes opciones:");
		System.out.print("\n\t(1) Nuevo cliente");
		System.out.print("\n\t(2) Ocupaci�n actual de las salas");
		System.out.print("\n\t(3) Cerrar caja");
		}
	public static void showRoomOccupation(int[][] seatcounter)
		{
		System.out.print("\nOcupaci�n actual de las salas:");
		for (int i=0;i<seatcounter.length;i++)
			{
			System.out.print("\n\tSala "+(i+1)+": "+seatcounter[i][1]+" de "+seatcounter[i][0]);
			System.out.print(" ("+(seatcounter[i][1]*100)/seatcounter[i][0]+"%)");
			}
		System.out.print("\n\nOperaci�n completada, pulsa una tecla e intro para continuar...");
		cs1.Keyboard.readString();
		}	
	}