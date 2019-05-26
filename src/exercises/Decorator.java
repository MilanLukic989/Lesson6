package exercises;

import java.util.ArrayList;

class Decorator {
	
	ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();

	void hang(Ornament orn) {
		boxOfDecorations.add(orn);
		System.out.println("Hanging a " + orn.getColor() +" ornament");
	}

	public static void main(String[] args) {
		String[] ornamentColor = { "Red", "Blue", "Green", "Black", "Yellow", "Orange", "White", "Purple", "Pink", "Brown", "Gray" };
		
		Decorator decoration = new Decorator();
		
		for (int i = 0; i < ornamentColor.length; i++) {
			Ornament orn = new Ornament(ornamentColor[i]);
			decoration.hang(orn);
			
		}

	}
}
