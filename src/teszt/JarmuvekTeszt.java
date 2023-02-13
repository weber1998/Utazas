package teszt;

import modell.Jarmu;
import modell.Auto;

//class Hajo extends Jarmu() 

public class JarmuvekTeszt {
    public static void main(String[] args) {
        new JarmuvekTeszt();
    }
    
    public JarmuvekTeszt() {
       // mintaSablonTeszt();
       haladBeinditassalTeszt();
       haladBeinditasNelkulTeszt();
       haladUzemanyagNelkulTeszt();
    }
    
    private void haladBeinditassalTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        auto.tankol();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "nem tud haladni, beindítva sem";
    }
    
    private void haladBeinditasNelkulTeszt() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "tud haladni, de nincs beindítva";
    }
    
    private void haladUzemanyagNelkulTeszt() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "tudna haladni, de nincs benne üzemanyag";
    }
    
    private void haladUzemanyaggallTeszt() {
        Auto auto = new Auto();
        auto.tankol();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "tud haladni, van benne üzemanyag";
    }
    
   private void csakLeallitvaTankolTeszt() {
        Auto auto = new Auto();
        auto.isBeinditva();
        boolean kapott = auto.isBeinditva();
        boolean vart = false;
        assert kapott == vart : "tankolunk a járó motorral";
    }
    
    public void mintaSablonTeszt() {
        int kapott = 7;
        int vart = 4;
        assert kapott == vart : "nem egyeznek";
    }

    
}
