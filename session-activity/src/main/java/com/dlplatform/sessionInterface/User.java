package com.dlplatform.sessionInterface;

import java.util.Date;

public interface User {

    int getUser_id();

    void setUser_id(int user_id);

    String getLogin();

    void setLogin(String login);

    int getSys_id();

    void setSys_id(int sys_id);

    String getEmail();

    void setEmail(String email);

    String getPassword();

    void setPassword(String password);

    String getName();

    void setName(String name);

    Date getBirthday();

    void setBirthday(Date birthday);

    Date getRegistrationDate();

    void setRegistrationDate(Date registrationDate);

}
