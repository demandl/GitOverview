package net.poselyte.gitoverview;

public class Base {
    private long id;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String toString() {
        return "Base{" +
                "id=" + id +
                "}";
    }
    public boolean isNew() {
        return (this.id == 0);
    }
}
