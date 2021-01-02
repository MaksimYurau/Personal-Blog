package by.maksim.controller;

import by.maksim.domain.User;
import by.maksim.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/login")
public class LoginController {

    @GetMapping
    public String login() {
        return "login";
    }
//
//    @PostMapping("/login")
//    public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        User user = userRepository.findByUsername(username);
//        if (user.getPassword().equals(password)) {
//            HttpSession httpSession = req.getSession();
//            httpSession.setAttribute("user", user);
//            getServletContext().getRequestDispatcher("/resources/templates/blog-main.html").forward(req, resp);
//        } else {
//            req.setAttribute("message", "Failed: wrong password");
//            getServletContext().getRequestDispatcher("/resources/templates/login.html").forward(req, resp);
//        }
//    }
}
