package com.example.meet.customadapter;

import android.widget.TextView;

public class employee_view_holder {

    TextView tvid;
    TextView tvname;

    public employee_view_holder(TextView tvid, TextView tvname) {
        this.tvid = tvid;
        this.tvname = tvname;
    }

    public TextView getTvid() {
        return tvid;
    }

    public void setTvid(TextView tvid) {
        this.tvid = tvid;
    }

    public TextView getTvname() {
        return tvname;
    }

    public void setTvname(TextView tvname) {
        this.tvname = tvname;
    }
}
