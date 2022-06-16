public class MainGenGraph {

    public static void main(String[] args) {

        GenererGraphe gen = new GenererGraphe(10);

        System.out.println(gen.toString());

        System.out.println(gen.digraph());


        Dijkstra dijkstra = new Dijkstra();
        BellmanFord bellmanFord = new BellmanFord();
        long debut = System.nanoTime();
        Valeur val = bellmanFord.resoudre(gen, "2");
        long fin = System.nanoTime();
        long duree = fin - debut;




        System.out.println(val.toString());
        System.out.println(duree);
    }
}
