package com.epam.esm.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class GiftCertificateDTO {

    private int id;
    private String name;
    private String description;
    private int price;
    private int duration;
    private Date createDate;
    private Date lastsUpdateDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> tagNames;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastsUpdateDate() {
        return lastsUpdateDate;
    }

    public void setLastsUpdateDate(Date lastsUpdateDate) {
        this.lastsUpdateDate = lastsUpdateDate;
    }

    public List<String> getTagNames() {
        return tagNames;
    }

    public void setTagNames(List<String> tagName) {
        this.tagNames = tagName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiftCertificateDTO that = (GiftCertificateDTO) o;
        return id == that.id &&
                price == that.price &&
                duration == that.duration &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(lastsUpdateDate, that.lastsUpdateDate) &&
                Objects.equals(tagNames, that.tagNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price, duration, createDate, lastsUpdateDate, tagNames);
    }

    @Override
    public String toString() {
        return "GiftCertificateDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                ", createDate=" + createDate +
                ", lastsUpdateDate=" + lastsUpdateDate +
                ", tagName=" + tagNames +
                '}';
    }
}
