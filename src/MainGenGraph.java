public class MainGenGraph {

    public static void main(String[] args) {

        GenererGraphe gen = new GenererGraphe(10);

        System.out.println(gen.toString());

        System.out.println(gen.digraph());
    }
}
