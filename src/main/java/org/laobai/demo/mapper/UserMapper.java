package org.laobai.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.laobai.demo.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
