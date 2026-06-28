package com.payu.CatalogueManagement.service;

import com.payu.CatalogueManagement.entity.Book;
import com.payu.CatalogueManagement.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

class BookServiceTest {

    private BookRepository repository;
    private BookService service;

    @BeforeEach
    void setUp() {
        repository = mock(BookRepository.class);
        service = new BookService(repository);
    }

    @Test
    void testFindAll_ShouldReturnListOfBooks() {
        Book book1 = Book.builder().id(1L).title("Book One").author("Author A").copies(3).cost(100.0).build();
        Book book2 = Book.builder().id(2L).title("Book Two").author("Author B").copies(5).cost(150.0).build();
        when(repository.findAll()).thenReturn(Arrays.asList(book1, book2));

        List<Book> result = service.findAll();

        assertThat(result).hasSize(2).contains(book1, book2);
        verify(repository).findAll();
    }

    @Test
    void testSave_ShouldReturnSavedBook() {
        Book book = Book.builder().title("New Book").author("New Author").copies(2).cost(120.0).build();
        Book savedBook = Book.builder().id(1L).title("New Book").author("New Author").copies(2).cost(120.0).build();
        when(repository.save(book)).thenReturn(savedBook);

        Book result = service.save(book);

        assertThat(result).isEqualTo(savedBook);
        verify(repository).save(book);
    }

    @Test
    void testUpdate_ShouldUpdateAndReturnBook() {
        Book bookToUpdate = Book.builder().id(5L).title("Old Book").author("Old Author").cost(180.0).build();
        Book updatedBook  = Book.builder().id(5L).title("Updated Book").author("Old Author").cost(185.0).build();
        when(repository.save(any(Book.class))).thenReturn(updatedBook);

        Book result = service.update(5L, bookToUpdate);

        assertThat(result.getTitle()).isEqualTo("Updated Book");
        verify(repository).save(bookToUpdate);
    }

    @Test
    void testDelete_ShouldCallRepositoryDeleteById() {
        Long idToDelete = 10L;

        service.delete(idToDelete);

        verify(repository).deleteById(idToDelete);
    }
}
