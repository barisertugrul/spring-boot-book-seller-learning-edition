package com.ertyazilim.springbootbooksellertrainingedition.security.jwt;

import com.ertyazilim.springbootbooksellertrainingedition.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider {
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);
}
