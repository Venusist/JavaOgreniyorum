public class Main {
    public static void main(String[] args) {
        Ev ev1 = new Ev();
        Ev ev2 = new Ev();
        ev2.camSekli = "KARE";
        ev2.evinYapilisYili = 2019;
        ev2.catiRengi = "MAVİ";
        ev2.kapininRengi = "KIRMIZI";

        System.out.println(ev2.kapininRengi);
        System.out.println(ev2.catiRengi);
        System.out.println(ev1.camSekli);
        System.out.println(ev2.camSekli);

    }
}
