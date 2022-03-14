package EmpresaElectrica;

import java.util.HashMap;
import java.util.Map;

public class Consumo_Energia {
	private String planta;
	private String ciudad;
	private int totalMWh;
	private int consumoQuito [] = {400, 432, 400, 432, 420, 432, 460, 432, 400, 432, 300 , 213};
	private int consumoGuayaq [] =  {120, 55, 32, 120, 75, 32, 150, 55, 32, 120, 97, 32};
	private int consumosGSopl[]= {310, 220, 321, 310, 220, 321, 310, 220, 321, 310, 220, 321};
	private int consumoQSop []= {400, 432, 587, 400, 432, 587, 400, 432, 587, 400, 432, 587};
	private int consumoLojaSo [] = {50, 32, 32, 50, 32, 32, 50, 32, 32, 50, 32, 32};
	
	public Consumo_Energia(String planta, String ciudad) {
		super();
		this.planta = planta;
		this.ciudad = ciudad;
	}
	
	public Consumo_Energia(String ciudad) {
		super();
		this.ciudad = ciudad;
	}
	
	public Map consumoPlantaPorCiudad(String ciudad) {
		Map<String, Integer> mp = new HashMap<>();
		if(this.ciudad.equals("guayaquil")) {
			for(int i = 0; i<this.consumoGuayaq.length;i++) {
				this.totalMWh += this.consumoGuayaq[i];
			}
			mp.put("Coca codo Sinclair",this.totalMWh );
			this.totalMWh=0;
			for(int i = 0; i<this.consumosGSopl.length;i++) {
				this.totalMWh += this.consumosGSopl[i];
			}
			mp.put("Sopladora",this.totalMWh );
			
		}if (this.ciudad.equals("quito")) {
			for (int i = 0; i < consumoQuito.length; i++) {
				this.totalMWh += this.consumoQuito[i];
			}
			mp.put("Coa Codo Sinclair", this.totalMWh);
			this.totalMWh=0;
			for (int i = 0; i < consumoQSop.length; i++) {
				this.totalMWh += this.consumoQSop[i];
			}
			mp.put("Sopladora", this.totalMWh);
			
		}if (this.ciudad.equals("loja")) {
			for (int i = 0; i < consumoLojaSo.length; i++) {
				this.totalMWh += this.consumoLojaSo[i];
			}
			mp.put("Sopladora", this.totalMWh);
			
		}
	return mp;
	}


	public int ConsumoMWh(String planta, String ciudad) {
		
		if (this.planta.equals("coca codo sinclair")) {
			if(this.ciudad.equals("quito")) {
				for (int i = 0;i<this.consumoQuito.length;i++) {
					this.totalMWh += this.consumoQuito[i];
				}
			}if(this.ciudad.equals("guayaquil")) {
				for (int i = 0;i<this.consumoGuayaq.length;i++) {
					this.totalMWh += this.consumoGuayaq[i];
				}
			}
		}if (this.planta.equals("sopladora")) {
			if(this.ciudad.equals("guayaquil")) {
				for (int i = 0;i<this.consumosGSopl.length;i++) {
					this.totalMWh += this.consumosGSopl[i];
				}
			}if(this.ciudad.equals("quito")) {
				for (int i = 0;i<this.consumoQSop.length;i++) {
					this.totalMWh += this.consumoQSop[i];
				}
			}if(this.ciudad.equals("loja")) {
				for (int i = 0;i<this.consumoLojaSo.length;i++) {
					this.totalMWh += this.consumoLojaSo[i];
				}
			}
		}
		return this.totalMWh;
	}

	public String getPlanta() {
		return planta;
	}

	public String getCiudad() {
		return ciudad;
	}

	public int getTotalMWh() {
		return totalMWh;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setTotalMWh(int totalMWh) {
		this.totalMWh = totalMWh;
	}


public String toString() {
	// TODO Auto-generated method stub
	return "Planta: "+planta.toUpperCase()+"\tCiudad: "+ciudad.toUpperCase()+"\tTotal de Megavatios por hora (MWh): "+totalMWh;
}
}
