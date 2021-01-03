package by.maksim.restcontroller;

import by.maksim.domain.ErrorResponse;
import by.maksim.domain.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ApiOperation(value = "/api/v1/user", tags = "User Profile Container", notes = "User Profile API")
@RestController
@RequestMapping(path = "/api/v1/user")
public class UserProfileController {

    List<User> users = Arrays.asList(
            new User("username1", "password1", "name1", true),
            new User("username2", "password2", "name2", true),
            new User("username3", "password3", "name3", true),
            new User("username4", "password4", "name4", true)
    );

    @ApiOperation(value = "Fetch All Users")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "SUCCESS", response = User.class),
            @ApiResponse(code = 401, message = "UNAUTHORIZED!", response = ErrorResponse.class),
            @ApiResponse(code = 403, message = "FORBIDDEN!", response = ErrorResponse.class),
            @ApiResponse(code = 404, message = "NOT FOUND")
    })

    @GetMapping(value = "/fetch/all")
    public List<User> fetchAllUsers() {
        return users;
    }

//    @ApiOperation(value = "Fetch User by Name", response = User.class)
//    @GetMapping(value = "/fetch/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<User> fetchEmployeeByName(@ApiParam(value = "User Name") @PathVariable(value = "name") String name) {
//        return (List<User>) users.stream().filter(x -> x.getName().equalsIgnoreCase(name)).findFirst().get();
//    }

//    @ApiOperation(value = "Get User By Department", response = User.class)
//    @GetMapping(value = "/fetch/{department}")
//    public List<User> fetchUserByDepartment(@ApiParam(value = "Department Name", required = true) @PathVariable(value = "department") String department) {
//        return users.stream().filter(x -> x.getDepartment().equalsIgnoreCase(department)).collect(Collectors.toList());
//    }

    @ApiOperation(value = "Insert User Record", response = User.class)
    @PostMapping
    public User insertUser(@ApiParam(value = "User") @RequestBody User user) {
        return user;
    }

    @ApiOperation(value = "Update User Details", response = User.class)
    @PutMapping
    public User updateUser(@ApiParam(value = "User") @RequestBody User user) {
        return user;
    }

    @ApiOperation(value = "Delete User", response = User.class)
    @DeleteMapping
    public User deleteUser(@ApiParam(value = "User") @RequestBody User user) {
        return user;
    }

    @ApiOperation(value = "Partial Update a specific Student in the System ", response = User.class)
    @PatchMapping
    public Object patchUser(@ApiParam(value = "User") @RequestBody Map<String, Object> partialUpdate) {
        return partialUpdate;
    }
}
