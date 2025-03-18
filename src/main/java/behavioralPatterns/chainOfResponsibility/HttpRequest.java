package behavioralPatterns.chainOfResponsibility;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HttpRequest {

    private String username;
    private String password;
}
