package com.nenu.market.mapper.usermapper;

import com.nenu.market.entity.User;
import com.nenu.market.redis.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List getAllUsers();
    User findByName(@Param("name") String name);
    User findById(@Param("id") int id);
    void addUser();
}
