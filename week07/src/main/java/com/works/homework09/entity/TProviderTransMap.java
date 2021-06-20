package com.works.homework09.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class TProviderTransMap {
    /**
     *  MERORDERNO
     */
    private String merorderno;

    /**
     *  TRACE
     */
    private String trace;

    /**
     *  INTIME
     */
    private Date intime;

    /**
     *  MODTIME
     */
    private Date modtime;

    /**
     * 
     * @author yqr
     * @date 2021-06-06 19:51:30
     * @return MERORDERNO 
     */
    public String getMerorderno() {
        return merorderno;
    }

    /**
     * 
     * @author yqr
     * @date 2021-06-06 19:51:30
     * @param merorderno 
     */
    public void setMerorderno(String merorderno) {
        this.merorderno = merorderno == null ? null : merorderno.trim();
    }

    /**
     * 
     * @author yqr
     * @date 2021-06-06 19:51:30
     * @return TRACE 
     */
    public String getTrace() {
        return trace;
    }

    /**
     * 
     * @author yqr
     * @date 2021-06-06 19:51:30
     * @param trace 
     */
    public void setTrace(String trace) {
        this.trace = trace == null ? null : trace.trim();
    }

    /**
     * 
     * @author yqr
     * @date 2021-06-06 19:51:30
     * @return INTIME 
     */
    public Date getIntime() {
        return intime;
    }

    /**
     * 
     * @author yqr
     * @date 2021-06-06 19:51:30
     * @param intime 
     */
    public void setIntime(Date intime) {
        this.intime = intime;
    }

    /**
     * 
     * @author yqr
     * @date 2021-06-06 19:51:30
     * @return MODTIME 
     */
    public Date getModtime() {
        return modtime;
    }

    /**
     * 
     * @author yqr
     * @date 2021-06-06 19:51:30
     * @param modtime 
     */
    public void setModtime(Date modtime) {
        this.modtime = modtime;
    }
}