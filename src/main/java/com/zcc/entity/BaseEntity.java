package com.zcc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author zcc
 * @ClassName BaseEntity
 * @description
 * @date 2021/5/8 16:45
 * @Version 1.0
 */
@Data
public class BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private LocalDateTime created;
    private LocalDateTime updated;
    private Integer statu;
}
