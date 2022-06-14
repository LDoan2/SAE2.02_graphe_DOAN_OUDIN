import java.util.ArrayList;
import java.util.List;

public class GenererGraphe implements Graphe{

    private List<Noeud> noeuds;
    private List<String> nom;


    public GenererGraphe(int taille){
        // On initialise l'attribut
        this.noeuds = new ArrayList<Noeud>();

        // On genere au fur et a mesure des noeuds
        for (int i = 0; i < taille; i++){
            this.noeuds.add(new Noeud(""+ i));
        }
    }

    @Override
    public List<String> listeNoeuds() {
        return null;
    }

    @Override
    public List<Arc> suivants(String n) {
        return null;
    }
}
