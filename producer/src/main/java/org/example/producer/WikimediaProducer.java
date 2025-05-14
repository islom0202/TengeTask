package org.example.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WikimediaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

//    public void send(String message){
//        kafkaTemplate.send("newTopic", message);
//    }

//    public void sendJson(RecentChange change) {
//        Message<RecentChange> message = MessageBuilder
//                .withPayload(change)
//                .setHeader(KafkaHeaders.TOPIC, "wikimediaTopic")
//                .build();
//        kafkaTemplate.send(message);
//    }

    public void sendJson(RecentChange change) {
        Message<RecentChange> message = MessageBuilder
                .withPayload(change)
                .setHeader(KafkaHeaders.TOPIC, "wikimediaTopic")
                .build();
        kafkaTemplate.send(message);
    }
}
