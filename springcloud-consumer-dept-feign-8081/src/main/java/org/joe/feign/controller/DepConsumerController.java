package org.joe.feign.controller;

import com.joe.api.entity.Dep;
import com.joe.api.service.DeptClientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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

    /*@Autowired
    DepClientService depClientService;*/

    @Resource
    DeptClientService deptClientService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping
    @RequestMapping("{id}")
    public Dep queryById(@PathVariable("id") Long id) {
        return deptClientService.getById(id);
    }

    @GetMapping
    public List<Dep> queryAll() {
        return deptClientService.queryAll();
    }
}