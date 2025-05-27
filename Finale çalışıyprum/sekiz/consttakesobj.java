class Box {
    double width;
    double height;
    double depth;

    //constructor tajes an objects of type box.
    /*Bu constructor'ın amacı:
    eğer zaten tanımlanmış bir Box nesnesi varsa 
    (örneğin mybox1), o kutunun tüm özelliklerini yeniden bir kutuya kopyalamak.
📦 Yani mybox2 = mybox1 gibi olur ama farklı adreslerde, farklı nesnelerdir. Biri değişince öbürü etkilenmez!*/
    Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //constructor used when provided all dimensions Bu bildiğimiz klasik constructor. Kullanıcıdan gelen değerlerle Box oluşturur.
    Box(double w, double h, double d) {
        width = w;
        height = h;
         depth = d ;
    }

    double volume() {
        return width*height*depth;
    }
}
class consttakesobj {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(mybox1);
        /* Bu satırda mybox1 nesnesini parametre olarak Box(Box ob) constructor'ına verdik.
Sonuç olarak mybox2 de aynı boyutlara sahip olacak ama ayrı bir nesne! */
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " +vol);
        vol = mybox2.volume();
        System.out.println("The volume of box2 =" +vol);
        
    }
}