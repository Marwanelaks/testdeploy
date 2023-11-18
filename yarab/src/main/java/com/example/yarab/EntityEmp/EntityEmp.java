package com.example.yarab.EntityEmp;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "Test")
public class EntityEmp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "email")
    private String email;

    @Column(name = "cine")
    private String cine;

    @Column(name = "phone")
    private BigInteger phone;

    @Lob
    private byte[] profileImg;
//    private String profileImgUrl;

    public EntityEmp() {
    }

    public EntityEmp(String nom, String email, String cine, BigInteger phone, byte[] profileImg) {
        this.nom = nom;
        this.email = email;
        this.cine = cine;
        this.phone = phone;
        this.profileImg = profileImg;
//        this.profileImgUrl = profileImgUrl;
    }

    // Getters and setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCine() {
        return cine;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }

    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }

    public byte[] getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(byte[] profileImg) {
        this.profileImg = profileImg;
    }

//    public String getProfileImgUrl() {
//        return profileImgUrl;
//    }
//
//    public void setProfileImgUrl(String profileImgUrl) {
//        this.profileImgUrl = profileImgUrl;
//    }
}