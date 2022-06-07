/**
 * classe qui gere un arc
 */
public class Arc {

    /**
     * attribut String qui represente le nom du noeud destination de l'arc
     */
    private String dest;

    /**
     * attribut qui correspond au cout de l'arc
     */
    private double cout;

    /**
     * Constructeur de la classe Arc
     * @param d destination du noeud
     * @param c cout du de l'arc
     */
    public Arc(String d, double c){
        this.dest = d;
        this.cout = c;
    }

}
