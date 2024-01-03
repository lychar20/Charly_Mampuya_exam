package fr.charly.exam.service;

import fr.charly.exam.entity.Digimon.DigimonCharacter;
import fr.charly.exam.repository.digimon.DigimonRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class DigimonApiService {

    private HttpClientService httpClientService = new HttpClientService();
    private DigimonRepository digimonRepository = new DigimonRepository();

    public DigimonCharacter getDigimonCharacter (int id) {
        String url = "https://digimon-api.vercel.app/api/digimon";
        String json = httpClientService.get(url);
        if (json.isEmpty()) {
            return null;
        }
        try {
            JSONTokener tokener = new JSONTokener(json);
            JSONObject object = new JSONObject(tokener);

            DigimonCharacter digimonCharacter = new DigimonCharacter();
            digimonCharacter.setId(object.getLong("id"));
            digimonCharacter.setName(object.getString("name"));
            digimonCharacter.setImage(object.getString("image"));
            digimonCharacter.setLevel(object.getString("level"));

            return digimonRepository.save(digimonCharacter);
        } catch (JSONException e) {
            System.out.println(json);
        }
        return null;
    }

    private String getNameFromJson(JSONObject firstObj, String key) {
        JSONObject secondObj = firstObj.getJSONObject(key);
        return secondObj.getString("name");
    }
}
