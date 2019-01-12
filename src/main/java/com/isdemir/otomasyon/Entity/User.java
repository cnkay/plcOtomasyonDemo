package com.isdemir.otomasyon.Entity;

/*import javax.persistence.*;*/

/*@Entity
@Table(name="user")*/
public class User {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")*/
    private int id;
    /*@Column(name = "firstName")*/
    private String firstName;
    /*@Column(name = "lastName")*/
    private String lastName;
    /*@Column(name = "mail")*/
    private String mail;
    /*@Column(name = "username")*/
    private String username;
    /*@Column(name = "password")*/
    private String password;
/*    @OneToMany
    @JoinColumn(name="user_id")
    private Role role;*/

    public User() {
    }

    public User(String firstName, String lastName, String mail, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
