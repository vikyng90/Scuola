
package scuola;
public class Scuola {


    public static void main(String[] args) {
    Alunno alunno1 = new Alunno ( "Giovanni", "Barrichello", 2002, "Roma", true);
    Alunno alunno2 = new Alunno ( "Vincenzo", "Tancredi", 2003, "Foggia", false);
    Alunno alunno3 = new Alunno ( "Luigi", "Buffon", 2001, "Carrara", false);
	
	alunno1.aggiungiAlunno(alunno1);
	alunno2.aggiungiAlunno(alunno2);
	alunno3.aggiungiAlunno(alunno3);
    }
    
}
