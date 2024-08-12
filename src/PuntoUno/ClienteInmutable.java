package PuntoUno;

import java.util.ArrayList;
import java.util.List;

public final class ClienteInmutable {
    private final  String  name;
    private final  String lastName;
    private final  int age;
    private final List<String> phones;

    public ClienteInmutable(String name, String lastName, int age, List<String> phones) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phones = new ArrayList<>(phones);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<String> getPhones() {
        return new ArrayList<>(phones);
    }
}
