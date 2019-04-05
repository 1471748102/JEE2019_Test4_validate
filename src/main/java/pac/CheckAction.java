package pac;

import com.opensymphony.xwork2.ActionSupport;

public class CheckAction extends ActionSupport {

    private String username;
    private String password;
    private int age;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() { return age; }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) { this.age = age; }
/*
    public void validate() {

        if (username == null || username.isEmpty()) {
            addFieldError("username", "错误,用户名不能为空!");
        }
        if (password == null || password.isEmpty()) {
            addFieldError("password", "错误,密码不能为空");
        }
        if ( String.valueOf(age)==null || String.valueOf(age).isEmpty()|| age>120 || age<10 ){
            addFieldError("age", "错误,年龄不能为空,且位于10-120之间");
        }

    }

*/


}

