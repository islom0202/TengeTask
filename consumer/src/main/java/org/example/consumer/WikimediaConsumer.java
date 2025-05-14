package org.example.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimediaTopic", groupId = "wiki")
    public void consumeWikimedia(RecentChange change){
        log.info(change.toString());
    }
}
