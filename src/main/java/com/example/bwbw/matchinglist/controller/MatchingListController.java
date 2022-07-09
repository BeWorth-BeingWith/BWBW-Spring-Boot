package com.example.bwbw.matchinglist.controller;

import com.example.bwbw.matchinglist.dto.MatchingListResponseDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "매칭 리스트로 이동할 때 Api")
@RestController // 컨트롤러 클래스 하위 메서드에 @ResponseBody 어노테이션을 붙이지 않아도 문자열과 JSON 등을 전송 가능
@RequestMapping("/api")
public class MatchingListController {
    // Request 정렬 방법
    // Response 식당[배열] (좌표, 식당이름, 식당리스트[배열]), 식당리스트 (이름, 인원수, 만나기로한 시간, 방 고유값)

    //    모집공고 리스트 들어왔을 때 Controller
    @ApiOperation(value = "매칭 리스트 목록", notes = "모든 매칭 정보 가져오기")
    @ApiResponse(code=200, message="성공")
    @GetMapping("/all-matching-list")
    public ResponseEntity<List<MatchingListResponseDto>> matchingListRead(){

        return null;
    }


}

//    모집공고 세부적으로 들어갔을 때 Controller
//    방 만들기 작성 처음 들어 갔을 때 Controller
//    방 만들기 작성 완료 Controller
//    내 매칭 확인 Controller
//    매칭 수정하기 Controller (처음 들어왔을 때)
//    매칭 수정하기 Controller (수정 완료)
//    매칭 삭제하기 Controller

//    review 보기
//    review 작성 페이지로 이동
//    review 작성 페이지
//    사람별 리뷰 작성
//    뱃지 확인
//    회원 탈퇴