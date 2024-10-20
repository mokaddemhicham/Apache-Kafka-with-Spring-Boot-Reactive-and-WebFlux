package ma.mokaddemhicham.wikimedia.producer.web;

import lombok.RequiredArgsConstructor;
import ma.mokaddemhicham.wikimedia.producer.service.WikimediaProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Hicham Mokaddem
 * @Date: 2024-10-20
 * @Version: 1.0
 * @Description: Wikimedia Resource
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/wikimedia")
public class WikimediaResource {

    public final WikimediaProducer wikimediaProducer;

    @GetMapping
    public void startPublishing() {
        wikimediaProducer.sendMessage("Hello from Hicham Producer");
    }
}
