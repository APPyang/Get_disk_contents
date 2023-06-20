package com.yzt.other;

import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.compress.changes.ChangeSet;
import org.apache.commons.compress.changes.ChangeSetPerformer;
import org.apache.commons.compress.changes.ChangeSetResults;

import java.io.IOException;

public class changeSetPerformer extends ChangeSetPerformer {
    public changeSetPerformer(ChangeSet changeSet) {
        super(changeSet);
    }

    @Override
    public ChangeSetResults perform(ArchiveInputStream in, ArchiveOutputStream out) throws IOException {
        return super.perform(in, out);
    }
    @Override
    public ChangeSetResults perform(ZipFile in, ArchiveOutputStream out) throws IOException {
        return super.perform(in, out);
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
