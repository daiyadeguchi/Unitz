package com.daiyadeguchi.unitzapi.model;

public class CoursesTaken extends BaseEntity {

    private long userId;
    private long coursesId;

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
