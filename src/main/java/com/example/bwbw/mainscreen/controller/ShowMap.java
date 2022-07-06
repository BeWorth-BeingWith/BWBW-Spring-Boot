package com.example.bwbw.mainscreen.controller;
import com.example.bwbw.mainscreen.dto.Restraunt;
import com.example.bwbw.mainscreen.dto.ShowMapResponseDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Api(tags = {"지도 출력"})
@RequestMapping("/home")
@RequiredArgsConstructor
@RestController
public class ShowMap {

    @ApiOperation(value = "처음 지도 불러오기",notes = "앱 실행 후 처음으로 지도를 불러오는 로직입니다")
    @GetMapping("/first-location")
    @ApiImplicitParam(name = "accessToken", value = "유저 엑세스 토큰", dataTypeClass = String.class)
    public ResponseEntity<List<ShowMapResponseDto>> mapLoad(String accessToken) {

        //TODO: 앱 초기화면에 지도를 불러오는 로직, accessToken 만 유지되어 있다면 전달인자 없이도 호출
        return null;

    }

    @ApiOperation(value = "지도 속 핀 불러오기",notes = "지도를 불러올때 매칭이 있는 식당을 핀으로 표시하기 위한 로직입니다")
    @GetMapping("/restraunt")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "accessToken", value = "유저 엑세스 토큰", dataTypeClass = String.class),
                    @ApiImplicitParam(name = "restraunt", value = "매칭이 잡힌 식당의 좌표,이름 및 매칭내역", dataTypeClass = Restraunt.class)
            }
    )
    public ResponseEntity<List<ShowMapResponseDto>> showPin(String accessToken, @RequestParam Restraunt restraunt) {

        //TODO: 지도에서 매칭이 잡혀있는 식당들을 불러오는 로직
        return null;

    }


}


