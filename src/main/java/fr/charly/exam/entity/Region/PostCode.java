package fr.charly.exam.entity.Region;

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
public class PostCode {
    private Long id;
    private String code;
    private List<City> cities = new ArrayList<>();

}
