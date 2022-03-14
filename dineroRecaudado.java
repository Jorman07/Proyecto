package EmpresaElectrica;

public class dineroRecaudado {
	private double totaldinero;
	private int totalconsumo;
	private String region;
	private int consumoQuito [] = {400, 432, 400, 432, 420, 432, 460, 432, 400, 432, 300 , 213};
	private int tarifaQuito = 65;
	private int consumoGuayaq [] =  {120, 55, 32, 120, 75, 32, 150, 55, 32, 120, 97, 32};
	private int tarifaGuayaquil = 84;
	private int consumosGSopl[]= {310, 220, 321, 310, 220, 321, 310, 220, 321, 310, 220, 321};
	private int tarifaGso = 55;
	private int consumoQSop []= {400, 432, 587, 400, 432, 587, 400, 432, 587, 400, 432, 587};
	private int tarifaQSop = 79;
	private int consumoLojaSo [] = {50, 32, 32, 50, 32, 32, 50, 32, 32, 50, 32, 32};
	private int tarifaLoj = 32;
	
	public double dineroRecaudadoPorRegion(int op) {
		if(op==1) {
			this.region ="Costa";
			for (int i = 0; i < consumoGuayaq.length; i++) {
				totalconsumo += this.consumoGuayaq[i];
			}
			this.totaldinero = this.totalconsumo*this.tarifaGuayaquil;
			for (int i = 0; i < consumosGSopl.length; i++) {
				totalconsumo += this.consumosGSopl[i];
			}
			this.totaldinero = this.totalconsumo*this.tarifaGso;
			this.totaldinero += this.totaldinero;
			
		}
		if(op==2)
		{
			this.region = "Sierra";
			for (int i = 0; i < consumoQuito.length; i++) {
				totalconsumo += this.consumoQuito[i];
			}
			this.totaldinero = totalconsumo * this.tarifaQuito;
			for (int i = 0; i < consumoQSop.length; i++) {
				totalconsumo += this.consumoQSop[i];
			}
			this.totaldinero = totalconsumo *this.tarifaQSop;
			this.totaldinero += this.totaldinero;
			for (int i = 0; i < consumoLojaSo.length; i++) {
				totalconsumo += this.consumoLojaSo[i];
			}
			this.totaldinero = totalconsumo * this.tarifaLoj;
			this.totaldinero += this.totaldinero;
		}
		if(op == 3)
		{
			this.region = "Oriente";
			this.totaldinero = 0;
		}
		return this.totaldinero;
	}

	public double getTotaldinero() {
		return totaldinero;
	}

	public int getTotalconsumo() {
		return totalconsumo;
	}

	public String getRegion() {
		return region;
	}

	public void setTotaldinero(int totaldinero) {
		this.totaldinero = totaldinero;
	}

	public void setTotalconsumo(int totalconsumo) {
		this.totalconsumo = totalconsumo;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Region: "+region+"\tConsumo total: "+getTotalconsumo()+"\tDinero Recaudado: $"+totaldinero;
	}
}
