package com.yzt.other;

import org.apache.poi.ss.usermodel.*;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class row implements Row{
    @Override
    public Cell createCell(int i) {
        return null;
    }

    @Override
    public Cell createCell(int i, CellType cellType) {
        return null;
    }

    @Override
    public void removeCell(Cell cell) {

    }

    @Override
    public void setRowNum(int i) {

    }

    @Override
    public int getRowNum() {
        return 0;
    }

    @Override
    public Cell getCell(int i) {
        return null;
    }

    @Override
    public Cell getCell(int i, MissingCellPolicy missingCellPolicy) {
        return null;
    }

    @Override
    public short getFirstCellNum() {
        return 0;
    }

    @Override
    public short getLastCellNum() {
        return 0;
    }

    @Override
    public int getPhysicalNumberOfCells() {
        return 0;
    }

    @Override
    public void setHeight(short i) {

    }

    @Override
    public void setZeroHeight(boolean b) {

    }

    @Override
    public boolean getZeroHeight() {
        return false;
    }

    @Override
    public void setHeightInPoints(float v) {

    }

    @Override
    public short getHeight() {
        return 0;
    }

    @Override
    public float getHeightInPoints() {
        return 0;
    }

    @Override
    public boolean isFormatted() {
        return false;
    }

    @Override
    public CellStyle getRowStyle() {
        return null;
    }

    @Override
    public void setRowStyle(CellStyle cellStyle) {

    }

    @Override
    public Iterator<Cell> cellIterator() {
        return null;
    }

    @Override
    public Sheet getSheet() {
        return null;
    }

    @Override
    public int getOutlineLevel() {
        return 0;
    }

    @Override
    public void shiftCellsRight(int i, int i1, int i2) {

    }

    @Override
    public void shiftCellsLeft(int i, int i1, int i2) {

    }

    @Override
    public Iterator<Cell> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Cell> action) {
        Row.super.forEach(action);
    }

    @Override
    public Spliterator<Cell> spliterator() {
        return Row.super.spliterator();
    }

    public row() {
        super();
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
