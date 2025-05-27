    class Box{
        double width;
        double height;
        double depth;

        //Lets calculate volume
        double volume() {
            return width * height * depth;
        }
    }

    class BoxDemo2 {
        public static void main(String[] args) {
            Box selambox1 = new Box();
            Box selambox2 = new Box();
    
            //assigning instance variables
            selambox1.width = 10;
            selambox1.height = 20;
            selambox1.depth = 15;

            selambox2.width = 3;
            selambox2.height = 6;
            selambox2.depth = 9;

            System.out.println("The volume of box1 is " + selambox1.volume());
            System.out.println("The volume of box2 is " + selambox2.volume());

}
    }