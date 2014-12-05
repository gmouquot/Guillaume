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
        System.out.println("Hello world biatches");
        lapin lap;
        lap = new lapin (82,"michel");
        int i = 0;
        while (i <= 10){
            lap.scream();
            i++;
        }
    }
}