package fr.charly.exam.entity.Region;

import fr.charly.exam.entity.EntityInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Region implements EntityInterface {
    private Long id;
    private String name;
    private String code;
}
