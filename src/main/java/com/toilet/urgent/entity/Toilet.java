package com.toilet.urgent.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "TOILET")
@Data
@Entity
public class Toilet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "TOILET_NUM")            //화장실 일련번호
    private int toiletNum;

    @Column(name = "TOILET_NAME")           //화장실 이름
    private String toiletName;

    @Column(name = "TOILET_ADD_CITY")       //화장실 도시 주소
    private String toiletAddCity;

    @Column(name = "TOILET_ADD_DETAILS")    //화장실 상세 주소
    private String toiletAddDetails;

    @Column(name = "LATITUDE")              //화장실 위도
    private String latitude;

    @Column(name = "LONGITUDE")             //화장실 경도
    private String longitude;

    @Column(name = "DESCRIPTION")           //화장실 설명
    private String description;

}
