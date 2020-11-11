package org.laobai.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.laobai.demo.entity.User;
import org.laobai.demo.mapper.UserMapper;
import org.laobai.demo.service.UserService;
import org.laobai.demo.struct.PageResult;
import org.laobai.demo.util.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Override
    public List<User> getUsersByNameAndAge(String name, Integer ageMin, Integer ageMax) {
        // 条件构造器
        QueryWrapper<User> wrapper = new QueryWrapper<>();

        if(StringUtils.isNotEmpty(name)){
            wrapper.like("name",name);
        }
        if(Objects.nonNull(ageMin)&&Objects.nonNull(ageMax)){
            wrapper.between("age",ageMin,ageMax);
        }

        return list(wrapper);
    }

    @Override
    public PageResult<User> getPage(int currPage, int pageSize) {
        Page<User> userPage = new Page<>(currPage, pageSize);
        userPage = page(userPage);

//        PageResult<User> userPageResult = new PageResult<>();
//        // 当前页数据
//        userPageResult.setRows(userPage.getRecords());
//        // 总条数
//        userPageResult.setTotal(userPage.getTotal());

        //TODO  封装静态方法构建对象
        return new PageResult<>(userPage.getRecords(),userPage.getTotal());
    }
}
