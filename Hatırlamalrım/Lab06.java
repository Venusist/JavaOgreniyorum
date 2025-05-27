/* Write the definition of three methods to evaluate the Euclidian distance. 
In one dimension: distance(float x1, float x2)
In two dimension: distance(float x1, float y1, float x2, float y2)
In three dimension: distance(float x1, float y1, float z1, float x2, float y2, float z2)
Both function will have same name.
The functions should return the calculated distance.
Use Math.sqrt() to calculate square root.
*/ 

public class Lab06 {
    public static float distance(float x1,float x2){
        return Math.abs(x2 - x1); 
        //abs kullanıyoruz  farkın mutlak değeri alınıyor çünkü mesafe negatif olamaz.
    }

    public static float distance(float x1, float y1, float x2, float y2){
        return (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        //Math.pow(..., 2): karesini alır.
        //Math.sqrt(...): karekök alır.
        //mesafe = karekök içinde x2-x1in karesi - y2-y1 in karesi
    }

    public static float distance(float x1, float y1, float z1, float x2, float y2, float z2) {
        return (float) Math.sqrt(
            Math.pow(x2 - x1, 2) +
            Math.pow(y2 - y1, 2) +
            Math.pow(z2 - z1, 2)
        );
    }

public static void main(String[] args){
    float distance1D = distance(2.0f, 5.0f);
    System.out.println("Distance in 1D: "+ distance1D);

    float distance2D = distance(1.0f, 2.0f, 4.0f, 6.0f);
            System.out.println("Distance in 2D: " + distance2D);

            float distance3D = distance(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f);
            System.out.println("Distance in 3D: " + distance3D);
}
}