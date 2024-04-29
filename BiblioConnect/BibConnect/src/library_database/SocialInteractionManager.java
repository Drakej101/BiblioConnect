import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SocialInteraction {
    private int id;
    private Patron author;
    private String content;
    private Date datePosted;
    private List<Comment> comments;
    private List<Patron> likes;
    private List<Patron> shares;
    
    // Constructor
    public SocialInteraction(int id, Patron author, String content, Date datePosted) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.datePosted = datePosted;
        this.comments = new ArrayList<>();
        this.likes = new ArrayList<>();
        this.shares = new ArrayList<>();
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Patron getAuthor() {
        return author;
    }
    
    public void setAuthor(Patron author) {
        this.author = author;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public Date getDatePosted() {
        return datePosted;
    }
    
    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }
    
    public List<Comment> getComments() {
        return comments;
    }
    
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    
    public List<Patron> getLikes() {
        return likes;
    }
    
    public void setLikes(List<Patron> likes) {
        this.likes = likes;
    }
    
    public List<Patron> getShares() {
        return shares;
    }
    
    public void setShares(List<Patron> shares) {
        this.shares = shares;
    }
}




















































