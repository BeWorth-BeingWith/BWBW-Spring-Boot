package com.example.bwbw.mainscreen.controller;

import com.example.bwbw.mainscreen.dto.MoveSchoolResponseDto;
import com.example.bwbw.mainscreen.dto.ShowMapResponseDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"학교위치로 이동"})
@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class MoveSchoolController {
    @ApiOperation(value = "지도 보기",notes = "지도를 불러올때 매칭이 있는 식당 정보를 반환")
    @GetMapping("/school")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "x", value = "학교좌표 x값", dataTypeClass = double.class),
                    @ApiImplicitParam(name = "y", value = "학교좌표 y값", dataTypeClass = double.class)
            }
    )
    public ResponseEntity<List<ShowMapResponseDto>> moveToSchoolLocation(@RequestBody MoveSchoolResponseDto moveSchoolResponseDto) {

        //TODO: 지도에서 학교위치로 이동하는 메소드, MoveSchoolResponseDto 를 파라미터로 받아와 해당 좌표로 지도 포커싱을 이동
        //TODO: 지도의 포커싱을 움직인 다음 다시 포커싱 버튼을 터치해도 같은 메서드를 실행하면 될듯 합니다
        return null;

    }


}
