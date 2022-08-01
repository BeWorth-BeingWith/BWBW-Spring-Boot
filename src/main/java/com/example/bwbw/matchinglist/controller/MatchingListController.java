package com.example.bwbw.matchinglist.controller;

import com.example.bwbw.matchinglist.dto.*;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "매칭 리스트로 이동할 때 Api")
@RestController // 컨트롤러 클래스 하위 메서드에 @ResponseBody 어노테이션을 붙이지 않아도 문자열과 JSON 등을 전송 가능
@RequestMapping("/api")
public class MatchingListController {

    //    모집공고 리스트 들어왔을 때 Controller
    @ApiOperation(value = "매칭 모집 리스트 목록", notes = "모든 매칭 정보 가져오기")
    @ApiResponse(code=200, message="성공")
    @GetMapping("/all-matching-list")
    public ResponseEntity<List<MatchingListResponseDto>> matchingListRead(){

        return null;
    }

    //    모집공고 세부적으로 들어갔을 때 Controller
    @ApiOperation(value = "세부 모집 공고", notes = "개별적인 세부 모집 공고 가져오기")
    @ApiResponse(code=200, message="성공")
    @GetMapping("/detail-matching-post")
    public ResponseEntity<List<DetailMatchingPostResponseDto>>  detailPostRead(@RequestParam(name = "roomId", value = "방 고유값") Long roomId){

        return null;
    }

    //    방 만들기 작성 처음 들어 갔을 때 Controller
    @ApiOperation(value = "매칭 글 작성", notes = "매칭 모집 글 작성하기")
    @ApiResponse(code=200, message="성공")
    @PostMapping("/write-matching-post")
    public ResponseEntity<WriteNewRoomResponseDto>  writeMatching(){

        return null;
    }

    //    방 만들기 작성 완료 Controller
    @ApiOperation(value = "매칭 글 작성 완료", notes = "매칭 모집 글 작성 완료 후 반영")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "roomLeaderNick", value = "매칭 방 리더 닉네임", dataTypeClass = String.class),
                    @ApiImplicitParam(name = "shortText", value = "짧은 모집글", dataTypeClass = String.class),
                    @ApiImplicitParam(name = "roomId", value = "매칭 방 고유 번호", dataTypeClass = Long.class)
            }
    )
    @ApiResponse(code=200, message="성공")
    @PostMapping("/write-matching-post-done")
    public ResponseEntity<Void>  writeMatchingDone(@RequestBody WriteNewRoomCompleteRequestDto writeNewRoomCompleteRequest){

        return null;
    }

    //    내 매칭 확인 Controller
    @ApiOperation(value = "나의 확정 매칭 확인", notes = "확정된 나의 매칭 약속 가져오기")
    @ApiResponse(code=200, message="성공")
    @GetMapping("/my-matching/confirm")
    public ResponseEntity<ConfirmMyPromiseResponseDto>  confrimMyMatching(){

        return null;
    }

    //    매칭 수정하기 Controller (처음 들어왔을 때)
    @ApiOperation(value = "나의 매칭 글 수정", notes = "내가 작성한 매칭 글 수정하기")
    @ApiResponse(code=200, message="성공")
    @PostMapping("/revise-my-matching")
    public ResponseEntity<ReviseMyRoomResponseDto>  reviseMatching(){

        return null;
    }

    //    매칭 수정하기 Controller (수정 완료)
    @ApiOperation(value = "나의 매칭 글 수정 완료", notes = "나의 매칭 글 수정 완료 후 반영")
    @ApiResponse(code=200, message="성공")
    @PostMapping("/revise-my-matching/done")
    public ResponseEntity<Void>  reviseMatchingDone(@RequestBody ReviseMyRoomCompleteRequestDto reviseMyRoomCompleteRequest){

        return null;
    }

    //    매칭 삭제하기 Controller
    @ApiOperation(value = "나의 매칭 글 삭제", notes = "내의 매칭 글 삭제하기")
    @ApiResponse(code=200, message="성공")
    @DeleteMapping("/my-matching/delete")
    public ResponseEntity<Void>  deleteMatching(@RequestParam(name = "roomId") Long roomId){

        return null;
    }
}