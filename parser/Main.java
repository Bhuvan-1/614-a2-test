import syntaxtree.Node;
import visitor.GJDepthFirst;

public class Main {

    public static void main(String[] args) {
        performAnalysis();
    }

    private static void performAnalysis() {
        try {
            Node root = new MiniJavaParser(System.in).Goal();
            root.accept(new GJDepthFirst(), null); // Create a new/modified visitor and implement the assignment.
        } catch (ParseException e) {
            System.out.println(e.toString());
        }
    }
}
