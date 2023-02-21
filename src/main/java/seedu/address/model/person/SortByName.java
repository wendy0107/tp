package seedu.address.model.person;

import java.util.Comparator;

/**
 * Class contains methods to compare person's names for sorting
 */
public class SortByName implements Comparator<Name> {

    @Override
    public int compare(Name n1, Name n2) {
        String lowerCaseN1 = n1.fullName.toLowerCase();
        String lowerCaseN2 = n2.fullName.toLowerCase();
        return lowerCaseN1.compareTo(lowerCaseN2);
    }
}
