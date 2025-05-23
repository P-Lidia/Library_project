package ru.itgirl.libraryProject.model.service;

import ru.itgirl.libraryProject.model.dto.AuthorCreateDto;
import ru.itgirl.libraryProject.model.dto.AuthorDto;
import ru.itgirl.libraryProject.model.dto.AuthorUpdateDto;
import ru.itgirl.libraryProject.model.dto.BookCreateDto;
import ru.itgirl.libraryProject.model.dto.BookDto;
import ru.itgirl.libraryProject.model.dto.BookUpdateDto;

public interface BookService {
    BookDto getByNameV1(String name);

    BookDto getByNameV2(String name);

    BookDto getByNameV3(String name);

    BookDto createBook(BookCreateDto bookCreateDto);

    BookDto updateBook(BookUpdateDto bookUpdateDto);

    void deleteBook(Long id);
}
