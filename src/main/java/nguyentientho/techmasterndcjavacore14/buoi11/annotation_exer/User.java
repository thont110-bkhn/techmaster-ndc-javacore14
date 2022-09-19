package nguyentientho.techmasterndcjavacore14.buoi11.annotation_exer;

import java.util.Date;

public class User {

    @MetaDataField(name = "id", type = Long.class, isPrimaryKey = true)
    // name = "" , type = Long.class, isPrimaryKey = false
    private long id;

    @MetaDataField(name = "name", type = String.class, isPrimaryKey = true)
    private String name;

    @MetaDataField(name = "email", type = String.class)
    private String email;

    @MetaDataField(name = "created", type = Date.class)
    private Date created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", created=" + created +
                '}';
    }
}
