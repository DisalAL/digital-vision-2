package com.DigitalVisionProject.service.services;

import com.DigitalVisionProject.service.models.AppUser;
import com.DigitalVisionProject.service.models.AppUserRole;
import com.DigitalVisionProject.service.models.RegistrationRequest;
import com.DigitalVisionProject.service.security.EmailValidator;
import com.DigitalVisionProject.service.services.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private EmailValidator emailValidator;
    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail){
            throw new IllegalStateException("email not valid");
        }
        return appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );
    }
}
