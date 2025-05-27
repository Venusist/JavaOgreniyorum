
class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width*height*depth;
    }
}
public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(); // !!!!! isme dikkat et box olarak yazdık çünkü onları kullnaıdk 
        double vol;
    
        mybox1.width =3; 
        mybox1.height =1;
        mybox1.depth =2;

        vol = mybox1.volume();
        System.out.println("Volume is "+vol);
    }
    
}
