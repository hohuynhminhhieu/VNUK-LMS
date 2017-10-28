package vnuk.edu.vn.cse15.vnuk_lms;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Random;

import vnuk.edu.vn.cse15.vnuk_lms.DataStructure.User;

/**
 * Created by ngocb on 10/28/2017.
 */

public class GenerateDummyData {

    private ArrayList<User> userArrayList = new ArrayList<>();

    public GenerateDummyData(){}

    public void GenerateUserArrayList(int numberOfUsers){
        User newUser;

        for(int i = 0; i < numberOfUsers; i++){
            newUser = new User();
            newUser.setId(i);
            newUser.setUsername("username" + i);
            newUser.setPassword("password" + i);
            newUser.setAccess((new Random()).nextInt(2));

            FirebaseDatabase.getInstance().getReference().child("root").child("users").child(newUser.getUsername() + "-" + newUser.getPassword()).setValue(newUser);
        }
    }
}










