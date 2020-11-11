package org.laobai.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.laobai.demo.entity.User;
import org.laobai.demo.struct.PageResult;

import java.util.List;

public interface UserService extends IService<User> {

    /**
     * 根据姓名、年龄范围查询
     * @param name
     * @param ageMin
     * @param ageMax
     * @return
     */
    List<User> getUsersByNameAndAge(String name,Integer ageMin,Integer ageMax);


    PageResult<User> getPage(int currPage, int pageSize);
}
