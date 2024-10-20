package ma.mokaddemhicham.wikimedia.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @Author: Hicham Mokaddem
 * @Date: 2024-10-19
 * @Version: 1.0
 * @Description: Wikimedia Topic Config
 */

@Configuration
public class WikimediaTopicConfig {

    @Bean
    public NewTopic wikimediaStreamTopic() {
        return TopicBuilder
                .name("wikimedia-stream")
                .build();
    }
}
