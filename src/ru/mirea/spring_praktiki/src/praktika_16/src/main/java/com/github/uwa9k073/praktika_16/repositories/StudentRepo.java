package com.github.uwa9k073.praktika_16.repositories;

import com.github.uwa9k073.praktika_16.entities.Student;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, UUID> {

}
