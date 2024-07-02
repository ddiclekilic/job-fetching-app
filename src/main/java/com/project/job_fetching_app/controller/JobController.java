package com.project.job_fetching_app.controller;

import com.project.job_fetching_app.entity.Data;
import com.project.job_fetching_app.service.JobService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
@AllArgsConstructor
public class JobController {

    private JobService jobService;

    @GetMapping
    public ResponseEntity<Data> getJobs() {
        Data data = jobService.getJobs();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}