/**
 * 
 */
package hissiohjelmisto;

/**
 * K�ytt�j�t liikuttavat hissi�
 * @author Joose Tikkanen
 * @version 29.10.2018
 *
 */
public class Kayttaja {
    
    private boolean onkoHuoltaja = false;
    private int kerrosNro = 1;
    /** Hissiohjelmisto, jota kaikki k�ytt�j�t k�ytt�v�t */
    protected static Hissiohjelmisto ohjelmisto = new Hissiohjelmisto();
    
    /**
     * perusk�ytt�j�n konstruktori
     */
    public Kayttaja () {
        //
    }
    
    /**
     * konstruktori Huoltaja-luokkaa varten
     * @param onkoHuoltaja huoltajan k�ytt�m� parametri, jolla tunnistautuu huoltajaksi
     */
    public Kayttaja(boolean onkoHuoltaja) {
        this.onkoHuoltaja = onkoHuoltaja;
    }
    
    
    /**
     * Hissi liikutetaan kerrokseen, josta k�ytt�j� kutsuu sit�
     */
    public void kutsuHissi() {
        ohjelmisto.liikutaHissia(kerrosNro, onkoHuoltaja);
    }
        
    /**
     * Hissin liikuttaminen tiettyyn kerrokseen
     * @param kerros kerrosnumero, johon hissi� liikutetaan
     */
    public void liikutaHissia(int kerros) {
        
        ohjelmisto.liikutaHissia(kerros, onkoHuoltaja);
        kerrosNro = kerros;
    }
            
  

}
