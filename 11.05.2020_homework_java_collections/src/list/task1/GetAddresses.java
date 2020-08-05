package list.task1;

import java.util.LinkedList;
import java.util.List;

public class GetAddresses {

    public static List<Address> getAddresses(List<Person> persons) {
        List<Address> addressList = new LinkedList<>();
        for (Person p:persons) {
            addressList.add(p.address);
        }
        return addressList;
    }

}
