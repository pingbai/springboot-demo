package org.laobai.demo.struct;

import org.laobai.demo.entity.User;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {
    // 当前页数据
    private List<T> rows;
    // 总条目数
    private long total;

    public PageResult() {
    }

    public PageResult(List<T> rows, long total) {
        this.rows = rows;
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
