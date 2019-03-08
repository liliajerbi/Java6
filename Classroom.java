class Classroom {
	public static void main (String [] args){
		// la reference josephine reçoit une nouvelle instance de la classe Wilder
			Wilder josephine = new Wilder ("Josephine") ;
			
	
		// Utilisation des getters
		System.out.println("Je m'appelle " + josephine.getFirstname());
		
		//setter
		josephine.setAware(true);

		//methode whoAmI
		System.out.println (josephine.whoAmI());
		
		
		Wilder paul = new Wilder ("Paul");
		paul.setAware(true);
		System.out.println(paul.whoAmI());

		
		Wilder nicolas = new Wilder ("Nicolas");
		nicolas.setAware(false);
		System.out.println(nicolas.whoAmI());
	}

}
