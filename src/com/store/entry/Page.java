package com.store.entry;

import java.io.Serializable;
import java.util.List;

public class Page<T> implements Serializable {
    private Integer pageStart;   //开始数据的索引
    private Integer pageSize;    //每一页的数量
    private Integer pageTotal;    //总共的数据量

    public Page(Integer pageStart, Integer pageSize) {
        this.pageStart = pageStart;
        this.pageSize = pageSize;
    }

    /**
     * 判断是否有上一页
     * @return
     */
    public boolean isHasPrev(){
        if(pageStart == 0)
            return false;
        return true;
    }
    /**
     * 判断是否有下一页
     * @return
     */
    public boolean isHasNext(){
        if(pageStart == getLast())
            return false;
        return true;
    }

    public int getTotalPage(){
        int totalPage;
        // 假设总数是50，是能够被5整除的，那么就有10页
        if (0 == pageTotal % pageSize)
            totalPage = pageTotal /pageSize;
            // 假设总数是51，不能够被5整除的，那么就有11页
        else
            totalPage = pageTotal / pageSize + 1;

        if(0 == totalPage)
            totalPage = 1;
        return totalPage;
    }

    /**
     * 计算得到尾页
     * @return
     */
    public int getLast(){
        int last;
        // 假设总数是50，是能够被5整除的，那么最后一页的开始就是45
        if (0 == pageTotal % pageSize)
            last = pageTotal - pageSize;
        else
            last = pageTotal - pageTotal % pageSize;
        last = last<0?0:last;
        return last;
    }

    public Integer getPageStart() {
        return pageStart;
    }

    public void setPageStart(Integer pageStart) {
        this.pageStart = pageStart;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageStart=" + pageStart +
                ", pageSize=" + pageSize +
                ", pageTotal=" + pageTotal +
                '}';
    }
}
