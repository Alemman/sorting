package uaslp.enginering.labs;

import java.time.LocalDate;
import java.time.Month;

public class MonthComparator implements Comparator {
    @Override
    public int compare(Object left, Object right) {
        int r = 0;
        Month[] months = Month.values();
        Month monthLeft = (Month) ((Alumno) left).getBirthday().getMonth();
        Month monthRight = (Month) ((Alumno) right).getBirthday().getMonth();


        if(monthLeft.compareTo(monthRight) == 0)
           return 0;

        for (Month month : months) {
            if (monthLeft.compareTo(month) == 0)
                r = -1;
            if (monthRight.compareTo(month) == 0)
                r = 1;
        }


        return r;
    }
}
