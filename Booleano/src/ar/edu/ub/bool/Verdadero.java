package ar.edu.ub.bool;

 class Verdadero extends Booleano{

	@Override
	public Booleano not() {
		// TODO Auto-generated method stub
		return Booleano.FALSO;
	}

	@Override
	public Booleano or(Booleano bool) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Booleano and(Booleano bool) {
		// TODO Auto-generated method stub
		return bool;
	}

	@Override
	public Booleano xor(Booleano bool) {
		// TODO Auto-generated method stub
		return bool.not();
	}

	@Override
	public Booleano equals(Booleano bool) {
		// TODO Auto-generated method stub
		return bool;
	}
	
	public String toString(){
		return "true";
	}
	

}
