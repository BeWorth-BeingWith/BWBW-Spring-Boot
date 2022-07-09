package com.example.bwbw.matchinglist.dto;

import java.time.LocalDateTime;

public class WriteNewRoomRequestDto { // 방 만들기 작성 처음 들어 갔을 때 Request

    private String shortText; // 짧은 모집글 (100자 제한)

    private String promiseLocation; // 약속 장소

    private int peopleNum; // 모집 인원 수

    private LocalDateTime promiseTime; // 약속 시간

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getPromiseLocation() {
        return promiseLocation;
    }

    public void setPromiseLocation(String promiseLocation) {
        this.promiseLocation = promiseLocation;
    }

    public int getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public LocalDateTime getPromiseTime() {
        return promiseTime;
    }

    public void setPromiseTime(LocalDateTime promiseTime) {
        this.promiseTime = promiseTime;
    }
}
