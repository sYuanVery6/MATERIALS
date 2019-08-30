package com.example.service.redisService;

import javafx.print.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component//注入容器
public class RedisService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    //默认过期时长，秒
    public static final long DEFAULT_EXPIRE = 60 * 60 * 24;

    //不设置过期时长
    public static final long NOT_EXPIRE = -1;

    public boolean existsKey(String key){
        return redisTemplate.hasKey(key);
    }
    /**
     *
     * 重命名key,如果已存在，直接覆盖
    *@Description:
    *@Param: oldKey,newKey
    *@Author: aYuan
    */
    public void renameKey(String oldKey,String newkey){
        redisTemplate.rename(oldKey,newkey);
    }

    /**
    newkey不存在时才重命名
    */
    public boolean renameKeyNotExist(String oldKey,String newKey){
        return redisTemplate.renameIfAbsent(oldKey,newKey);
    }

    public void deleteKey(String key){
        redisTemplate.delete(key);
    }

    public void deleteKey(String... keys){
        Set<String> kSet = Stream.of(keys).map(k -> k).collect(Collectors.toSet());
        redisTemplate.delete(kSet);
    }

    public void deletKey(Collection<String> keys){
        Set<String> kSet = keys.stream().map(k -> k).collect(Collectors.toSet());
        redisTemplate.delete(keys);
    }

    /**
    设置key 的生命周期
    */
    public void expireKey(String key, long time, TimeUnit timeUnit){
        redisTemplate.expire(key,time,timeUnit);
    }

    /**
    指定Key的过期时间
    */
    public void expireKeyAt(String key, Date date){
        redisTemplate.expireAt(key, date);
    }


    /**
    查询key的生命周期
    *@Author: aYuan
    *@date:
    */
    public long getKeyExpire(String key,TimeUnit timeUnit){
        return redisTemplate.getExpire(key,timeUnit);
    }

    /**
    将key设置为永久有效
    */
    public void presistKey(String key){
        redisTemplate.persist(key);
    }
}
