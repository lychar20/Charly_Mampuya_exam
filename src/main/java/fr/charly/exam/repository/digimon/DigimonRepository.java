package fr.charly.exam.repository.digimon;

import fr.charly.exam.entity.Digimon.DigimonCharacter;
import fr.charly.exam.repository.AbstractRepository;

import java.sql.ResultSet;

public class DigimonRepository extends AbstractRepository<DigimonCharacter> {


    public DigimonRepository() {
        super("Digimon");
    }

    @Override
    protected DigimonCharacter update(DigimonCharacter object) {
        return null;
    }

    @Override
    protected DigimonCharacter insert(DigimonCharacter object) {
        return null;
    }

    @Override
    protected DigimonCharacter getObject(ResultSet rs) {
        return null;
    }
}
