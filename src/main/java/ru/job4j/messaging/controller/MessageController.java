package ru.job4j.messaging.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Класс MessageController
 *
 * @author Evgeniy Zaytsev
 * @version 1.0
 */
@Component
public class MessageController {

    @KafkaListener(topics = {"unavailable"})
    public void listenUnavailable(ConsumerRecord<Integer, String> input) {
        System.out.println("Рассылаем сообщения");
        System.out.println(input.value());
    }

}
