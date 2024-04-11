package com.github.uwa9k073.praktika_16.repositories;

import com.github.uwa9k073.praktika_16.entities.Group;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepo extends JpaRepository<Group, UUID> {

}
