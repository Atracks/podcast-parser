package ru.bravery_and_stupidity.podcast_parser.dto;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.jetbrains.annotations.NotNull;
import ru.bravery_and_stupidity.podcast_parser.model.Podcast;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@JsonNaming
public class PodcastDto {

    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Date date;

    @NotNull
    private String url;

    @NotNull
    public Long getId() {
        return id;
    }

    public void setId(@NotNull Long id) {
        this.id = id;
    }


    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @NotNull
    public Date getDate() {
        return date;
    }

    public void setDate(@NotNull Date date) {
        this.date = date;
    }

    @NotNull
    public String getUrl() {
        return url;
    }

    public void setUrl(@NotNull String url) {
        this.url = url;
    }

    @NotNull
    public Podcast mapToModel() {
        Podcast podcast = new Podcast();
        podcast.setId(id);
        podcast.setName(name);
        podcast.setUrl(url);
        podcast.setDate(date);
        return podcast;
    }

    @NotNull
    public static List<Podcast> mapToModels(@NotNull List<PodcastDto> podcasts) {
        return podcasts
                .stream()
                .map(PodcastDto::mapToModel)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
