
public class jstrat {

	public static void main(String[] args) {
		
		GenStyle genstyle = GenStyle.HYDRO;
		PowerPlant motherboard = new PowerPlant(genstyle);
		
		
		System.out.println(motherboard.get_genstyle());
		
		/*
		 * Changing to Nuclear
		 */
		motherboard.set_gen_style_strategy(GenStyle.NUCLEAR);
		System.out.println(motherboard.get_genstyle());
		
		/*
		 * Changing to Solar
		 */
		motherboard.set_gen_style_strategy(GenStyle.SOLAR);
		System.out.println(motherboard.get_genstyle());
		
		/*
		 * Steam and Wind to follow.
		 * 
		 * motherboard.set_gen_style_strategy(GenStyle.STEAM);
		 * motherboard.set_gen_style_strategy(GenStyle.WIND);
		 */
	}

}
