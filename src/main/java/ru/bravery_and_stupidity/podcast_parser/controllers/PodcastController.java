package ru.bravery_and_stupidity.podcast_parser.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.bravery_and_stupidity.podcast_parser.dto.PodcastDto;
import ru.bravery_and_stupidity.podcast_parser.model.Podcast;
import ru.bravery_and_stupidity.podcast_parser.service.PodcastService;

import java.util.List;

@RestController
@RequestMapping("/podcasts")
public class PodcastController {

    @Autowired
    PodcastService service;

    @RequestMapping(value = "/getList/{nameCategory}", method = RequestMethod.GET)
    @ResponseBody
    public List<PodcastDto> getListPodCasts(@PathVariable("nameCategory") String name) {
        return Podcast.mapToDtos(service.getList(name));
    }
}
