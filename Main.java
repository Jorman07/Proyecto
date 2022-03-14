package EmpresaElectrica;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int op = -1;
		while(op!=0) {
			System.out.println("\n********MENU*******");
			System.out.println("<1> Presentar el total de MWh de consumo para dicha ciudad en dicha planta");
			System.out.println("<2> Presentar el total de MWh dada por la planta respectiva a la ciudad ingresada");
			System.out.println("<3> Presentar el dinero recaudado por región");
			System.out.println("<0> Salir");
			
			System.out.println("Ingrese opción: ");
			op = sc.nextInt(); 
			switch (op) {
			case 1:
				Scanner sc1=new Scanner(System.in);
				System.out.println("Ingrese el nombre de la planta electrica: ");
				String plantaElec = sc1.nextLine();
				plantaElec.toLowerCase();
				
				System.out.println("Ingrese el nombre de la ciudad: ");
				String ciudad = sc1.nextLine();
				ciudad.toLowerCase();
				
				Consumo_Energia cs = new Consumo_Energia(plantaElec, ciudad);
				cs.ConsumoMWh(plantaElec, ciudad);
				System.out.println(cs.toString());
				break;
			case 2:
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Ingrese el nombre de la ciudad: ");
				String ciudad1 = sc2.nextLine();
				ciudad1.toLowerCase();
				
				Consumo_Energia cs1 = new Consumo_Energia(ciudad1);
				Map mp = cs1.consumoPlantaPorCiudad(ciudad1);
				Iterator ite = mp.entrySet().iterator();
				System.out.println("Diccionario nuevo para la ciudad: "+ciudad1.toUpperCase());
				while (ite.hasNext()) {
					Map.Entry e = (Map.Entry) ite.next();
			        System.out.println(e.getKey() + " -> "+e.getValue());
				}
				break;
			case 3:
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Ingrese la region a consultar");
				System.out.println("<1> Costa \n<2> Sierra \n<3> Oriente");
				System.out.println("Ingrese la opcion: ");
				int opRegion = sc3.nextInt();
				
				dineroRecaudado dn =new dineroRecaudado();
				dn.dineroRecaudadoPorRegion(opRegion);
				System.out.println(dn.toString());
				
				break;
			default:
				break;
			}
		}
	}

}
