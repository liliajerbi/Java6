class Wilder {
	//Attributs
	private String firstname;
	private boolean aware;
	
	//Constructeurs 
	public Wilder (String firstname){
		this.firstname = firstname;
		this.aware = false;
	}

	//Accesseurs (getters)
	public String getFirstname(){
		return this.firstname;	
	}
	
	public boolean isAware(){
		return this.aware;		
	}
	
	
	//Mutateurs (setters) 
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}

	//Classe instanciée
	public String whoAmI () {
		if ( aware == false ){
			return "Je m'appelle "+ this.getFirstname() + " et je suis aware " ;
		} else {
			return "Je m'appelle "+ this.getFirstname() + " et je ne suis pas aware ";
		}
	}


}
