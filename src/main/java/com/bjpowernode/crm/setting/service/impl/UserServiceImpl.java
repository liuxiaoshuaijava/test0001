package com.bjpowernode.crm.setting.service.impl;

import com.bjpowernode.crm.setting.dao.UserDao;
import com.bjpowernode.crm.setting.service.UserService;
import com.bjpowernode.crm.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Author:刘晓帅
 * 2019/7/14
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao= SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
}
