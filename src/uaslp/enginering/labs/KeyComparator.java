package uaslp.enginering.labs;

public class KeyComparator implements Comparator{
    @Override
    public int compare(Object left, Object right) {
        Integer integerLeft = (Integer) ((Alumno)left).getClave();
        Integer integerRight = (Integer) ((Alumno)right).getClave();

        return  integerRight - integerLeft;
    }
}
