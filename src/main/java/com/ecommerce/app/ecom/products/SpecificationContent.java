package com.ecommerce.app.ecom.products;

import java.util.List;

public class SpecificationContent {


    private String subsection;
    private List<String> values;

    public SpecificationContent(String subsection, List<String> values) {
        this.subsection = subsection;
        this.values = values;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}
