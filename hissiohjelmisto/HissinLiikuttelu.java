/**
 * 
 */
package hissiohjelmisto;

/**
 * Luokka hissiohjelmiston testausta varten
 * @author Joose Tikkanen
 * @version 29.10.2018
 *
 */
public class HissinLiikuttelu {

    /**
     * @param args - 
     */
    public static void main(String[] args) {
        Kayttaja peruskayttaja = new Kayttaja();
        Huoltaja huoltaja = new Huoltaja();
        Kayttaja peruskayttaja3 = new Kayttaja(true);
        
        peruskayttaja.kutsuHissi();                 //Hissi liikkuu kerrokseen 1
        peruskayttaja.liikutaHissia(5);             //Hissi liikkuu kerrokseen 5
        huoltaja.vaihdaHuoltotila();                //
        peruskayttaja.kutsuHissi();                 //Hissi on huollossa eikä ole käytettävissä
        peruskayttaja3.kutsuHissi();
        huoltaja.kutsuHissi();                      //Hissi liikkuu kerrokseen 1
        huoltaja.liikutaHissia(3);                  //Hissi liikkuu kerrokseen 3
        huoltaja.vaihdaHuoltotila();                //
        Kayttaja peruskayttaja2 = new Kayttaja();   //
        peruskayttaja2.kutsuHissi();                //Hissi liikkuu kerrokseen 1
        peruskayttaja2.liikutaHissia(4);            //Hissi liikkuu kerrokseen 4
        peruskayttaja.kutsuHissi();                 //Hissi liikkuu kerrokseen 5
        
    }

}
