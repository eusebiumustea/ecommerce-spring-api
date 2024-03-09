package com.ecommerce.app.ecom;

import java.util.List;

public class ProductSpecification {

    private String section;
    private List<SpecificationContent> contents;
    public ProductSpecification(String section, List<SpecificationContent> contents) {
        this.section = section;
        this.contents = contents;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public List<SpecificationContent> getContents() {
        return contents;
    }

    public void setContents(List<SpecificationContent> contents) {
        this.contents = contents;
    }
}
