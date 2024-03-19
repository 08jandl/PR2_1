// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Wrappers {
    public static void main(String[] args) {

        int primitiveInt = 17;
        // wrapping a primitive int in a Wrapper class
        Integer wrapperInt0 = primitiveInt;
        Integer wrapperInt1 = 17;
        //veraltet
        Integer wrapperInt2 = Integer.valueOf(primitiveInt);
        Integer wrapperInt3 = Integer.valueOf(17);

        double primitiveDouble = 1.2;
        // wrapping a primitive double in a Wrapper class
        Double wrappedDouble = 1.2;

        // Not possible to have a null value stored in a primitive datatype
//        int pint = null;
        // It is possible that a wrapper of a primitive datatype is null
        Integer wint = null;

        // unwrapping (veraltet)
        int intValue = wrapperInt0.intValue();
        // now works automatically to unwrap wrapper into primitive type
        int intVal = wrapperInt0;

    }
}