package org.joe.feign.service;

import com.joe.api.entity.Dep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author QiangQiang Gu
 * @date 2020/5/31 20:52
 */
/*@FeignClient(value = "SPRINGCLOUD-DEP")
public interface DepClientService {
    *//**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     *//*
    @RequestMapping(path = "/dep/{id}",method = RequestMethod.GET)
    Dep queryById(@PathVariable("id") Long id);
}*/
