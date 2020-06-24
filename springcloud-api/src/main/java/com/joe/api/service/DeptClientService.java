package com.joe.api.service;

import com.joe.api.entity.Dep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author QiangQiang Gu
 * @date 2020/6/22 17:25
 */
@FeignClient(value = "SPRINGCLOUD-DEP", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    /**
     * 获取一个dep
     *
     * @param id id
     * @return dep实例
     */
    @RequestMapping(value = "/dep/{id}", method = RequestMethod.GET)
    Dep getById(@PathVariable("id") Long id);

    /**
     * @return List<Dep>
     */
    @RequestMapping(method = RequestMethod.GET)
    List<Dep> queryAll();
}
