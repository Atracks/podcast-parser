package ru.bravery_and_stupidity.podcast_parser.repository;

import org.springframework.stereotype.Component;
import ru.bravery_and_stupidity.podcast_parser.model.Podcast;

import java.util.List;

@Component
public class PodcastRepository implements Repository<Podcast> {
    //TODO
    @Override
    public void add(Podcast item) {

    }

    @Override
    public void add(Iterable<Podcast> iterable) {

    }

    @Override
    public void update(Podcast item) {

    }

    @Override
    public void remove(Podcast item) {

    }

    @Override
    public void remove(SqlSpecification specification) {

    }

    @Override
    public List<Podcast> query(SqlSpecification specification) {
        return null;
    }
}
