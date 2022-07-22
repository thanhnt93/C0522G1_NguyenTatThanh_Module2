package ss16_io_text_file.demo.service;

import ss16_io_text_file.demo.model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentService {
    void add() throws IOException;

    List<Student> findAll();
}
