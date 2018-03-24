package ru.bravery_and_stupidity.podcast_parser.repository;

import java.util.List;

public interface Repository<T> {
    void add(T item);
    void add(Iterable<T> iterable);
    void update(T item);
    void remove(T item);
    void remove(SqlSpecification specification);
    List<T> query(SqlSpecification specification);
}
