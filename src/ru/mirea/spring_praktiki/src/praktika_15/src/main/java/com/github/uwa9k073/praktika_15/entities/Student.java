package com.github.uwa9k073.praktika_15.entities;


import com.github.uwa9k073.praktika_15.dtos.StudentDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "students")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "middle_name")
  private String middleName;

  public Student(StudentDto studentDto) {
    this.firstName = studentDto.getFirstName();
    this.lastName = studentDto.getLastName();
    this.middleName = studentDto.getMiddleName();
  }

  public void setData(StudentDto studentDto){
    this.firstName = studentDto.getFirstName();
    this.lastName = studentDto.getLastName();
    this.middleName = studentDto.getMiddleName();
  }

}
