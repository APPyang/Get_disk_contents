package com.yzt.other;

import org.apache.poi.ooxml.util.IdentifierManager;

public class identifierManager extends IdentifierManager {
    public identifierManager(long lowerbound, long upperbound) {
        super(lowerbound, upperbound);
    }

    @Override
    public long reserve(long id) {
        return super.reserve(id);
    }

    @Override
    public long reserveNew() {
        return super.reserveNew();
    }

    @Override
    public boolean release(long id) {
        return super.release(id);
    }

    @Override
    public long getRemainingIdentifiers() {
        return super.getRemainingIdentifiers();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
