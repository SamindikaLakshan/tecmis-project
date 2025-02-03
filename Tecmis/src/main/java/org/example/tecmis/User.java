package org.example.tecmis;

public class User {

    private static String user;

    public static void setUser(String user_id) {
        user = user_id;
    }

    public static String getUser(){
        return user;
    }
}
