package io.hxjstudy.javamybatis2springtiny.mapper;

import io.hxjstudy.javamybatis2springtiny.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM g2_user limit 1")
    UserInfo findOne();
}
