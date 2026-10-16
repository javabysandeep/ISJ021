package com.itshaala.portal;

import com.itshaala.portal.model.Lecture;

public class LectureApp {
    public static void main(String[] args) {
        Lecture lecture = new Lecture(); // zero param or all args constructor
        lecture.setId(101);
        System.out.println(lecture);

        // creating an object using Builder pattern
        Lecture lecture2 = Lecture.builder()
                .id(101)
                .title("Lombok Library Session")
                .description("Lombok Library Session")
                .date("2026-10-16")
                .time("07:30:00")
                .location("Pune")
                .build();

        System.out.println("object created using builder patter");
        System.out.println(lecture2);


    }
}

//java: JPS incremental annotation processing is disabled.
// Compilation results on partial recompilation may be inaccurate.
// Use build process "jps.track.ap.dependencies" VM flag to enable/disable incremental annotation processing environment.
