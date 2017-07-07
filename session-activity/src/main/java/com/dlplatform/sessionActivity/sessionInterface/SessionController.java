package com.dlplatform.sessionActivity.sessionInterface;

/**
 * Created by dach1016 on 06.07.2017.
 */
public interface SessionController {

    User getUser(String login, String password);

    boolean registerUser(User user);

    boolean removeUser(User user);

    boolean updateUser(User user);


}
