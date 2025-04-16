package ru.itgirl.libraryProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.libraryProject.model.dto.AuthorDto;
import ru.itgirl.libraryProject.model.service.AuthorService;

@RestController
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping("/author/{id}")
    AuthorDto getAuthorById(@PathVariable("id") long id) {
        return authorService.getAuthorById(id);
    }

    @GetMapping("/author")
    AuthorDto getAuthorByName(@RequestParam("name") String name) {
        return authorService.getAuthorByNameV1(name);
    }

    @GetMapping("/author/v2")
    AuthorDto getAuthorByName2(@RequestParam("name") String name) {
        return authorService.getAuthorByNameV1(name);
    }

    @GetMapping("/author/v3")
    AuthorDto getAuthorByNameV3(@RequestParam("name") String name) {
        return authorService.getAuthorByNameV1(name);
    }
}
