import java.util.ArrayList;
import java.util.Comparator;

public class BrandComparator implements Comparator<Brand> {
    public BrandComparator(ArrayList<Brand> brands) {
    }

    public BrandComparator() {

    }

    @Override
    public int compare(Brand o1, Brand o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
