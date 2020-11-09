package org.dragan.service;

import org.dragan.model.Speaker;
import org.dragan.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("prod")
public class ProdSpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public ProdSpeakerServiceImpl() {
        System.out.println("ProdSpeakerServiceImpl no args constructor");
    }

    @Autowired
    public ProdSpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("ProdSpeakerServiceImpl repository constructor");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("ProdSpeakerServiceImpl setter");
        this.repository = repository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("ProdSpeakerServiceImpl PostConstruct: Initialize - called after the constructors");
    }
}
