package com.atguigu.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import java.time.Duration;

/**
 * projectName: b2c-store
 * <p>
 * description: Cache configuration class, inherited by other subclasses
 */
public class CacheConfiguration {


    //Configure the cache manager
    @Bean
    @Primary  //The same type, multiple beans, take effect by default! The default cache time is 1 hour! You can choose!
    public RedisCacheManager cacheManagerHour(RedisConnectionFactory redisConnectionFactory){

        RedisCacheConfiguration instanceConfig = instanceConfig(1 * 3600L);//缓存时间1小时

        //build cache object
        return RedisCacheManager.builder(redisConnectionFactory)
                .cacheDefaults(instanceConfig)
                .transactionAware()
                .build();
    }

    //Cache configuration for one day
    @Bean
    public RedisCacheManager cacheManagerDay(RedisConnectionFactory redisConnectionFactory){

        RedisCacheConfiguration instanceConfig = instanceConfig(24 * 3600L);//缓存时间1小时

        //build cache object
        return RedisCacheManager.builder(redisConnectionFactory)
                .cacheDefaults(instanceConfig)
                .transactionAware()
                .build();
    }


    /**
     * Instantiate a specific cache configuration!
     * Set cache method JSON
     * Set the cache time in seconds
     * @param ttl
     * @return
     */
    private RedisCacheConfiguration instanceConfig(Long ttl){

        //Set jackson serialization tool
        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer
                = new Jackson2JsonRedisSerializer<Object>(Object.class);

        //Common jackson's object mapper, and set some basic properties
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(MapperFeature.USE_ANNOTATIONS,false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.activateDefaultTyping(LaissezFaireSubTypeValidator.instance,
                ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.PROPERTY);

        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);

        return RedisCacheConfiguration.defaultCacheConfig()
                .entryTtl(Duration.ofSeconds(ttl)) //set cache time
                .disableCachingNullValues()
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(jackson2JsonRedisSerializer));
    }

}
