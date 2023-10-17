package ie.atu.lab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController
{
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public String getUser(@PathVariable String name,@PathVariable String email)
    {
        return userService.registerUser(name,email);
    }

    @PostMapping("/registeruserbody")
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, String> registerUserBody(@RequestBody User user)
    {
        Map<String,String> response = new HashMap<>();

        response.put("name", user.getName());
        response.put("email", user.getEmail());

        return response;
    }
}
