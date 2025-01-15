package net.devgrr.springdemo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TutorialRequest {
    private String name;
    private String email;
}
