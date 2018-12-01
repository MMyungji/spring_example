package org.sopt.seminar4.api;



import lombok.extern.slf4j.Slf4j;

import org.sopt.seminar4.dto.User;

import org.sopt.seminar4.mapper.UserMapper;

import org.sopt.seminar4.model.SignUpReq;
import org.sopt.seminar4.service.UserService;

import org.sopt.seminar4.utils.auth.Auth;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;

import java.util.Optional;



import static org.sopt.seminar4.model.DefaultRes.FAIL_DEFAULT_RES;



/**

 * Created by ds on 2018-11-05.

 */



@Slf4j

@RestController

@RequestMapping("users")

public class UserController {



    private final UserService userService;



    public UserController(final UserService userService) {

        this.userService = userService;

    }

//이름과 파트로 찾기
    @Auth
    @GetMapping("")
    public ResponseEntity getUser(@RequestParam("name") final Optional<String> name,
                                  @RequestParam("part") final Optional<String> part) {
        try {
            //name이 null일 경우 false, null이 아닐 경우 true
            if(name.isPresent()) return new ResponseEntity<>(userService.findByName(name.get()), HttpStatus.OK);
            //part가 null일 경우 false, null이 아닐 경우 true
            if(part.isPresent()) return new ResponseEntity<>(userService.findByPart(part.get()), HttpStatus.OK);
            return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
        }catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //회원IDX값으로 회원조회
    @GetMapping("/{userIdx}")
    public ResponseEntity getUser(@PathVariable(value = "userIdx") final int userIdx) {
        try {
            return new ResponseEntity<>(userService.findByUserIdx(userIdx), HttpStatus.OK);
        }catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


//회원 등록
    @PostMapping("")

    public ResponseEntity signup(SignUpReq signUpReq, @RequestPart(value = "profile",required = false) final MultipartFile profile) {

        try {
            if(profile != null) signUpReq.setProfile(profile);
            return new ResponseEntity<>(userService.save(signUpReq), HttpStatus.OK);

        }catch (Exception e) {

            log.error(e.getMessage());

            return new ResponseEntity<>(FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }


//회원정보 수정
    @PutMapping("/{userIdx}")

    public ResponseEntity signUp(

            @PathVariable(value = "userIdx") final int userIdx,

            @RequestBody final User user) {

        try {

            return new ResponseEntity<>(userService.update(userIdx, user), HttpStatus.OK);

        }catch (Exception e) {

            log.error(e.getMessage());

            return new ResponseEntity<>(FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }


//회원탈퇴
    @DeleteMapping("/{userIdx}")

    public ResponseEntity deleteUser(@PathVariable(value = "userIdx") final int userIdx) {

        try {

            return new ResponseEntity<>(userService.deleteByUserIdx(userIdx), HttpStatus.OK);

        }catch (Exception e) {

            log.error(e.getMessage());

            return new ResponseEntity<>(FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

}