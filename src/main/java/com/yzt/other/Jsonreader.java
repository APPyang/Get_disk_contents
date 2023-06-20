package com.yzt.other;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import java.io.IOException;
import java.io.Reader;

public class Jsonreader extends JsonReader {
    public Jsonreader(Reader in) {
        super(in);
    }

    @Override
    public void beginArray() throws IOException {
        super.beginArray();
    }

    @Override
    public void endArray() throws IOException {
        super.endArray();
    }

    @Override
    public void beginObject() throws IOException {
        super.beginObject();
    }

    @Override
    public void endObject() throws IOException {
        super.endObject();
    }

    @Override
    public boolean hasNext() throws IOException {
        return super.hasNext();
    }

    @Override
    public JsonToken peek() throws IOException {
        return super.peek();
    }

    @Override
    public String nextName() throws IOException {
        return super.nextName();
    }

    @Override
    public String nextString() throws IOException {
        return super.nextString();
    }

    @Override
    public boolean nextBoolean() throws IOException {
        return super.nextBoolean();
    }

    @Override
    public void nextNull() throws IOException {
        super.nextNull();
    }

    @Override
    public double nextDouble() throws IOException {
        return super.nextDouble();
    }

    @Override
    public long nextLong() throws IOException {
        return super.nextLong();
    }

    @Override
    public int nextInt() throws IOException {
        return super.nextInt();
    }

    @Override
    public void close() throws IOException {
        super.close();
    }

    @Override
    public void skipValue() throws IOException {
        super.skipValue();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getPath() {
        return super.getPath();
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
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
