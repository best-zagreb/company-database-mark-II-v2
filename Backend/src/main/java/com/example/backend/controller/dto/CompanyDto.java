package com.example.backend.controller.dto;

import com.example.backend.model.Company;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CompanyDto
{
    private String name;

    private String domain;

    private char abcCategory;

    private int budgetPlanningMonth;

    private String country;

    private int zipCode;

    private String address;

    private String webUrl;

    private boolean contactInFuture;

    public CompanyDto(String name, String domain, char abcCategory, int budgetPlanningMonth, String country, int zipCode, String address, String webUrl, boolean contactInFuture)
    {
        this.name = name;
        this.domain = domain;
        this.abcCategory = abcCategory;
        this.budgetPlanningMonth = budgetPlanningMonth;
        this.country = country;
        this.zipCode = zipCode;
        this.address = address;
        this.webUrl = webUrl;
        this.contactInFuture = contactInFuture;
    }

    public Company toCompany(){
        return new Company(
                name,
                domain,
                abcCategory,
                budgetPlanningMonth,
                country,
                zipCode,
                address,
                webUrl,
                contactInFuture
        );
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

    public char getAbcCategory()
    {
        return abcCategory;
    }

    public void setAbcCategory(char abcCategory)
    {
        this.abcCategory = abcCategory;
    }

    public int getBudgetPlanningMonth()
    {
        return budgetPlanningMonth;
    }

    public void setBudgetPlanningMonth(int budgetPlanningMonth)
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

    public boolean isContactInFuture()
    {
        return contactInFuture;
    }

    public void setContactInFuture(boolean contactInFuture)
    {
        this.contactInFuture = contactInFuture;
    }
}
