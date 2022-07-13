package demo_mvc.service.impl;

import demo_mvc.model.Person;
import demo_mvc.model.Student;
import demo_mvc.model.Teacher;
import demo_mvc.service.IPersonService;

public class PersonService implements IPersonService {
    public static Person[] people;
    public static int count;

    static {
        count = 3;
        people = new Person[1000];
        people[0] = new Student(1, "Van Phuc", 5);
        people[1] = new Student(2, "Hoang Tu", 7);
        people[2] = new Teacher(3, "Hoang Yen", 8);
    }

    @Override
    public void findAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(people[i]);
        }

    }
}