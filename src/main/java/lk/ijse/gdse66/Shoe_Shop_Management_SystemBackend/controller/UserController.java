package lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.controller;

import lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.requestAndResponse.response.JwtAuthResponse;
import lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.requestAndResponse.secure.SignIn;
import lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class UserController {
    private final AuthenticationService authenticationService;

    @GetMapping("/health")
    public String healthCheck(){
        return "----------@DONE@----------";
    }

    //sign up (only one time)
    @PostMapping("/signup")
    public ResponseEntity<JwtAuthResponse> signUp(){
        return ResponseEntity.ok(authenticationService.signUp());
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthResponse> signIn(@RequestBody SignIn signInReq){
        return ResponseEntity.ok(authenticationService.signIn(signInReq));
    }
}
