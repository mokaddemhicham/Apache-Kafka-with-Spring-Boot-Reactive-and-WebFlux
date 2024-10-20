package ma.mokaddemhicham.wikimedia.producer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @Author: Hicham Mokaddem
 * @Date: 2024-10-19
 * @Version: 1.0
 * @Description: WebClient Config class
 */

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}