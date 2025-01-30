package com.example.storebookservice.processor;

import com.example.storebookservice.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class BookEventProcessor {
    @Bean
    public Consumer<Message<Book>> getBook() {
        return bookMessage -> {
            Book book = bookMessage.getPayload();
            log.info("Received book: {}", book);
        };
    }
}