/**
 * 
 */
package hissiohjelmisto;

/**
 * Hissi, johon liikutteluoperaatiot kohdistuvat
 * @author Joose Tikkanen
 * @version 29.10.2018
 *
 */
public class Hissi {
    
    private int sijainti = 1;
    private boolean huollossa = false;
    
    /**
     * Hissin konstruktori
     */
    public Hissi() {
        //
    }
    
    /**
     * Hissin liikuttaminen. Hissiä ei voi liikuttaa, jos se on huollossa ja liikuttaja ei ole huoltaja.
     * @param kerrosNro kerros johon hissi liikutetaan
     * @param onHuoltaja onko liikuttaja huoltaja
     * @return tiedon mihin hissi liikkuu tai virheilmoitus, jos hissi on huollossa
     */
    public String liikuta(int kerrosNro, boolean onHuoltaja) {
        if (huollossa && !onHuoltaja) return "Hissi on huollossa eikä ole käytettävissä";
        sijainti = kerrosNro;
        return "Hissi liikkuu kerrokseen " + sijainti;
    }

    /**
     * Hissin asetus huoltotilaan tai sen pois ottaminen.
     */
    public void vaihdaHuoltotila() {
        if(this.huollossa) huollossa = false;
        else huollossa = true;
        
    }


}
