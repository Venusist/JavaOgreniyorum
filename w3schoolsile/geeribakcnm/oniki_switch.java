public class oniki_switch {
    public static void main(String[] args) {

        int day = 4; // Haftanın 4. günü: Perşembe
        switch (day) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}

/*Java'nın switch ifadesini yeni "rule switch" (kurallı switch) yapısına çevirmeyi önermesinden kaynaklanıyor.

Java 12 ve üstü sürümlerde, switch ifadesini daha kısa ve okunaklı hale getiren "switch expression" özelliği getirildi. */

/* YENİSİ
 * switch (day) {
    case 1 -> System.out.println("Today is Monday");
    case 2 -> System.out.println("Today is Tuesday");
    default -> System.out.println("Looking forward to the Weekend");
}
 */