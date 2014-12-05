package guillaume;
/**
 *
 * @author Sehrum
 */
public class Guillaume {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("On dit merci qui???");
        lapin lap;
        lap = new lapin (82,"Jacquie & Michel");
        int i = 0;
        while (i <= 10){
            lap.scream();
            i++;
        }
    }
}