package org.dragan.repository;

import org.dragan.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Dragan");
        speaker.setLastName("Nikolic");

        speakers.add(speaker);

        return speakers;
    }
}
