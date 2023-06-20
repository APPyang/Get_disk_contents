package com.yzt.other;

import org.apache.fontbox.ttf.TrueTypeFont;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.PDEncryption;
import org.apache.pdfbox.pdmodel.encryption.ProtectionPolicy;
import org.apache.pdfbox.pdmodel.interactive.digitalsignature.ExternalSigningSupport;
import org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature;
import org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureInterface;
import org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions;
import org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class doc extends PDDocument {
    @Override
    public void addPage(PDPage page) {
        super.addPage(page);
    }

    @Override
    public void addSignature(PDSignature sigObject) throws IOException {
        super.addSignature(sigObject);
    }

    @Override
    public void addSignature(PDSignature sigObject, SignatureOptions options) throws IOException {
        super.addSignature(sigObject, options);
    }

    @Override
    public void addSignature(PDSignature sigObject, SignatureInterface signatureInterface) throws IOException {
        super.addSignature(sigObject, signatureInterface);
    }

    @Override
    public void addSignature(PDSignature sigObject, SignatureInterface signatureInterface, SignatureOptions options) throws IOException {
        super.addSignature(sigObject, signatureInterface, options);
    }

    @Override
    public void addSignatureField(List<PDSignatureField> sigFields, SignatureInterface signatureInterface, SignatureOptions options) throws IOException {
        super.addSignatureField(sigFields, signatureInterface, options);
    }

    @Override
    public void removePage(PDPage page) {
        super.removePage(page);
    }

    @Override
    public void removePage(int pageNumber) {
        super.removePage(pageNumber);
    }

    @Override
    public PDPage importPage(PDPage page) throws IOException {
        return super.importPage(page);
    }

    @Override
    public COSDocument getDocument() {
        return super.getDocument();
    }

    @Override
    public PDDocumentInformation getDocumentInformation() {
        return super.getDocumentInformation();
    }

    @Override
    public void setDocumentInformation(PDDocumentInformation info) {
        super.setDocumentInformation(info);
    }

    @Override
    public PDDocumentCatalog getDocumentCatalog() {
        return super.getDocumentCatalog();
    }

    @Override
    public boolean isEncrypted() {
        return super.isEncrypted();
    }

    @Override
    public PDEncryption getEncryption() {
        return super.getEncryption();
    }

    @Override
    public void setEncryptionDictionary(PDEncryption encryption) throws IOException {
        super.setEncryptionDictionary(encryption);
    }

    @Override
    public PDSignature getLastSignatureDictionary() throws IOException {
        return super.getLastSignatureDictionary();
    }

    @Override
    public List<PDSignatureField> getSignatureFields() throws IOException {
        return super.getSignatureFields();
    }

    @Override
    public List<PDSignature> getSignatureDictionaries() throws IOException {
        return super.getSignatureDictionaries();
    }

    @Override
    public void registerTrueTypeFontForClosing(TrueTypeFont ttf) {
        super.registerTrueTypeFontForClosing(ttf);
    }

    @Override
    public void save(String fileName) throws IOException {
        super.save(fileName);
    }

    @Override
    public void save(File file) throws IOException {
        super.save(file);
    }

    @Override
    public void save(OutputStream output) throws IOException {
        super.save(output);
    }

    @Override
    public void saveIncremental(OutputStream output) throws IOException {
        super.saveIncremental(output);
    }

    @Override
    public ExternalSigningSupport saveIncrementalForExternalSigning(OutputStream output) throws IOException {
        return super.saveIncrementalForExternalSigning(output);
    }

    @Override
    public PDPage getPage(int pageIndex) {
        return super.getPage(pageIndex);
    }

    @Override
    public PDPageTree getPages() {
        return super.getPages();
    }

    @Override
    public int getNumberOfPages() {
        return super.getNumberOfPages();
    }

    @Override
    public void close() throws IOException {
        super.close();
    }

    @Override
    public void protect(ProtectionPolicy policy) throws IOException {
        super.protect(policy);
    }

    @Override
    public AccessPermission getCurrentAccessPermission() {
        return super.getCurrentAccessPermission();
    }

    @Override
    public boolean isAllSecurityToBeRemoved() {
        return super.isAllSecurityToBeRemoved();
    }

    @Override
    public void setAllSecurityToBeRemoved(boolean removeAllSecurity) {
        super.setAllSecurityToBeRemoved(removeAllSecurity);
    }

    @Override
    public Long getDocumentId() {
        return super.getDocumentId();
    }

    @Override
    public void setDocumentId(Long docId) {
        super.setDocumentId(docId);
    }

    @Override
    public float getVersion() {
        return super.getVersion();
    }

    @Override
    public void setVersion(float newVersion) {
        super.setVersion(newVersion);
    }

    @Override
    public ResourceCache getResourceCache() {
        return super.getResourceCache();
    }

    @Override
    public void setResourceCache(ResourceCache resourceCache) {
        super.setResourceCache(resourceCache);
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

    public doc() {
    }

    public doc(MemoryUsageSetting memUsageSetting) {
        super(memUsageSetting);
    }

    public doc(COSDocument doc) {
        super(doc);
    }

    public doc(COSDocument doc, RandomAccessRead source) {
        super(doc, source);
    }

    public doc(COSDocument doc, RandomAccessRead source, AccessPermission permission) {
        super(doc, source, permission);
    }
}