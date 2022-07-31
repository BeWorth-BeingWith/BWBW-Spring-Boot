package com.example.bwbw.matchinglist.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MatchingListRequestDto { // 모집공고 리스트 들어왔을 때 Request

    private String orderedBy;
}

