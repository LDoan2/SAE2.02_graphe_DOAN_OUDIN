import java.util.ArrayList;
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
        ArrayList<String> res = new ArrayList<String>();

        for (int i = 0; i < this.ensNoeuds.size(); i++){
            res.add(this.ensNoeuds.get(i).getNom());
        }

        return res;
    }

    /**
     * Methode permettant d'afficher les arcs qui suivants le noeud n
     * @param n Le noeud selectionne
     * @return
     */
    @Override
    public List<Arc> suivants(String n) {

        List<Arc> res = new ArrayList<Arc>();

        for (int i = 0; i < this.ensNoeuds.size(); i++){
            if (this.ensNoeuds.get(i).getNom().equals(n)){
                res = this.ensNoeuds.get(i).getAdj();
            }
        }

        return res;
    }

    /**
     * Methode permettant d ajouter un arc
     * @param depart le point de départ
     * @param destination la destination de l arc
     * @param cout le cout
     */
    public void ajouterArc(String depart, String destination, double cout){

        for (int i = 0; i < this.ensNoeuds.size(); i++){

            if (this.ensNoeuds.get(i).getNom().equals(depart)){
                this.ensNoeuds.get(i).ajouterArc(destination, cout);
            }
        }
    }

}
