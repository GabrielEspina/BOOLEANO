
import ar.edu.ub.bool.*;
import static ar.edu.ub.bool.Booleano.VERDADERO;
import static ar.edu.ub.bool.Booleano.FALSO;

public class Aplication {

	public static void main(String[] args) {
			Booleano TRUE = VERDADERO;
			Booleano FALSE = FALSO;
			
		
			//
			System.out.println("|\tP\t|\tQ\t|\tOR\t|\tAND\t|\tEQUALS\t|\tXOR\t|\t");
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("|\t"+TRUE.toString()+"\t|\t"+TRUE.toString()+"\t|\t"+TRUE.or(TRUE)+"\t|\t"+TRUE.and(TRUE)+"\t|\t"+TRUE.equals(TRUE)+"\t|\t"+TRUE.xor(TRUE)+"\t|");
			System.out.println("|\t"+TRUE.toString()+"\t|\t"+FALSE.toString()+"\t|\t"+TRUE.or(FALSE)+"\t|\t"+TRUE.and(FALSE)+"\t|\t"+TRUE.equals(FALSE)+"\t|\t"+TRUE.xor(FALSE)+"\t|");
			System.out.println("|\t"+FALSE.toString()+"\t|\t"+TRUE.toString()+"\t|\t"+FALSE.or(TRUE)+"\t|\t"+FALSE.and(TRUE)+"\t|\t"+FALSE.equals(TRUE)+"\t|\t"+FALSE.xor(TRUE)+"\t|");
			System.out.println("|\t"+FALSE.toString()+"\t|\t"+FALSE.toString()+"\t|\t"+FALSE.or(FALSE)+"\t|\t"+FALSE.and(FALSE)+"\t|\t"+FALSE.equals(FALSE)+"\t|\t"+FALSE.xor(FALSE)+"\t|");
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("NOT "+TRUE.toString()+" = " + TRUE.not());
			System.out.println("NOT "+FALSE.toString()+" = " + FALSE.not());
			
			
			/*
			System.out.println("Que soy: "+True.toString());
			System.out.println();
			
			System.out.println("NOT> "+True.not().toString());
			System.out.println("OR [VERDADERO]> "+True.or(True).toString());
			System.out.println("OR [FALSO]> "+True.or(False).toString());
			System.out.println("AND [VERDADERO]> "+True.and(True).toString());
			System.out.println("EQUALS [FALSO]> "+True.equals(False).toString());
			System.out.println("EQUALS [VERDADERO]> "+True.equals(True).toString());
			*/
	}
}
