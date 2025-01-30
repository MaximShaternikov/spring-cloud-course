package com.example.checkbookservice.processor;

import com.example.checkbookservice.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@Slf4j
public class CheckBookEventProcessor {
    @Bean
    public Function<Message<Book>, Message<Book>> processBook() {
        return bookMessage -> {
            Book receivedBook = bookMessage.getPayload();
            log.info("Received Book: {}", receivedBook);

            return MessageBuilder.withPayload(
                    Book.builder()
                            .id(receivedBook.getId())
                            .name(receivedBook.getName())
                            .status("checked")
                            .description(receivedBook.getDescription())
                            .build()
            ).build();
        };
    }
}