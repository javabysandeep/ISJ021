package com.itshaala.portal.model;

import lombok.*;

import java.util.Objects;


//@Data : Getter + Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class Lecture {
    private int id;
    private String title;
    private String description;
    private String trainer;
    private String category;
    private String location;
    private String date;
    private String time;
}
//class A extends Lecture {}