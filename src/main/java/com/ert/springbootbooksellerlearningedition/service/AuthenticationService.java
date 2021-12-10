package com.ert.springbootbooksellerlearningedition.service;

import com.ert.springbootbooksellerlearningedition.security.UserPrincipal;
import com.ert.springbootbooksellerlearningedition.security.jwt.IJwtProvider;
import com.ert.springbootbooksellerlearningedition.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

/**
 * @author sa
 * @date 3.07.2021
 * @time 19:40
 */
@Service
public class AuthenticationService implements IAuthenticationService
{
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private IJwtProvider jwtProvider;

    @Override
    public User signInAndReturnJWT(User signInRequest)
    {

        User user = new User();
        user.setName("Autoname");
        user.setUsername(signInRequest.getUsername());
        user.setToken("şkişlişlşilşi");
        return  user;
        /*


        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword())
        );

        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        String jwt = jwtProvider.generateToken(userPrincipal);

        User signInUser = userPrincipal.getUser();
        signInUser.setToken(jwt);

        return signInUser;
        
         */
    }
}
