package org.launchcode.spaday.Data;

import org.launchcode.spaday.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {
    private static Map<Integer, User> users=new HashMap<>();
    //get all event
    public static Collection<User> getAll(){
        return users.values();
    }
    //get a single event
    public static User getById(int id){
        return users.get(id);
    }

    //add an event
    public static void add(User user){
        users.put(user.getId(),user);
    }
    public static void remove(int id){
        users.remove(id);
    }
}
