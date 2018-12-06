/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interrogazione;

/**
 *
 * @author 75844087
 */
public class conto {
    private int conto;
    
    
    public conto (int conto) {
        this.conto=conto;
    }

    public int getConto() {
        return conto;
    }

    public void setConto(int conto) {
        this.conto = conto;
        
    }
    
    public void preleva(int importo) {
       setConto(getConto()-importo);
        
    }
    public void saldo() {
        System.out.println("Il tuo saldo ammonta a: "+getConto());
    }
    public void versa(int importo) {
        setConto(getConto()+importo);
           
    }
    
    
    
}
