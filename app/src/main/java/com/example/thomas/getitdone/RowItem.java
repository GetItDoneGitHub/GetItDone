package com.example.thomas.getitdone;

/**
 * Created by All on 10/23/2017.
 */

public class RowItem {

    private String transaction;
    private int trans_icon_id;
    private String trans_description;

    public RowItem(String transaction, int trans_icon_id, String trans_description) {

        this.transaction = transaction;
        this.trans_icon_id = trans_icon_id;
        this.trans_description = trans_description;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String member_name) {
        this.transaction = member_name;
    }

    public int getTrans_icon_id() {
        return trans_icon_id;
    }

    public void setTrans_icon_id(int trans_icon_id) {
        this.trans_icon_id = trans_icon_id;
    }

    public String getTrans_description() {
        return trans_description;
    }

    public void setTrans_description(String status) {
        this.trans_description = trans_description;
    }

}
