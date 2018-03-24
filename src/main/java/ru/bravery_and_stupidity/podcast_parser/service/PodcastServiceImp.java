package ru.bravery_and_stupidity.podcast_parser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bravery_and_stupidity.podcast_parser.model.Podcast;
import ru.bravery_and_stupidity.podcast_parser.repository.PodcastRepository;

import java.util.List;

@Service
public class PodcastServiceImp implements PodcastService {

    @Autowired
    PodcastRepository repository;

    @Override
    public List<Podcast> getList( String name) {
        //TODO
        return null;
    }
}
