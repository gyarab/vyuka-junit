import java.util.HashSet;

/**
 *
 * @author jlana
 */
public class MyTest {
    String name;

    public MyTest(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        MyTest t = (MyTest)obj;
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

    public static void main(String[] argv) {
        HashSet<MyTest> h = new HashSet<>();

        MyTest t1 = new MyTest("Jan");
        MyTest t2 = new MyTest("Pepa");

        h.add(t1);
        h.add(t2);

        System.out.println(h);
        t1.name = "Pepa";

        System.out.println(h);
    }
}
