package org.dragan.repository;

import org.dragan.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public HibernateSpeakerRepositoryImpl() {
        System.out.println("HibernateSpeakerRepositoryImpl no arguments constructor");
    }

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
