package com.example.backend.model;

import com.example.backend.controller.dto.ContactDto;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Contact
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstName", nullable = false, length = 40)
    private String firstName;

    @Column(name = "lastName", nullable = false, length = 40)
    private String lastName;

    @Column(name = "email", nullable = false, length = 60)
    private String email;

    @Column(name = "tel", length = 20)
    private String tel;

    @Column(name = "role", length = 40)
    private String role;

    @Column(name = "description", length = 60)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "companyId", nullable = false)
    @JsonIgnore
    private Company company;

    public Contact(Long id, String firstName, String lastName, String email, String tel, String role, String description, Company company)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.tel = tel;
        this.role = role;
        this.description = description;
        this.company = company;
    }

    public Contact()
    {
    }

    public Contact(String firstName, String lastName, String email, String tel, String role, String description)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.tel = tel;
        this.role = role;
        this.description = description;
    }

    public Long getId()
    {
        return id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTel()
    {
        return tel;
    }

    public void setTel(String tel)
    {
        this.tel = tel;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Company getCompany()
    {
        return company;
    }

    public void setCompany(Company company)
    {
        this.company = company;
    }

    public void updateWith(ContactDto contactDto)
    {
        firstName = contactDto.getFirstName();
        lastName = contactDto.getLastName();
        email = contactDto.getEmail();
        tel = contactDto.getTel();
        role = contactDto.getRole();
        description = contactDto.getDescription();
    }
}
