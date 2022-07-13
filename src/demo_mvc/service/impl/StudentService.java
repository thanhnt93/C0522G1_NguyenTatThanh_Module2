package demo_mvc.service.impl;

import demo_mvc.model.Student;
import demo_mvc.service.IStudentService;

public class StudentService implements IStudentService {

    @Override
    public void findAll() {
        for (int i = 0; i < PersonService.count; i++) {
            if (PersonService.people[i] instanceof Student) {
                System.out.println(PersonService.people[i]);
            }
        }

    }
}
