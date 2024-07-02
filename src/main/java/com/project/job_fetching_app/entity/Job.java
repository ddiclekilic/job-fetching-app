package com.project.job_fetching_app.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Job {
    String title;
    String url;
    String location;
    String type;
    Company company;
    String postDate;
    String postAt;
}