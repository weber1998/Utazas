
package modell;

public class Auto extends Jarmu{
    
    private boolean defekt;

    public Auto(boolean defekt, boolean beinditva, boolean uzemanyag, boolean megerkezett, boolean halad) {
        super(beinditva, uzemanyag, megerkezett, halad);
        this.defekt = defekt;
    }

    public void kereketCserel() {
        if (defekt == true) {
            // kerékcsere
            defekt = false;
        }
    }
    
    public boolean halad() {
        if (isUzemanyag() == true && isMegerkezett() == false) {
            return true;
        } 
        return false;
    }
    
    
}
