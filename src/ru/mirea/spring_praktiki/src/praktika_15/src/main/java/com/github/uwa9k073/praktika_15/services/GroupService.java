package com.github.uwa9k073.praktika_15.services;

import com.github.uwa9k073.praktika_15.dtos.GroupDto;
import com.github.uwa9k073.praktika_15.entities.Group;
import com.github.uwa9k073.praktika_15.exceptions.ResourceNotFound;
import com.github.uwa9k073.praktika_15.repositories.GroupRepo;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class GroupService {

  private final GroupRepo groupRepo;


  public UUID createGroup(GroupDto groupDto) {
    var group = new Group(groupDto);

    groupRepo.save(group);

    return group.getId();
  }

  public Group getGroup(UUID id) {
    var group = groupRepo.findById(id);
    if (group.isEmpty()) {
      throw new ResourceNotFound();
    }
    return group.get();
  }

  public void deleteGroup(UUID id) {
    groupRepo.deleteById(id);
  }

  public void updateGroup(UUID id, GroupDto groupDto) {
    var optionalGroup = groupRepo.findById(id);
    if (optionalGroup.isEmpty()) {
      throw new ResourceNotFound();
    }
    var existingGroup = optionalGroup.get();
    existingGroup.setName(groupDto.getName());

    groupRepo.save(existingGroup);
  }
}
