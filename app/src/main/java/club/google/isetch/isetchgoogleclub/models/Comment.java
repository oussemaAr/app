package club.google.isetch.isetchgoogleclub.models;

import com.google.firebase.database.IgnoreExtraProperties;

// [START comment_class]
@IgnoreExtraProperties
public class Comment {

    public String uid;
    public String author;
    public String text;
    public String created_at;

    public Comment() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public Comment(String uid, String author, String text) {
        this.uid = uid;
        this.author = author;
        this.text = text;
    }

    public Comment(String uid, String author, String text, String created_at) {
        this.uid = uid;
        this.author = author;
        this.text = text;
        this.created_at = created_at;
    }
}
// [END comment_class]
