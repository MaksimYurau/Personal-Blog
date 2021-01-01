//package by.maksim.service;
//
//import by.maksim.domain.User;
//import by.maksim.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User userFindByUsername = userRepository.findByUsername(username);
//        User userFindByName = userRepository.findByName(username);
//
//        if(userFindByUsername != null)
//        {
//            return (UserDetails) userFindByUsername;
//        }
//
//        if(userFindByName != null)
//        {
//            return (UserDetails) userFindByName;
//        }
//
//        return null;
//    }
//}
