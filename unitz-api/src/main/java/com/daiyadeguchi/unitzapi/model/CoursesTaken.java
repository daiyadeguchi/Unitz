package com.daiyadeguchi.unitzapi.model;

import jakarta.persistence.Entity;

@Entity
public class CoursesTaken extends BaseEntity {

    private long userId;
    private long coursesId;

    public CoursesTaken(long userId, long coursesId) {
        this.userId = userId;
        this.coursesId = coursesId;
    }

    public CoursesTaken() {}

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(long coursesId) {
        this.coursesId = coursesId;
    }
}
