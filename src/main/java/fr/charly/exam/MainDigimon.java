package fr.charly.exam;


import fr.charly.exam.service.DigimonApiService;
import fr.charly.exam.service.Dump;

public class MainDigimon {
    public static void main(String[] args) {

        DigimonApiService dg = new DigimonApiService();
        for (int i = 0; i < 1300; i++) {
            dg.getDigimonCharacter(i);
            Dump.dump(i);
        }

       // DigimonCharacter digimonCharacter = dg.getDigimonCharacter();

    }
}