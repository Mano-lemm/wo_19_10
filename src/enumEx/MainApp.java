package enumEx;

public class MainApp{
    public static void main(String[] args) {
        for (Countries ctry : Countries.values()) {
            System.out.println("Het land " + ctry.fullName + " heeft als ordinal " + ctry.ordinal());
            if(Vakantie.kanGaan(ctry)){
                System.out.printf("Je kan op vakantie naar %s.\n", ctry.fullName);
            } else{
                System.out.printf("Je kan niet op vakantie naar %s.\n", ctry.fullName);
            }
        }
    }
}
