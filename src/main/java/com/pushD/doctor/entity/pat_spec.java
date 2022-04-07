package com.pushD.doctor.entity;

import org.springframework.data.annotation.Id;

public class pat_spec
{
    @Id
    int pat_id;
    int spec_id;

    public pat_spec(int pat_id, int spec_id)
    {
        this.pat_id = pat_id;
        this.spec_id = spec_id;
    }

    public int getPat_id() {
        return pat_id;
    }

    public void setPat_id(int pat_id) {
        this.pat_id = pat_id;
    }

    public int getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(int spec_id) {
        this.spec_id = spec_id;
    }
}
