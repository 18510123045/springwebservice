package com.example.demo.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

//指定webservice命名空间
@WebService
public interface UserService {

    /**
     * @WebParam(name = "name")发布后客户端调用方法的参数名，不指定则客户端调用方法的参数名为arg0，推荐指定
     * @param name
     * @return
     */
    String getHello(@WebParam(name = "name") String name);
}
