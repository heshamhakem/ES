package com.example.etrading.FireBase;

import com.example.etrading.FireBase.Models.User;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class UserDao  {

   public static final String RefereanceName = "User";
    public  static FirebaseDatabase GetInstance()
    {
        return FirebaseDatabase.getInstance();
    }
    public static DatabaseReference AddUsersRefrance()
    {
        return GetInstance().getReference(RefereanceName);
    }
    public static void AddUser(User user, OnSuccessListener onSuccessListener , OnFailureListener onFailureListener)
    {
            AddUsersRefrance().child(user.getId()).setValue(user)
                .addOnSuccessListener(onSuccessListener)
                .addOnFailureListener(onFailureListener);
    }
    public  static Query Login (String Email)
    {
          Query query = AddUsersRefrance().orderByChild("email").equalTo(Email);
        return query;
    }
}
