package com.example.jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Album extends Item {
    public String artist;
    public String etc;
}
