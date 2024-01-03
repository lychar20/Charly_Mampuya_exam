package fr.charly.exam.entity.Region;

import fr.charly.exam.entity.EntityInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class City implements EntityInterface {
    private Long id;
    private List<PostCode> postCodes = new ArrayList<>();
    private String siren;
    private int population;
    private String name;
    private String code;
    private Department department;
}
