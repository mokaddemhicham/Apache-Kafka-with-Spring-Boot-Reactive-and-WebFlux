package ma.mokaddemhicham.wikimedia.producer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author: Hicham Mokaddem
 * @Date: 2024-10-19
 * @Version: 1.0
 * @Description: Wikimedia Producer
 */

@Service
@Slf4j
@RequiredArgsConstructor
public class WikimediaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        log.info("Sending message: {}", msg);
        kafkaTemplate.send("wikimedia-stream", msg);
    }
}
