package enumEx;

public class Vakantie {
    public static boolean kanGaan(Countries country){
        switch (country) {
            case AU:case Be:case DE:case FR:case IR:
                return true;
            case IT:case NL:case SE:case SW:case UK:
                return false;
        }
        return false;
    }
}
