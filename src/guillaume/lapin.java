package guillaume;

/**
 *
 * @author Sehrum
 */

public class lapin {
    private int age;
    private String nom;
    
    public lapin (int ageBebette, String nomBebette){
        age = ageBebette;
        nom = nomBebette;
    }
    
    public void scream (){
        System.out.println("HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

