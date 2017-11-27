
public class PowerPlant {
	private String gen_style;
	private GenStyleStrategy gen_style_strategy;
	
	PowerPlant(GenStyle vendor) {
		set_gen_style_strategy(vendor);
	}
	
	public String get_genstyle() {
		return this.gen_style;
	}
	
	public void set_genstyle(String genstyle) {
		this.gen_style = genstyle;
	}
	
	public void set_gen_style_strategy(GenStyle vendor) {
		switch (vendor) {
		case HYDRO:
			gen_style = "Hydro";
			gen_style_strategy = new HydroStrategy();
			break;
		case NUCLEAR:
			gen_style = "Nuclear";
			gen_style_strategy = new NuclearStrategy();
			break;
		case SOLAR:
			gen_style = "Solar";
			break;
		case STEAM:
			gen_style = "Steam"; 
			break;
		case WIND:
			gen_style = "Wind";
			break;
		default:
			System.out.println("Some kinda error!");
		}
	}
}
