package homeWork_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    // метод поиска связи: родитель - ребенок, жена-муж
    public ArrayList<String> spend(Person p, Relationship rels) {
        for (Node t : tree) {
            if ((t.first.name == p.name) && (t.rels == rels)) result.add(t.second.name);
        }
        return result;
    }

    // метод поиска по возрасту
    public ArrayList<String> searchAge() {
        System.out.print("Введите ограничение по возрасту: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Люди, младше: " + age + ":");

        for (Node t : tree) {
            if (t.first.age <= age && !resultAge.contains(t.first.name)) {
                resultAge.add(t.first.name);
            }
        }
        return resultAge;
    }
}
