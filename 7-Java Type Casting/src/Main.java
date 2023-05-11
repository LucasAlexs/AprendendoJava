// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;   //Automatic casting: int to double
        double myDoubleA = 9.78d;
        int myIntA = (int) myDouble;   //manual casting: double to int

        System.out.println(myInt);     //outputs 9
        System.out.println(myDouble);  //outputs 9.0
        System.out.println(myDoubleA); //outputs 9.78
        System.out.println(myIntA);    //outputs 9

    }
}