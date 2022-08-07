package com.example.bwbw.mainscreen.controller;
import com.example.bwbw.mainscreen.dto.HomeRestaurant;
import com.example.bwbw.mainscreen.dto.ShowMapResponseDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"지도 출력"})
@RequestMapping("/home")
@RequiredArgsConstructor
@RestController
public class ShowMapController {

    @ApiOperation(value = "처음 지도 불러오기",notes = "앱 실행 후 처음으로 지도를 불러오는 로직입니다")
    @GetMapping("/first-location")
    public ResponseEntity<List<ShowMapResponseDto>> mapLoad() {

        //TODO: 앱 초기화면에 지도를 불러오는 로직, accessToken 만 유지되어 있다면 전달인자 없이도 호출
        return null;

    }

    @ApiOperation(value = "지도 속 핀 불러오기",notes = "지도를 불러올때 매칭이 있는 식당을 핀으로 표시하기 위한 로직입니다")
    @GetMapping("/restaurant")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "restaurant", value = "매칭이 잡힌 식당의 좌표,이름 및 매칭내역", dataTypeClass = HomeRestaurant.class)
            }
    )
    public ResponseEntity<List<ShowMapResponseDto>> showPin( @RequestBody HomeRestaurant homeRestaurant) {

        //TODO: 지도에서 매칭이 잡혀있는 식당들을 불러오는 로직
        return null;

    }


}


