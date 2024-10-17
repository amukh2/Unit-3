package math_class;

/**
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Math.html
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //using math class which is a static class
        //static things (methods and variables) belong to the class rather than
        //objects (instance of the class)
        //we don't need to create an object since Math class is static
        // ClassName.methodName(); e.g. Math.random()
        // ClassName.staticVariableName(); e.g. Math.PI
    double myPI = Math.PI;
        // abs
        System.out.println(Math.abs(-1));
        // pow
        System.out.println(Math.pow(3,3));
        // sqrt
        System.out.println(Math.sqrt(80));



        //create a random number in the range [0,1)
        System.out.println(Math.random());
        //create a random number in the range [0, n)
        //example: [0,6)
        System.out.println(Math.round(Math.random()*6));

        // 1) create a random integer in the range [m,n]
        int m = 33;
        int n = 97;

        System.out.println((int)(Math.round(Math.random()*(n-m)+m)));

        // 2) create a random negative integer in the range [-m,0]

        System.out.println((int)(Math.round(Math.random()*(-1)*(m))));

        // 3) create a random negative integer in the range [-m,-n]

        System.out.println((int)(-1*(Math.round(Math.random()*(n-m)+m))));

        // 4) create a random negative integer in the range [-m,n]

        System.out.println((int)(Math.round(Math.random()*(n+m)-m)));



        //using the Random Class
        //This is not static so we have to create a Random object

        //create a Random object
        Random randObj = new Random();

        //get int with and without bound
        int randInt = randObj.nextInt();
        System.out.println(randInt);
        int randIntSmaller = randObj.nextInt(100);
        System.out.println(randIntSmaller);

        // get double
        double randDouble = randObj.nextDouble();
        System.out.println(randDouble);

        double randDouble2 = randObj.nextDouble(50,100);
        System.out.println(randDouble2);



    }
}
