package com.smalldogg.study.servlet.basic;

import lombok.Getter;
import lombok.Setter;

//Jackson 라이브러리가 자바 프로퍼티 접근법에 따라 Setter를 호출한다.
@Getter @Setter
public class HelloData {

    private int age;
    private String username;

}
