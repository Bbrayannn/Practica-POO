package ejercisio8;

public abstract class inicio implements IExtremos {

    public static void main(String[] args) {
        Math2 math3 = new Math2();
        int []intArray={1,3,4,4,2};
        double[]doubleArray={2.3,4.5,3.4};
        
        System.out.println("minimo enteros"+math3.min(intArray));
        System.out.println("minimo decimaL"+math3.min(doubleArray));
        System.out.println("Maximo enteros"+math3.max(intArray));
        System.out.println("Maximo decimal"+math3.max(doubleArray));
    }
           

   
}

