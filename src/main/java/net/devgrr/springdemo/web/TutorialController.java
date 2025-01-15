package net.devgrr.springdemo.web;

import lombok.RequiredArgsConstructor;
import net.devgrr.springdemo.model.entity.Tutorial;
import net.devgrr.springdemo.service.TutorialService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tutorial")
@RequiredArgsConstructor
public class TutorialController {
    private final TutorialService tutorialService;

    @GetMapping("")
    public List<Tutorial> findAll() {
        return tutorialService.findAll();
    }

    @PostMapping("")
    public Tutorial save(@RequestBody Tutorial tutorial) {
        return tutorialService.save(tutorial);
    }
}
