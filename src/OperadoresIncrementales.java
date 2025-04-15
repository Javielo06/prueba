public class OperadoresIncrementales {
    public static void main(String[] args) {

        //PRE INCREMENTTO
        int i = 1;
        int j = ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // POST INCREMENTO  PRIMERO ASIGNA Y DESPUES INCREMENTA
        i = 2;
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //PRE DECREMENTO
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //POST DECREMENTO

        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(j) = " + (++j));
        System.out.println("(++j) = " + (j++));

        System.out.println("j = " + j);

    }
}
