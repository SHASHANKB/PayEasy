package com.payeasy.models;

import java.io.Serializable;

/**
 * Created by shashank on 25/4/16.
 */
public class BaseRequest implements Serializable {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseRequest that = (BaseRequest) o;

        return id == that.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "id=" + id +
                '}';
    }
}
