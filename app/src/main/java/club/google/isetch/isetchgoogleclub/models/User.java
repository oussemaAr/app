package club.google.isetch.isetchgoogleclub.models;

import com.google.firebase.database.IgnoreExtraProperties;

// [START blog_user_class]
@IgnoreExtraProperties
public class User {

    public String username;
    public String email;
    public String profilPic;
    public String coverPic;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public User(String username, String email, String profilPic, String coverPic) {
        this.username = username;
        this.email = email;
        this.profilPic = profilPic;
        this.coverPic = coverPic;
    }
}
// [END blog_user_class]
