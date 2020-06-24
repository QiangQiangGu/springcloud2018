package com.joe.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (Dep)实体类
 *
 * @author Joe
 * @since 2020-05-27 10:34:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dep implements Serializable {
    private static final long serialVersionUID = 849645660956287067L;
    
    private Long id;
    
    private Long companyId;
    
    private Long parentId;
    
    private String name;
    
    private Long leaderId;
    
    private Integer node;
    
    private Byte status;
    
    private Long createId;
    
    private Date createTime;
    
    private Long updateId;

    private Date updateTime;

    private String dbSource;
}