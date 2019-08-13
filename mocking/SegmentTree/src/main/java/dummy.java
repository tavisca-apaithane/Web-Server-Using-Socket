import java.util.function.BiConsumer;

public class dummy {

    public static void main(String[] args)
    {
        BiConsumer bi = (s,t) -> System.out.println(s + " " +t);
        bi.accept("abhishek","paithane");
    }

}
