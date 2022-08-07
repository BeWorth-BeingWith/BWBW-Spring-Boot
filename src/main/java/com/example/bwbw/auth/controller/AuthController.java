package com.example.bwbw.auth.controller;

import com.example.bwbw.auth.dto.RequestSignInDto;
import com.example.bwbw.auth.dto.RequestSignUpDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Api(tags ={"login API"})
@RestController
@RequestMapping("/api")
public class AuthController {

    @GetMapping("/sign-in")
    @ApiOperation(value = "로그인 API", notes = "입력받은 ID와 PW로 로그인 ")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "email", value = "사용자 이메일")
            ,@ApiImplicitParam(name = "password", value = "사용자 비밀번호")
    })
    public String SignIn(@RequestBody RequestSignInDto requestSignInDto){
        //TODO: 로그인-1.DB에서 유저 검색
        //TODO: 로그인-2.유저 Access token 발급 및 리턴
        return "";
    }

    @PostMapping("/sign-up")
    @ApiOperation(value = "회원가입 API", notes = "입력 받은 정보로 회원 가입")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "사용자 이름")
            ,@ApiImplicitParam(name = "email", value = "사용자 이메일")
            ,@ApiImplicitParam(name = "password", value = "사용자 비밀번호")
            ,@ApiImplicitParam(name = "gender", value = "사용자 성별")
            ,@ApiImplicitParam(name = "nickname", value = "사용자 별명")
    })
    public String SignUp(@RequestBody RequestSignUpDto requestSignUpDto){

        //TODO: 회원가입-1.DB에 유저정보 저장
        //TODO: 회원가입-2.refresh token 발급 & access token 발급 및 리턴
        return "";
    }

    /**
     * 회원가입 창에서 유저가 입력한 email로 인증 코드 발송
     * @param email 학교 공식 email
     * @return Http Status
     */
    @GetMapping("/sign-up/{email}")
    @ApiOperation(value = "email 인증", notes = "email로 인증번호 전송")
    @ApiImplicitParam(name = "email", value = "학교 공식 email")
    @ApiResponses(
           @ApiResponse(code = 200, message = "email 전송 성공")
            //TODO: email 전송 실패의 경우 맞는 http status 입력
    )
    public ResponseEntity<HttpStatus> AuthEmail(@PathVariable String email){
        //TODO: email 전송
        return ResponseEntity.ok(HttpStatus.OK);
    }

    /**
     * ID 찾기
     * @return 학교 웹메일 홈페이지
     */
    @GetMapping("/find-id")
    @ApiOperation(value = "ID 찾기")
    public String FindId(){
        return "https://wmail.kw.ac.kr/";
    }

    /**
     * 비밀번호 찾기
     * @param authCode
     * @return String 비밀번호
     */
    @GetMapping("find-password")
    @ApiOperation(value = "password 찾기")
    @ApiImplicitParam(name= "authCode", value="웹메일 전송된 비밀번호 인증 코드")
    public String FindPassword(@RequestParam String authCode){
        //TODO: 인증번호 비교
        return null;
    }
}
