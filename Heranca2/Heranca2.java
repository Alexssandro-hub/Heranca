package heranca2;

/**
 *
 * @author Alexssandro
 */
public class Heranca2 {

    public static void main(String[] args) {
       //Pessoa p1 = new Pessoa();
       /* Visitante v1= new Visitante();
       v1.setNome("Alexssandro");
       v1.setIdade(20);
       v1.setSexo ("Masculino");
       System.out.println (v1.toString());
       */
       
       Aluno a1= new Aluno();
       a1.setNome("Stuart");
       a1.setMatricula(2222);
       a1.setSexo("Masculino");
       a1.pagarMensalidade(); 
       
       bolsista b1 = new bolsista();
       b1.setNome ("Alex");
       b1.setMatricula(1111);
       b1.setBolsa (12.5f);
       b1.setSexo ("Masculino");
    }
    
}
