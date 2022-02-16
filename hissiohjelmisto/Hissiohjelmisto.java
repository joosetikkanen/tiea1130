/**
 * 
 */
package hissiohjelmisto;

/**
 * Hissiohjelmisto välittää käyttäjän viestit hissi-oliolle.
 * @author Joose Tikkanen
 * @version 29.10.2018
 *
 */
public class Hissiohjelmisto {
    
    private Hissi hissi = new Hissi();
    
    /**
     * Hissiohjelmiston konstruktori
     */
    public Hissiohjelmisto() {
        //
    }


    /**
     * Hissi-olion liikuttaminen. Liikutusoperaatiot tulostetaan näytölle.
     * @param kerrosNro mihin kerrokseen hissiä liikutetaan
     * @param onkoHuoltaja tieto onko hissin liikuttaja huoltaja
     */
    public void liikutaHissia(int kerrosNro, boolean onkoHuoltaja) {
        System.out.println(hissi.liikuta(kerrosNro, onkoHuoltaja));
        
    }


    /**
     * Hissin-olion asettaminen huoltotilaan tai huoltotilan poisotto.
     */
    public void vaihdaHuoltotila() {
        hissi.vaihdaHuoltotila();
        
    }

}
