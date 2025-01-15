package net.devgrr.springdemo.service;

import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import net.devgrr.springdemo.model.entity.Tutorial;
import net.devgrr.springdemo.repository.TutorialRepository;

import java.util.List;

@Server
@RequiredArgsConstructor
public class TutorialService {
    private final TutorialRepository tutorialRepository;

    public List<Tutorial> findAll() {
        return tutorialRepository.findAll();
    }

    public Tutorial findById(Long id) {
        return tutorialRepository.findById(id).orElse(null);
    }

    public Tutorial save(Tutorial tutorial) {
        return tutorialRepository.save(tutorial);
    }
}
