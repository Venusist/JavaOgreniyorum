//parametreli constructor
class Box {
    double width, height,depth;

    //this is the constructor for box
    Box(double w, double h ,double d) /*Şimdi constructor 3 parametre alıyor 
    Böylece artık her kutuya farklı boyutlar verebiliyorsun! 🎯*/
    {
        System.out.println("Constructing Box");
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width*height*depth;
    }
}
    class BoxDemo2 {
        public static void main(String[] args) {
            //declare allocate and initialize box objects
            Box mybox1= new Box(1,2,3);
            Box mybox2= new Box(2,4,6);

            double vol;

            vol = mybox1.volume();
            System.out.println("Volume is:" +vol);

            vol = mybox2.volume();
            System.out.println("Volume is:" +vol);
        }
    }