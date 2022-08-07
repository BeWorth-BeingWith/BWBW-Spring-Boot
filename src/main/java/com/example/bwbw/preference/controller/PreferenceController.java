package com.example.bwbw.preference.controller;

import com.example.bwbw.preference.dto.BadgeResponseDto;
import com.example.bwbw.preference.dto.ReviewResponseDto;
import com.example.bwbw.preference.dto.ReviewWriteRequestDto;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Api(tags = "마이페이지로 이동할 때의 Api 입니다 👍")
@RestController
@RequestMapping("/api")
public class PreferenceController {

    @ApiOperation(value="review 보기", notes = "지금 까지 후기 모두 가져오기")
    @ApiResponse(code=200, message = "성공 / content가 비어있으면 Empty")
    @GetMapping("/my-review")
    public ResponseEntity<List<ReviewResponseDto>> reviewRead(){

        //TODO: Database에서 리뷰 내용을 가져오는 Serivce 로직을 실행, 없으면 데이터는 null status = 200 보냄

        return null;
    }

    @ApiOperation(value="review 작성 페이지만 이동", notes = "지금 까지 리뷰 작성이 안된 페이지들만 가져오기")
    @ApiResponse(code=200, message = "성공 / content가 비어있으면 모두 리뷰를 남긴 것")
    @GetMapping("/write-review")
    public ResponseEntity<List<ReviewResponseDto>> reviewWrite(){
        //TODO: 리뷰 작성 안된 인원들만 추려서 데이터 전송

        return null;
    }

    //TODO: 이름만 넘겨주면 이전 정보 활용할 수 있는지 물어보기
    @ApiOperation(value="review 작성 페이지", notes = "지금 까지 리뷰 작성이 안된 사람들만 가져오기")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "roomId", value = "이용 했던 방 고유값")
            }
    )
    @ApiResponses({
        @ApiResponse(code=200, message = "성공"),
        @ApiResponse(code=400, message = "모두 리뷰를 남긴상태일 경우")
        }
    )
    @GetMapping("write-review/write")
    public ResponseEntity<List<String>> reviewWritePage(@RequestParam(name = "roomId") Long roomId){
        //TODO: 리뷰 작성하지 않은 이름들만 넘겨주는 로직 구현
        return null;
    }

    @ApiOperation(value = "사람별 리뷰 작성", notes = "선택한 사람 이름, 리뷰 내용, 방 번호, 액세스토큰들을 받고 리뷰작성 성공 여부를 넘깁니다.")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "name", value = "리뷰 작성 대상자 이름", dataTypeClass = String.class),
                    @ApiImplicitParam(name = "review", value = "리뷰 내용", dataTypeClass = String.class),
                    @ApiImplicitParam(name = "roomId", value = "방 번호", dataTypeClass = Long.class)
            }
    )
    @ApiResponses({
            @ApiResponse(code=200, message = "성공"),
            @ApiResponse(code=400, message = "이미 리뷰가 있는 경우")
    }
    )
    @PostMapping("/write-review/done")
    public ResponseEntity<Void> reviewWriteDone(@RequestBody ReviewWriteRequestDto request){
        //TODO: 리뷰 생성 로직 만들기
        return null;
    }

    @ApiOperation(value="bage 확인", notes = "지금 까지 모은 badge들 확인")
    @ApiResponse(code=200, message = "성공 / content가 비어있으면 모두 리뷰를 남긴 것")
    @GetMapping("/badge")
    public ResponseEntity<BadgeResponseDto> badgeRead(){
        //TODO: 정보 읽어오는 로직 만들기
        return null;
    }

    @ApiOperation(value="회원 탈퇴", notes = "회원 탈퇴를 진행")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "password", value = "패스 워드", dataTypeClass = String.class)
            }
    )
    @ApiResponses({
            @ApiResponse(code=200, message = "회원 탈퇴 성공"),
            @ApiResponse(code=401, message = "일치하지 않음")
    })
    @DeleteMapping("/delete/user")
    public ResponseEntity<Void> deleteUser(@RequestParam(name = "password") String password){

        //TODO: 회원 탈퇴 로직 생성

        return null;
    }

}
