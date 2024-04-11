package com.github.uwa9k073.praktika_16.contollers;

import com.github.uwa9k073.praktika_16.dtos.StudentDto;
import com.github.uwa9k073.praktika_16.exceptions.ResourceNotFound;
import com.github.uwa9k073.praktika_16.services.StudentService;
import java.net.URI;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/student")
@AllArgsConstructor
@Slf4j
public class StudentController {

  private StudentService service;

  @GetMapping("/{id}")
  public ResponseEntity<?> getGroup(@PathVariable UUID id) {
    try {
      return ResponseEntity.ok(service.getStudent(id));
    } catch (ResourceNotFound e) {
      log.warn(e.getMessage());
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping
  public ResponseEntity<?> createGroup(@RequestBody StudentDto studentDto) {
    var id = service.createStudent(studentDto);
    return ResponseEntity.created(URI.create(String.format("/v1/student/%s", id.toString()))).build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteGroup(@PathVariable UUID id) {
    try {
      service.deleteStudent(id);
      return ResponseEntity.noContent().build();
    } catch (ResourceNotFound e) {
      log.warn(e.getMessage());
      return ResponseEntity.notFound().build();
    }
  }

  @PutMapping("/{id}")
  public ResponseEntity<?> updateGroup(@PathVariable UUID id, @RequestBody StudentDto studentDto) {
    try {
      service.updateStudent(id, studentDto);
      return ResponseEntity.ok().build();
    } catch (ResourceNotFound e) {
      log.warn(e.getMessage());
      return ResponseEntity.notFound().build();
    }
  }
}
