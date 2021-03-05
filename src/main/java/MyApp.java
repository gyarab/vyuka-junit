import java.util.HashSet;

/**
 *
 * @author jlana
 */
public class MyApp {
    String name;

    public MyApp(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        MyApp t = (MyApp)obj;
        return name.equals(t.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }

    public String capitalizeFirstLetter() {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public static void main(String[] argv) {
        HashSet<MyApp> h = new HashSet<>();

        MyApp t1 = new MyApp("Jan");
        MyApp t2 = new MyApp("Pepa");

        h.add(t1);
        h.add(t2);

        System.out.println(h);
        t1.name = "Pepa";

        System.out.println(h);
    }
}
