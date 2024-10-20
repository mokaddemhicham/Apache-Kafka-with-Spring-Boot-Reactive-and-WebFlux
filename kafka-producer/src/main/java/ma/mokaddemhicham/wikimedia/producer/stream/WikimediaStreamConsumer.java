package ma.mokaddemhicham.wikimedia.producer.stream;

import lombok.extern.slf4j.Slf4j;
import ma.mokaddemhicham.wikimedia.producer.service.WikimediaProducer;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @Author: Hicham Mokaddem
 * @Date: 2024-10-19
 * @Version: 1.0
 * @Description: Wikimedia Stream Consumer
 */

@Service
@Slf4j
public class WikimediaStreamConsumer {

    public final WebClient webClient;
    public final WikimediaProducer wikimediaProducer;

    public WikimediaStreamConsumer(WebClient.Builder webClientBuilder, WikimediaProducer wikimediaProducer) {
        this.webClient = webClientBuilder
                .baseUrl("https://stream.wikimedia.org/v2")
                .build();
        this.wikimediaProducer = wikimediaProducer;
    }

    public void consumeStreamAndPublish() {
        webClient.get()
                .uri("/stream/recentchange")
                .retrieve()
                .bodyToFlux(String.class)
                .doOnError(error -> log.error("Error occurred while consuming stream: ", error))
                .subscribe(wikimediaProducer::sendMessage);
    }

}
