package com.sjnov11.springmavenweb.domain;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Entity
public class ImgResource {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="area")
    private String area;
    @Column(name="query")
    private String query;
    @Column(name="type")
    private String type;
    @Column(name="queryRank")
    private int queryRank;
}
