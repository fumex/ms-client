package com.sgcan.msclient.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;


@Getter
@Setter
public abstract class BaseEntity {
    @Id
    private String id;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
