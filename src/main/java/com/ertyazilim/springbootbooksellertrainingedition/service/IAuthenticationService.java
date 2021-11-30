package com.ertyazilim.springbootbooksellertrainingedition.service;

import com.ertyazilim.springbootbooksellertrainingedition.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
