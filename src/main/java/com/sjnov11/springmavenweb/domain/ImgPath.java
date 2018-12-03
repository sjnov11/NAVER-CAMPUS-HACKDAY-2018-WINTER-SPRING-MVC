package com.sjnov11.springmavenweb.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@ToString
@Getter
@Setter
@Entity
public class ImgPath {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="fk")
    private Long fk;
    @Column(name="imgPath")
    private String imgPath;

}
