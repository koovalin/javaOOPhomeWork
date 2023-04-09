package homeWork_1;

public class Node {
    public Node(Person first, Relationship rels, Person second) {
        this.first = first;
        this.rels = rels;
        this.second = second;
    }

    Person first;
    Relationship rels;
    Person second;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", first, rels, second);
    }

}
