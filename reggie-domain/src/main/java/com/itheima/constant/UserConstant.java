package com.itheima.constant;

public interface UserConstant {
    int STATUS_ENABLE = 1;  //员工状态 1 启用
    int STATUS_DISABLE = 0; //员工状态 0 禁用
    String SESSION = "user"; //保存在session中的key
    String STATUS_NOT_LOGIN = "NOTLOGIN";  //未登录
}
