class Box {
    double width;
    double height;
    double depth;

    //this is the constructor for box
    Box() //Same name as the class
     {
        System.out.println("Constructing Box");
        width = 10;
        height = 2;
        depth = 3;
    }
    /*  🔸 Bu bir constructor (yapıcı metot):

Sınıfla aynı isimde olmalı: Box()
Geri dönüş türü yoktur (void bile yazılmaz).
Bu constructor çalışınca, otomatik olarak width=10, height=2, depth=3 olur.
Yani: new Box(); yazdığında bu constructor otomatik çalışır.
*/

    //compute and return volume
    double volume() {
        return width*height*depth;
    }
}
    class BoxDemo {
        public static void main(String[] args) {
            //declare allocate and initialize box objects
            Box mybox1= new Box();
            Box mybox2= new Box();

            double vol;

            vol = mybox1.volume();
            System.out.println("Volume is:" +vol);

            vol = mybox2.volume();
            System.out.println("Volume is:" +vol);
        }
    }