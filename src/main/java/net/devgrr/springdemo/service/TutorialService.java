package net.devgrr.springdemo.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import net.devgrr.springdemo.model.entity.Tutorial;
import net.devgrr.springdemo.repository.TutorialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    @PostConstruct
    public void init() {
        Tutorial tutorial1 = new Tutorial();
        tutorial1.setName("John Doe");
        tutorial1.setEmail("john.doe@example.com");
        tutorialRepository.save(tutorial1);

        Tutorial tutorial2 = new Tutorial();
        tutorial2.setName("Jane Lee");
        tutorial2.setEmail("jane.lee@example.com");
        tutorialRepository.save(tutorial2);
    }
}
