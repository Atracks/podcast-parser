package ru.bravery_and_stupidity.podcast_parser.repository;

import org.springframework.stereotype.Component;
import ru.bravery_and_stupidity.podcast_parser.model.Category;

import java.util.List;

@Component
final public class CategoryRepository implements Repository<Category> {
    //TODO
    @Override
    public void add(Category item) {

    }

    @Override
    public void add(Iterable<Category> iterable) {

    }

    @Override
    public void update(Category item) {

    }

    @Override
    public void remove(Category item) {

    }

    @Override
    public void remove(SqlSpecification specification) {

    }

    @Override
    public List<Category> query(SqlSpecification specification) {
        return null;
    }
}
