/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author krisz
 */
public abstract class Jarmu {
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett, boolean halad) {
        this.beinditva = beinditva;
        this.uzemanyag = uzemanyag;
        this.megerkezett = megerkezett;
        this.halad = halad;
    }
    
    public void beindit() {
        if (beinditva == false) {
            beinditva = true;
        }
    }
    
    public void leallit() {
        if (beinditva == true) {
            beinditva = false;
        }
    }
    
    public boolean tankol() {
        if (isUzemanyag() == false && isMegerkezett() == true && isBeinditva() == false) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBeinditva() {
        return beinditva;
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public boolean isMegerkezett() {
        return megerkezett;
    }

    public void setBeinditva(boolean beinditva) {
        this.beinditva = beinditva;
    }

    public void setUzemanyag(boolean uzemanyag) {
        this.uzemanyag = uzemanyag;
    }

    public void setMegerkezett(boolean megerkezett) {
        this.megerkezett = megerkezett;
    }

    
    
    
    public boolean halad;
}
