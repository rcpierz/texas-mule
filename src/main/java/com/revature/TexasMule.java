/**
 * 
 */
package com.revature;

/**
 * @author RCP
 *
 */
public class TexasMule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ingredient1 = "Horse";
		String ingredient2 = "Donkey";
		TexasMule firstDrink = new TexasMule();
		
		String finishedFirstDrink = firstDrink.add(ingredient1, ingredient2);
		
		System.out.println(finishedFirstDrink);
	}

	public String add(String a, String b) {
		return a+b;
	}
}
