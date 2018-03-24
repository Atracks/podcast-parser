package ru.bravery_and_stupidity.podcast_parser.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.bravery_and_stupidity.podcast_parser.dto.CategoryDto;
import ru.bravery_and_stupidity.podcast_parser.model.Category;
import ru.bravery_and_stupidity.podcast_parser.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
  @Autowired
  CategoryService service;

  @RequestMapping(value = "/getList", method = RequestMethod.GET)
  @ResponseBody
  public List<CategoryDto> getList() {
    return Category.mapToDtos(service.getList());
  }
}
