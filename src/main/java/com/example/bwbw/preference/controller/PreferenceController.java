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
    @ApiResponse(code=200, message = "성공 / content비어있으면 Empty")
    @GetMapping("/review")
    public ResponseEntity<List<ReviewResponseDto>> reviewRead(String accessToken, LocalDateTime expiredTime){

        //TODO: Database에서 리뷰 내용을 가져오는 Serivce 로직을 실행, 없으면 데이터는 null status = 200 보냄

        return null;
    }
}
