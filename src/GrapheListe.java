import java.util.List;

public class GrapheListe implements Graphe {

    /**
     * Liste contenant le nom des noeuds du graphe
     */
    private List<String> ensNom;
    /**
     * Liste d'objet noeud permettant de stocker les arcs
     */
    private List<Noeud> ensNoeuds;

    /**
     *  Methode permettant de renvoyer la liste des noeurds
     * @return
     */
    @Override
    public List<String> listeNoeuds() {
        return null;
    }

    /**
     * Methode permettant d'afficher les arcs qui suivants le noeud n
     * @param n Le noeud selectionne
     * @return
     */
    @Override
    public List<Arc> suivants(String n) {
        return null;
    }
}
