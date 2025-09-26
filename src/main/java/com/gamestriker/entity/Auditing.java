package com.gamestriker.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Auditing {
    private String createdBy;

    private String createdAt;
    private String updatedBy;
    private String updatedAt;

}
