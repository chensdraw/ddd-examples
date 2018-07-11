package info.chaintech.july.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by shniu on 2018/7/7.
 */

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid;

    /**
     * 用户名, 使用手机号
     */
    @Column(length = 32, unique = true, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 32)
    private String realName;

    @Column(length = 10)
    private String sex;

    private Date createdOn;
    private Date updatedOn;
}
