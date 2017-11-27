
public class jstrat {

	public static void main(String[] args) {
		

		GenStyle genstyle = GenStyle.HYDRO;
		PowerPlant motherboard = new PowerPlant(genstyle);
		
		System.out.println(motherboard.get_genstyle());
		motherboard.set_gen_style_strategy(GenStyle.NUCLEAR);
		System.out.println(motherboard.get_genstyle());
	}

}
