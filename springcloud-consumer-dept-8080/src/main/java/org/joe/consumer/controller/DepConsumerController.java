package org.joe.consumer.controller;

import com.joe.api.entity.Dep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * (Dep)表控制层
 *
 * @author Joe
 * @since 2020-05-27 10:34:59
 */
@RestController
@RequestMapping("dep")
public class DepConsumerController {

//    private static final String REST_URL_PREFIX = "http://localhost:8001";

    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-DEP";


    @Autowired
    RestTemplate restTemplate;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping
    @RequestMapping("{id}")
    public Dep queryById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dep/" + id, Dep.class);
    }

    /**
     * 通过主键查询单条数据
     *
     * @return 对象列表
     */
    @GetMapping
    public List queryAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dep", List.class);
    }

    @RequestMapping(value = "discovery", method = RequestMethod.GET)
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dep/discovery", Object.class);

    }

}