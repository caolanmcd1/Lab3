package ie.atu.lab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serial;
@Service
public class UserService
{
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService)
    {
        this.emailService = emailService;
    }

    public String registerUser(String username, String email)
    {
       return emailService.sendEmail(email, "Welcome our Platform " + username);
    }
}
