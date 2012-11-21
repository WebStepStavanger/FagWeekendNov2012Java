package no.webstep.person;

import java.net.URI;

import com.google.common.base.Objects;

public class Person {
    
    private Integer id;
    private String name;
    private String title;
    private String email;
    private String phoneNumber;
    private URI infoUrl;
    private String info;
    private URI imageUrl;
    private String firstName;
    private String lastName;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public URI getInfoUrl() {
        return infoUrl;
    }
    public void setInfoUrl(URI infoUrl) {
        this.infoUrl = infoUrl;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public URI getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(URI imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        return getEmail().hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Person)) return false;
        Person p2 = (Person) obj;
        return Objects.equal(getEmail(), p2.getEmail());
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", getId())
                .add("Name", getName())
                .add("Email", getEmail())
                .toString();
    }
}
