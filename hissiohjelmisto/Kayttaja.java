/**
 * 
 */
package hissiohjelmisto;

/**
 * Käyttäjät liikuttavat hissiä
 * @author Joose Tikkanen
 * @version 29.10.2018
 *
 */
public class Kayttaja {
    
    private boolean onkoHuoltaja = false;
    private int kerrosNro = 1;
    /** Hissiohjelmisto, jota kaikki käyttäjät käyttävät */
    protected static Hissiohjelmisto ohjelmisto = new Hissiohjelmisto();
    
    /**
     * peruskäyttäjän konstruktori
     */
    public Kayttaja () {
        //
    }
    
    /**
     * konstruktori Huoltaja-luokkaa varten
     * @param onkoHuoltaja huoltajan käyttämä parametri, jolla tunnistautuu huoltajaksi
     */
    public Kayttaja(boolean onkoHuoltaja) {
        this.onkoHuoltaja = onkoHuoltaja;
    }
    
    
    /**
     * Hissi liikutetaan kerrokseen, josta käyttäjä kutsuu sitä
     */
    public void kutsuHissi() {
        ohjelmisto.liikutaHissia(kerrosNro, onkoHuoltaja);
    }
        
    /**
     * Hissin liikuttaminen tiettyyn kerrokseen
     * @param kerros kerrosnumero, johon hissiä liikutetaan
     */
    public void liikutaHissia(int kerros) {
        
        ohjelmisto.liikutaHissia(kerros, onkoHuoltaja);
        kerrosNro = kerros;
    }
            
  

}
