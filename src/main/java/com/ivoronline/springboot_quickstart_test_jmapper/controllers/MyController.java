package com.ivoronline.springboot_quickstart_test_jmapper.controllers;

import com.googlecode.jmapper.JMapper;
import com.ivoronline.springboot_quickstart_test_jmapper.dto.AuthorBookDTO;
import com.ivoronline.springboot_quickstart_test_jmapper.entities.Author;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("AddAuthorBook")
  public Author adAuthorBook(@RequestBody AuthorBookDTO authorBookDTO) {
    JMapper<Author, AuthorBookDTO> authorMapper = new JMapper<>(Author.class, AuthorBookDTO.class);
    Author author = authorMapper.getDestination(authorBookDTO);
    return author;
  }

}