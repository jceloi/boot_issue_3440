package test.jce.technical.configuration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jean-charles_eloi on 07/07/15.
 */
@Configuration
public class CacheConfiguration {



    //TODO: Uncomment to start the application
    /*
    @Bean
    public ConcurrentMapCacheManager cacheManager() {
        return new ConcurrentMapCacheManager("test");
    }*/


}
