package org.dragan.service;

import org.dragan.model.Speaker;
import org.dragan.repository.HibernateSpeakerRepositoryImpl;
import org.dragan.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
