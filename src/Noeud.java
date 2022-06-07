import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class Noeud  {

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

    @Override
    public boolean equals(Object o){
        boolean res = true;

        if (this != o){
            res = false;
        }

        return res;
    }

    /**
     * Méthode permettant d ajouter un arc a la liste
     * @param destination La destination de l arc
     * @param cout la valeur associée
     */
    public void ajouterArc(String destination, double cout){
        this.adj.add(new Arc(destination, cout));
    }

    /**
     * Getter Nom
     * @return
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * get adj
     * @return
     */
    public List<Arc> getAdj(){
        return adj;
    }


}
