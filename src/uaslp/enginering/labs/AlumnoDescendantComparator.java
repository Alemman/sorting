package uaslp.enginering.labs;

public class AlumnoDescendantComparator implements Comparator{
    public int compare(Object left, Object right) {
        String lastName1 = (String)((Alumno) left).getLastName();
        String lastName2 = (String)((Alumno) right).getLastName();

        int a = lastName1.compareTo(lastName2);

        if (a == 0){
            String firstName = (String)((Alumno)right).getFirstName();
            a = firstName.compareTo((String)((Alumno)left).getFirstName());
        }

        return a;
    }
}
