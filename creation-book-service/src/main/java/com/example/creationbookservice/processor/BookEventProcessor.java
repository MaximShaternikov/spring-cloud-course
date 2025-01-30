package com.example.creationbookservice.processor;

import com.example.creationbookservice.model.Book;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.function.Supplier;

@Component
@Slf4j
@AllArgsConstructor
public class BookEventProcessor {
    private final LinkedList<Book> bookCreationEventSource;

    @Bean
    public Supplier<Message<Book>> sendBook() {
        return () -> {
            return bookCreationEventSource.stream()
                    .findFirst()
                    .map(book -> {
                        log.info("Sending new book: {}", book);
                        bookCreationEventSource.remove();
                        return MessageBuilder.withPayload(book).build();
                    })
                    .orElse(null);
        };
    }
}