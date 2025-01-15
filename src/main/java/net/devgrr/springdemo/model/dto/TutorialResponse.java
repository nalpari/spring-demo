package net.devgrr.springdemo.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TutorialResponse {
    private Long id;
    private String name;
    private String email;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private final String createdDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private final String updatedDate;
}
