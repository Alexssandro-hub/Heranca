package heranca2;

/**
 *
 * @author Alexssandro
 */
public class bolsista extends Aluno {
    
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando Bolsa de "+ this.getNome());
        
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public void pagarMensalidade() {
        
        System.out.println(this.getNome() + " é bolsista! Pagamento Facilitado.");
        
    }
            
    
}
