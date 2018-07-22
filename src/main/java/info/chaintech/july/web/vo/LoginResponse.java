package info.chaintech.july.web.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LoginResponse {
    private String token;
    private String realName;
    private String username;
    private String registerOn;
}
