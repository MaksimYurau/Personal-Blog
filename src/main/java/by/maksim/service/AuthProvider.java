//package by.maksim.service;
//
//import by.maksim.domain.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AuthProvider implements AuthenticationProvider {
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException
//    {
//        String username = authentication.getName();
//        String password = (String) authentication.getCredentials();
//
//        User user = (User) userService.loadUserByUsername(username);
//
//        if(user != null && (user.getUsername().equals(username) || user.getName().equals(username))) {
//            if (!passwordEncoder.matches(password, user.getPassword())) {
//                throw new BadCredentialsException("Wrong password");
//            }
//        }
//        return authentication;
//    }
//
//    public boolean supports(Class<?> arg)
//    {
//        return true;
//    }
//}
