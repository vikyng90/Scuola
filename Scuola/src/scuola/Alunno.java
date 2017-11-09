
package scuola;
import java.util.ArrayList;
public class Alunno {
   String nome;
   String cognome;
   int anno;
   String luogo;
   boolean bocciato;
    static ArrayList <Alunno> stud = new ArrayList <>();
	
	Alunno ( String n, String c, int a, String l, boolean b){
		nome = n;
		cognome = c;
		anno = a;
		luogo = l;
		bocciato = b;
	}
    void aggiungiAlunno(Alunno alunno){
    stud.add(alunno);
  }
    
   void stampaInfo(){
        System.out.println("Alunno: " + this.nome + " " + this.cognome);
        System.out.println("Nascita: " + this.anno + " " + this.luogo );
   }
  
  static void elencoAlunni() {
        for (Alunno alunno : stud) {
            alunno.stampaInfo();
        }
    }
}