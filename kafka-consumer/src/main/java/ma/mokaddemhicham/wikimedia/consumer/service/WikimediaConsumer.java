package ma.mokaddemhicham.wikimedia.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

/**
 * @Author: Hicham Mokaddem
 * @Date: 2024-10-20
 * @Version: 1.0
 * @Description: Wikimedia Consumer
 */

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(format("Consuming the message from wikimedia-stream Topic:: %s", msg));
    }
}
