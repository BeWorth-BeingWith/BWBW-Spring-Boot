package com.example.bwbw.matchinglist.dto;

import java.time.LocalDateTime;


public class MatchingListRequestDto { // 모집공고 리스트 들어왔을 때 Request

    private String orderedBy;

    public String getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(String orderedBy) {
        this.orderedBy = orderedBy;
    }

    public MatchingListRequestDto(String orderedBy) {
        this.orderedBy = orderedBy;
    }
}

