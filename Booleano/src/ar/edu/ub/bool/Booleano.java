package ar.edu.ub.bool;

abstract public class Booleano {
	
	public static final Booleano VERDADERO = new Verdadero();
	public static final Booleano FALSO = new Falso();


	//--------------------------------------------------
	public abstract Booleano not();
	public abstract Booleano or(Booleano bool);
	public abstract Booleano and(Booleano bool);
	public abstract Booleano xor(Booleano bool);
	public abstract Booleano equals(Booleano bool);
	
}
