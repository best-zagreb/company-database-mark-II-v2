package com.example.backend.companies.model;

import com.example.backend.companies.controller.dto.CompanyDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
public class Company
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 60, nullable = false)
    private String name;

    @Column(name = "domain", length = 40, nullable = false)
    private String domain;

    @Column(name = "abcCategory")
    private Character abcCategory;

    @Column(name = "budgetPlanningMonth")
    private String budgetPlanningMonth;

    @Column(length = 60, name = "country", nullable = false)
    private String country;

    // TODO: change zipcode to townName and delete town entity
//    @Column(name = "townName", nullable = false, length = 120)
//    private String townName;
    @Column(name = "zipCode", nullable = false)
    private int zipCode;

    @Column(name = "address", nullable = false, length = 120)
    private String address;

    @Column(name = "webUrl", length = 60)
    private String webUrl;

    @Column(name = "contactInFuture", nullable = false)
    private boolean contactInFuture;

    @Column(name = "description", length = 480)
    private String description;

    @Column(name = "softLock")
    @Getter
    @Setter
    private Boolean softLock = false;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private Set<Contact> contacts;

    public Company(Long id, String name, String domain, Character abcCategory, String budgetPlanningMonth, String country, int zipCode, String address, String webUrl, boolean contactInFuture, String description) {
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.abcCategory = abcCategory;
        this.budgetPlanningMonth = budgetPlanningMonth;
        this.country = country;
        this.zipCode = zipCode;
        this.address = address;
        this.webUrl = webUrl;
        this.contactInFuture = contactInFuture;
        this.description = description;
        this.softLock = false;
    }

    public Company(String name, String domain, Character abcCategory, String budgetPlanningMonth, String country, int zipCode, String address, String webUrl, boolean contactInFuture, String description) {
        this.name = name;
        this.domain = domain;
        this.abcCategory = abcCategory;
        this.budgetPlanningMonth = budgetPlanningMonth;
        this.country = country;
        this.zipCode = zipCode;
        this.address = address;
        this.webUrl = webUrl;
        this.contactInFuture = contactInFuture;
        this.description = description;
        this.softLock = false;
    }

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDomain()
    {
        return domain;
    }

    public void setDomain(String domain)
    {
        this.domain = domain;
    }

    public Character getAbcCategory()
    {
        return abcCategory;
    }

    public void setAbcCategory(Character abcCategory)
    {
        this.abcCategory = abcCategory;
    }

    public String getBudgetPlanningMonth()
    {
        return budgetPlanningMonth;
    }

    public void setBudgetPlanningMonth(String budgetPlanningMonth)
    {
        this.budgetPlanningMonth = budgetPlanningMonth;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public int getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(int zipCode)
    {
        this.zipCode = zipCode;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getWebUrl()
    {
        return webUrl;
    }

    public void setWebUrl(String webUrl)
    {
        this.webUrl = webUrl;
    }

    public boolean shouldContactInFuture()
    {
        return contactInFuture;
    }

    public void setContactInFuture(boolean contactInFuture)
    {
        this.contactInFuture = contactInFuture;
    }
    public Set<Contact> getContacts(){
        return this.contacts;
    }

    public void updateWith(CompanyDto companyDto){
        name = companyDto.getName();
        address = companyDto.getAddress();
        domain = companyDto.getDomain();
        country = companyDto.getCountry();
        abcCategory = companyDto.getAbcCategory();
        budgetPlanningMonth = companyDto.getBudgetPlanningMonth();
        zipCode = companyDto.getZipCode();
        webUrl = companyDto.getWebUrl();
        contactInFuture = companyDto.isContactInFuture();
        description = companyDto.getDescription();
    }
}
