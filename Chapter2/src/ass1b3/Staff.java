package ass1b3;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Staff {
    String name, address;

    Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract double calculateSalary();
}
