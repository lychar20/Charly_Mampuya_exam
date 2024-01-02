package fr.charly.exam.entity.Region;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Department {
    private Long id;
    private String name;
    private String code;
    private Region region;

}
