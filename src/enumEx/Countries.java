package enumEx;

public enum Countries {
    NL("Nederland"),
    Be("Belgie"),
    SE("Zweden"),
    UK("Verenigd Koninkrijk"),
    IR("Ierland"),
    FR("Frankrijk"),
    DE("Duitsland"),
    IT("Italie"),
    SW("Zwitserland"),
    AU("Australie");

    public final String fullName;

    private Countries(String fullName){
        this.fullName = fullName;
    }
}
