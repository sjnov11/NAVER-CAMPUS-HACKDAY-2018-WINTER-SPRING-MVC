package com.sjnov11.springmavenweb.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 20)
    private String userId;

    private String userPassword;
    private String userName;
    private String userEmail;
}
