package ru.itgirl.libraryProject.model.service;

import ru.itgirl.libraryProject.model.dto.BookDto;

public interface BookService {
    BookDto getByNameV1(String name);

    BookDto getByNameV2(String name);

    BookDto getByNameV3(String name);

}
