package ru.itgirl.libraryProject.model.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itgirl.libraryProject.model.dto.AuthorDto;
import ru.itgirl.libraryProject.model.dto.BookDto;
import ru.itgirl.libraryProject.model.dto.GenreDto;
import ru.itgirl.libraryProject.model.entity.Genre;
import ru.itgirl.libraryProject.model.repository.GenreRepository;
import ru.itgirl.libraryProject.model.service.GenreService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;

    @Override
    public GenreDto getGenreById(Long id) {
        Genre genre = genreRepository.findById(id).orElseThrow();
        return convertToDto(genre);
    }

    private GenreDto convertToDto(Genre genre) {
        List<BookDto> bookDtoList = genre.getBooks()
                .stream()
                .map(book -> BookDto.builder()
                        .id(book.getId())
                        .name(book.getName())
                        .authors(book.getAuthors()
                                .stream()
                                .map(author -> AuthorDto.builder()
                                        .id(author.getId())
                                        .name(author.getName())
                                        .surname(author.getSurname())
                                        .build())
                                .collect(Collectors.toList()))
                        .build())
                .collect(Collectors.toList());

        return GenreDto.builder()
                .id(genre.getId())
                .name(genre.getName())
                .books(bookDtoList)
                .build();
    }


//        List<BookDto> bookDtoList = genre.getBooks()
//                .stream()
//                .map(book -> BookDto.builder()
//                        .name(book.getName())
//                        .id(book.getId())
//                        .authors(book.getAuthors().stream()
//                                        .map(author -> AuthorDto.builder()
//                                                .id(author.getId())
//                                                .name(author.getName())
//                                                .surname(author.getSurname())
//                                                .build())
//                                        .toList()
//                        )
//                        .build()
//                ).toList();
//        return GenreDto.builder()
//                .id(genre.getId())
//                .name(genre.getName())
//                .books(bookDtoList)
//                .build();
//    }
}
