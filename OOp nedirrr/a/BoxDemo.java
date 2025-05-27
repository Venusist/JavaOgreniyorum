   class Box {
        double width;
        double height;
        double depth;
}
   //this class declares an objects of type Box

   class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        //assign values to my boxs instance variables

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

    //compute volume of box
    vol = mybox.width * mybox.height * mybox.depth;

    System.out.println("Volume is " + vol);
   }
}
