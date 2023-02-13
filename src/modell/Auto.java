
package modell;

public class Auto extends Jarmu{
    
    private boolean defekt;

    public Auto() {
        super();
        defekt = false;
    }

    public void kereketCserel() {
        if (defekt == true) {
            // kerékcsere
            defekt = false;
        }
    }
    
    @Override
    public boolean halad() {
        boolean siker = false;
        if (this.isBeinditva() && this.isUzemanyag() ) {
            siker = true;
        }
        return siker; 
    }
       
}
