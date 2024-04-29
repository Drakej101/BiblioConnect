public class Comment {
    private int id;
    private Patron author;
    private String content;
    private SocialInteraction parentInteraction;
    
    // Constructor
    public Comment(int id, Patron author, String content, SocialInteraction parentInteraction) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.parentInteraction = parentInteraction;
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
    
    public SocialInteraction getParentInteraction() {
        return parentInteraction;
    }
    
    public void setParentInteraction(SocialInteraction parentInteraction) {
        this.parentInteraction = parentInteraction;
    }
}
