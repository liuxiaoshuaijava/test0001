package com.bjpowernode.crm.test.settings;

/**
 * Author:刘晓帅
 * 2019/7/15
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            关于登录验证：
            1.验证账号密码 loginACT loginPwd
               验证方式1：
               int count= select count(*) from tbl_user where loginAct=? and loginPwd=?
               验证方式2：我们 用这个
               User user =select * from tbl_user where loginAct=? and loginPwd=?
               我们使用的是验证方式2，因为我们需要得到user对象



        */

    }
}
