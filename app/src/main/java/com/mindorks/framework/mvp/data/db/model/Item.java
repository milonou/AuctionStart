package com.mindorks.framework.mvp.data.db.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "ITEM")
public class Item {

    @Expose
    @SerializedName("ITEM_ID")
    @Id
    private String id;

    @Generated(hash = 2038556641)
    public Item(String id) {
        this.id = id;
    }

    @Generated(hash = 1470900980)
    public Item() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
