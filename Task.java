import java.time.LocalDate;

public class Task {
    private int id;
    private String Title;
    private String Description;
    private LocalDate term;
    private boolean completed;
    public Task(int id, String Title, String Description, LocalDate term, boolean completed){
        this.id = id;
        this.Title = Title;
        this.Description = Description;
        this.term = term;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public LocalDate getTerm() {
        return term;
    }

    public boolean getCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
