package ar.edu.ub.bool;

class Falso extends Booleano{

	@Override
	public Booleano not() {
		// TODO Auto-generated method stub
		return Booleano.VERDADERO;
	}

	@Override
	public Booleano or(Booleano bool) {
		// TODO Auto-generated method stub
		return bool;
	}

	@Override
	public Booleano and(Booleano bool) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Booleano xor(Booleano bool) {
		// TODO Auto-generated method stub
		return bool;
	}

	@Override
	public Booleano equals(Booleano bool) {
		// TODO Auto-generated method stub
		return bool.not();
	}
	
	public String toString(){
		return "false";
	}

}
