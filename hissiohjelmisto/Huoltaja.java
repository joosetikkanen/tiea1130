/**
 * 
 */
package hissiohjelmisto;

/**
 * Huoltajat ovat k‰ytt‰ji‰, jotka pystyv‰t asettamaan hissin huoltotilaan ja ottamaan huoltotilan pois.
 * Hissin ollessa huoltotilassa vain huoltaja voi k‰ytt‰‰ hissi‰.
 * @author Joose Tikkanen
 * @version 29.10.2018
 *
 */
public class Huoltaja extends Kayttaja {

    /**
     * Huoltaja k‰ytt‰‰ Kayttaja-luokan konstruktoria tunnistautuakseen huoltajaksi.
     */
    public Huoltaja() {
        super(true);
    }
    
    /**
     * Asettaa hissin huoltotilaan, jolloin hissi‰ voi k‰ytt‰‰ vain huoltaja itse. 
     */
    public void vaihdaHuoltotila() {
        ohjelmisto.vaihdaHuoltotila();
    }

}
