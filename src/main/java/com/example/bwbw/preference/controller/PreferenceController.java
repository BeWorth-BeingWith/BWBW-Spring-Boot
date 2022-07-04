package com.example.bwbw.preference.controller;

import com.example.bwbw.preference.dto.ReviewResponseDto;
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
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "accessToken", value = "유저 엑세스 토큰", dataType = "string"),
                    @ApiImplicitParam(name = "expiredTime", value = "토큰 만료 시간", dataType = "time")
            }
    )
    @ApiResponse(code=200, message = "성공 / content가 비어있으면 Empty")
    @GetMapping("/my-review")
    public ResponseEntity<List<ReviewResponseDto>> reviewRead(String accessToken, LocalDateTime expiredTime){

        //TODO: Database에서 리뷰 내용을 가져오는 Serivce 로직을 실행, 없으면 데이터는 null status = 200 보냄

        return null;
    }

    @ApiOperation(value="review 작성 페이지만 이동", notes = "지금 까지 리뷰 작성이 안된 페이지들만 가져오기")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "accessToken", value = "유저 엑세스 토큰", dataType = "string"),
                    @ApiImplicitParam(name = "expiredTime", value = "토큰 만료 시간", dataType = "time")
            }
    )
    @ApiResponse(code=200, message = "성공 / content가 비어있으면 모두 리뷰를 남긴 것")
    @GetMapping("/write-review")
    public ResponseEntity<List<ReviewResponseDto>> reviewWrite(String accessToken, LocalDateTime expiredTime){
        //TODO: 리뷰 작성 안된 인원들만 추려서 데이터 전송

        return null;
    }

    //TODO: 이름만 넘겨주면 이전 정보 활용할 수 있는지 물어보기
    @ApiOperation(value="review 작성 페이지", notes = "지금 까지 리뷰 작성이 안된 사람들만 가져오기")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "accessToken", value = "유저 엑세스 토큰", dataType = "string"),
                    @ApiImplicitParam(name = "roomId", value = "이용 했던 방 고유값", dataType = "int")
            }
    )
    @ApiResponses({
        @ApiResponse(code=200, message = "성공"),
        @ApiResponse(code=400, message = "모두 리뷰를 남긴상태일 경우")
        }
    )
    @GetMapping("write-review/write")
    public ResponseEntity<List<String>> reviewWritePage(String accessToken, Integer roomId){
        //TODO: 리뷰 작성하지 않은 이름들만 넘겨주는 로직 구현
        return null;
    }

}
