package org.sopt.seminar4.api;

import lombok.extern.slf4j.Slf4j;
import org.sopt.seminar4.model.DefaultRes;
import org.sopt.seminar4.model.LoginReq;
import org.sopt.seminar4.service.AuthService;
import org.sopt.seminar4.utils.ResponseMessage;
import org.sopt.seminar4.utils.StatusCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ds on 2018-11-13.
 */

@Slf4j
@RestController
public class LoginController {

    private static final DefaultRes FAIL_DEFAULT_RES = new DefaultRes(StatusCode.INTERNAL_SERVER_ERROR, ResponseMessage.INTERNAL_SERVER_ERROR);

    private final AuthService authService;

    public LoginController(final AuthService authService) {
        this.authService = authService;
    }

    /**
     * 로그인
     *
     * @param loginReq 로그인 객체
     * @return ResponseEntity
     */
    @PostMapping("login")
    public ResponseEntity login(@RequestBody final LoginReq loginReq) {
        try {
            return new ResponseEntity<>(authService.login(loginReq), HttpStatus.OK);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}