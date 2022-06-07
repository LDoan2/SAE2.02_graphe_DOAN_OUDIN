import java.util.ArrayList;
import java.util.List;

public class Noeud {

    /**
     * Le nom du noeud
     */
    private String nom;
    /**
     * La liste des arcs associés
     */
    private List<Arc> adj;

    /**
     * Constructeur
     * @param n le nom du noeud
     */
    public Noeud(String n){
        this.nom = n;
        this.adj = new ArrayList<>();
    }
}
