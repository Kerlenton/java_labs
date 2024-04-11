package com.github.uwa9k073.praktika_16.services;

import com.github.uwa9k073.praktika_16.dtos.StudentDto;
import com.github.uwa9k073.praktika_16.entities.Student;
import com.github.uwa9k073.praktika_16.exceptions.ResourceNotFound;
import com.github.uwa9k073.praktika_16.repositories.StudentRepo;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class StudentService {

  private StudentRepo studentRepo;

  public UUID createStudent(StudentDto studentDto) {
    var student = new Student(studentDto);
    studentRepo.save(student);

    return student.getId();
  }

  public Student getStudent(UUID id) {
    var student = studentRepo.findById(id);
    if(student.isEmpty()){
      throw new ResourceNotFound();
    }
    return student.get();
  }

  public void deleteStudent(UUID id) {
    studentRepo.deleteById(id);
  }

  public void updateStudent(UUID id, StudentDto studentDto) {
    var optionalStudent = studentRepo.findById(id);
    if (optionalStudent.isEmpty()) {
      throw new ResourceNotFound();
    }

    var student = optionalStudent.get();
    student.setData(studentDto);

    studentRepo.save(student);
  }
}
