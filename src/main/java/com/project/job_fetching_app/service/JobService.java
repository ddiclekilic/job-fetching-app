package com.project.job_fetching_app.service;

import com.project.job_fetching_app.entity.Data;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class JobService {
    private WebClient webClient;

    public Data getJobs() {

        // Using WebClient

        return webClient.get().uri("/search-jobs?keywords=java&locationId=102424322&datePosted=anyTime&sort=mostRelevant").retrieve().bodyToMono(Data.class).block();
    }
}