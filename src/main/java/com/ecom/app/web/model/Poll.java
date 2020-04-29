package com.ecom.app.web.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Poll implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    @NotEmpty
    private String question;
    @Size(min=2, max = 6)
    private List<Option> options;

    public List<Option> getDefaultOptions() {
        if (this.options == null) {
            this.options = new ArrayList<Option>();
        }
        return this.options;
    }
}
