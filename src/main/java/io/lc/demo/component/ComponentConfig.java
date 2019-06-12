package io.lc.demo.component;

import com.github.cage.Cage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.SecureRandom;

@Configuration
public class ComponentConfig {
    @Bean
    public SecureRandom getSecureRandom(){
        return new SecureRandom();
    }
    @Bean
    public Cage getCage(){
        return new Cage();
    }
}

