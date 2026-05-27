

public class Test {
    public static void main(String[] args) {
        Gatter falsch = new Eingang(false);
        Gatter wahr = new Eingang(true);

        Gatter und = new BinaeresGatterUnd(falsch, wahr); // false UND true
        Gatter oder = new BinaeresGatterOder(und, wahr);  // (false UND true) ODER true
        Gatter nicht = new GatterNicht(oder);             // NICHT ((false UND true) ODER true)

        System.out.println(nicht.getOutput()); // false
        System.out.println(nicht.toString());  // (NICHT ((FALSCH UND WAHR) ODER WAHR))
    }
}

