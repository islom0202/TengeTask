package org.example.producer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wiki")
public class WikimediaController {

    private final WikimediaProducer wikimediaProducer;
    private final WikimediaStreamConsumer wikimediaStreamConsumer;

    public WikimediaController(WikimediaProducer wikimediaProducer, WikimediaStreamConsumer wikimediaStreamConsumer) {
        this.wikimediaProducer = wikimediaProducer;
        this.wikimediaStreamConsumer = wikimediaStreamConsumer;
    }

    @GetMapping("/media")
    public ResponseEntity<?> get(){
        wikimediaStreamConsumer.consumeStreamAndPublish();
        return ResponseEntity.ok("");
    }
}
