package com.yzt.other;

import org.apache.poi.ooxml.POIXMLDocumentPart;
import org.apache.poi.ooxml.POIXMLFactory;
import org.apache.poi.ooxml.POIXMLProperties;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.wp.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.*;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.PhantomReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class wq extends XWPFDocument {
    @Override
    protected void onDocumentRead() throws IOException {
        super.onDocumentRead();
    }

    @Override
    protected void onDocumentCreate() {
        super.onDocumentCreate();
    }

    @Override
    public CTDocument1 getDocument() {
        return super.getDocument();
    }

    @Override
    public List<IBodyElement> getBodyElements() {
        return super.getBodyElements();
    }

    @Override
    public Iterator<IBodyElement> getBodyElementsIterator() {
        return super.getBodyElementsIterator();
    }

    @Override
    public List<XWPFParagraph> getParagraphs() {
        return super.getParagraphs();
    }

    @Override
    public List<XWPFTable> getTables() {
        return super.getTables();
    }

    @Override
    public List<XWPFChart> getCharts() {
        return super.getCharts();
    }

    @Override
    public XWPFTable getTableArray(int pos) {
        return super.getTableArray(pos);
    }

    @Override
    public List<XWPFFooter> getFooterList() {
        return super.getFooterList();
    }

    @Override
    public XWPFFooter getFooterArray(int pos) {
        return super.getFooterArray(pos);
    }

    @Override
    public List<XWPFHeader> getHeaderList() {
        return super.getHeaderList();
    }

    @Override
    public XWPFHeader getHeaderArray(int pos) {
        return super.getHeaderArray(pos);
    }

    @Override
    public String getTblStyle(XWPFTable table) {
        return super.getTblStyle(table);
    }

    @Override
    public XWPFHyperlink getHyperlinkByID(String id) {
        return super.getHyperlinkByID(id);
    }

    @Override
    public XWPFFootnote getFootnoteByID(int id) {
        return super.getFootnoteByID(id);
    }

    @Override
    public XWPFEndnote getEndnoteByID(int id) {
        return super.getEndnoteByID(id);
    }

    @Override
    public List<XWPFFootnote> getFootnotes() {
        return super.getFootnotes();
    }

    @Override
    public XWPFHyperlink[] getHyperlinks() {
        return super.getHyperlinks();
    }

    @Override
    public XWPFComment getCommentByID(String id) {
        return super.getCommentByID(id);
    }

    @Override
    public XWPFComment[] getComments() {
        return super.getComments();
    }

    @Override
    public PackagePart getPartById(String id) {
        return super.getPartById(id);
    }

    @Override
    public XWPFHeaderFooterPolicy getHeaderFooterPolicy() {
        return super.getHeaderFooterPolicy();
    }

    @Override
    public XWPFHeaderFooterPolicy createHeaderFooterPolicy() {
        return super.createHeaderFooterPolicy();
    }

    @Override
    public XWPFHeader createHeader(HeaderFooterType type) {
        return super.createHeader(type);
    }

    @Override
    public XWPFFooter createFooter(HeaderFooterType type) {
        return super.createFooter(type);
    }

    @Override
    public CTStyles getStyle() throws XmlException, IOException {
        return super.getStyle();
    }

    @Override
    public List<PackagePart> getAllEmbeddedParts() throws OpenXML4JException {
        return super.getAllEmbeddedParts();
    }

    @Override
    public int getParagraphPos(int pos) {
        return super.getParagraphPos(pos);
    }

    @Override
    public int getTablePos(int pos) {
        return super.getTablePos(pos);
    }

    @Override
    public XWPFParagraph insertNewParagraph(XmlCursor cursor) {
        return super.insertNewParagraph(cursor);
    }

    @Override
    public XWPFTable insertNewTbl(XmlCursor cursor) {
        return super.insertNewTbl(cursor);
    }

    @Override
    public int getPosOfParagraph(XWPFParagraph p) {
        return super.getPosOfParagraph(p);
    }

    @Override
    public int getPosOfTable(XWPFTable t) {
        return super.getPosOfTable(t);
    }

    @Override
    protected void commit() throws IOException {
        super.commit();
    }

    @Override
    public XWPFParagraph createParagraph() {
        return super.createParagraph();
    }

    @Override
    public XWPFNumbering createNumbering() {
        return super.createNumbering();
    }

    @Override
    public XWPFStyles createStyles() {
        return super.createStyles();
    }

    @Override
    public XWPFFootnotes createFootnotes() {
        return super.createFootnotes();
    }

    @Override
    public XWPFFootnote addFootnote(CTFtnEdn note) {
        return super.addFootnote(note);
    }

    @Override
    public XWPFEndnote addEndnote(CTFtnEdn note) {
        return super.addEndnote(note);
    }

    @Override
    public boolean removeBodyElement(int pos) {
        return super.removeBodyElement(pos);
    }

    @Override
    public void setParagraph(XWPFParagraph paragraph, int pos) {
        super.setParagraph(paragraph, pos);
    }

    @Override
    public XWPFParagraph getLastParagraph() {
        return super.getLastParagraph();
    }

    @Override
    public XWPFTable createTable() {
        return super.createTable();
    }

    @Override
    public XWPFTable createTable(int rows, int cols) {
        return super.createTable(rows, cols);
    }

    @Override
    public void createTOC() {
        super.createTOC();
    }

    @Override
    public void setTable(int pos, XWPFTable table) {
        super.setTable(pos, table);
    }

    @Override
    public boolean isEnforcedProtection() {
        return super.isEnforcedProtection();
    }

    @Override
    public boolean isEnforcedReadonlyProtection() {
        return super.isEnforcedReadonlyProtection();
    }

    @Override
    public boolean isEnforcedFillingFormsProtection() {
        return super.isEnforcedFillingFormsProtection();
    }

    @Override
    public boolean isEnforcedCommentsProtection() {
        return super.isEnforcedCommentsProtection();
    }

    @Override
    public boolean isEnforcedTrackedChangesProtection() {
        return super.isEnforcedTrackedChangesProtection();
    }

    @Override
    public boolean isEnforcedUpdateFields() {
        return super.isEnforcedUpdateFields();
    }

    @Override
    public void enforceReadonlyProtection() {
        super.enforceReadonlyProtection();
    }

    @Override
    public void enforceReadonlyProtection(String password, HashAlgorithm hashAlgo) {
        super.enforceReadonlyProtection(password, hashAlgo);
    }

    @Override
    public void enforceFillingFormsProtection() {
        super.enforceFillingFormsProtection();
    }

    @Override
    public void enforceFillingFormsProtection(String password, HashAlgorithm hashAlgo) {
        super.enforceFillingFormsProtection(password, hashAlgo);
    }

    @Override
    public void enforceCommentsProtection() {
        super.enforceCommentsProtection();
    }

    @Override
    public void enforceCommentsProtection(String password, HashAlgorithm hashAlgo) {
        super.enforceCommentsProtection(password, hashAlgo);
    }

    @Override
    public void enforceTrackedChangesProtection() {
        super.enforceTrackedChangesProtection();
    }

    @Override
    public void enforceTrackedChangesProtection(String password, HashAlgorithm hashAlgo) {
        super.enforceTrackedChangesProtection(password, hashAlgo);
    }

    @Override
    public boolean validateProtectionPassword(String password) {
        return super.validateProtectionPassword(password);
    }

    @Override
    public void removeProtectionEnforcement() {
        super.removeProtectionEnforcement();
    }

    @Override
    public void enforceUpdateFields() {
        super.enforceUpdateFields();
    }

    @Override
    public boolean isTrackRevisions() {
        return super.isTrackRevisions();
    }

    @Override
    public void setTrackRevisions(boolean enable) {
        super.setTrackRevisions(enable);
    }

    @Override
    public long getZoomPercent() {
        return super.getZoomPercent();
    }

    @Override
    public void setZoomPercent(long zoomPercent) {
        super.setZoomPercent(zoomPercent);
    }

    @Override
    public boolean getEvenAndOddHeadings() {
        return super.getEvenAndOddHeadings();
    }

    @Override
    public void setEvenAndOddHeadings(boolean enable) {
        super.setEvenAndOddHeadings(enable);
    }

    @Override
    public boolean getMirrorMargins() {
        return super.getMirrorMargins();
    }

    @Override
    public void setMirrorMargins(boolean enable) {
        super.setMirrorMargins(enable);
    }

    @Override
    public void insertTable(int pos, XWPFTable table) {
        super.insertTable(pos, table);
    }

    @Override
    public List<XWPFPictureData> getAllPictures() {
        return super.getAllPictures();
    }

    @Override
    public List<XWPFPictureData> getAllPackagePictures() {
        return super.getAllPackagePictures();
    }

    @Override
    public String addPictureData(byte[] pictureData, int format) throws InvalidFormatException {
        return super.addPictureData(pictureData, format);
    }

    @Override
    public String addPictureData(InputStream is, int format) throws InvalidFormatException {
        return super.addPictureData(is, format);
    }

    @Override
    public int getNextPicNameNumber(int format) throws InvalidFormatException {
        return super.getNextPicNameNumber(format);
    }

    @Override
    public XWPFPictureData getPictureDataByID(String blipID) {
        return super.getPictureDataByID(blipID);
    }

    @Override
    public XWPFNumbering getNumbering() {
        return super.getNumbering();
    }

    @Override
    public XWPFStyles getStyles() {
        return super.getStyles();
    }

    @Override
    public XWPFParagraph getParagraph(CTP p) {
        return super.getParagraph(p);
    }

    @Override
    public XWPFTable getTable(CTTbl ctTbl) {
        return super.getTable(ctTbl);
    }

    @Override
    public Iterator<XWPFTable> getTablesIterator() {
        return super.getTablesIterator();
    }

    @Override
    public Iterator<XWPFParagraph> getParagraphsIterator() {
        return super.getParagraphsIterator();
    }

    @Override
    public XWPFParagraph getParagraphArray(int pos) {
        return super.getParagraphArray(pos);
    }

    @Override
    public POIXMLDocumentPart getPart() {
        return super.getPart();
    }

    @Override
    public BodyType getPartType() {
        return super.getPartType();
    }

    @Override
    public XWPFTableCell getTableCell(CTTc cell) {
        return super.getTableCell(cell);
    }

    @Override
    public XWPFDocument getXWPFDocument() {
        return super.getXWPFDocument();
    }

    @Override
    public XWPFChart createChart() throws InvalidFormatException, IOException {
        return super.createChart();
    }

    @Override
    public XWPFChart createChart(int width, int height) throws InvalidFormatException, IOException {
        return super.createChart(width, height);
    }

    @Override
    public XWPFChart createChart(XWPFRun run, int width, int height) throws InvalidFormatException, IOException {
        return super.createChart(run, width, height);
    }

    @Override
    public XWPFFootnote createFootnote() {
        return super.createFootnote();
    }

    @Override
    public boolean removeFootnote(int pos) {
        return super.removeFootnote(pos);
    }

    @Override
    public XWPFEndnote createEndnote() {
        return super.createEndnote();
    }

    @Override
    public XWPFEndnotes createEndnotes() {
        return super.createEndnotes();
    }

    @Override
    public List<XWPFEndnote> getEndnotes() {
        return super.getEndnotes();
    }

    @Override
    public boolean removeEndnote(int pos) {
        return super.removeEndnote(pos);
    }

    @Override
    public OPCPackage getPackage() {
        return super.getPackage();
    }

    @Override
    protected PackagePart getCorePart() {
        return super.getCorePart();
    }

    @Override
    protected PackagePart[] getRelatedByType(String contentType) throws InvalidFormatException {
        return super.getRelatedByType(contentType);
    }

    @Override
    public POIXMLProperties getProperties() {
        return super.getProperties();
    }

    /**
     * @deprecated
     */
    @Override
    public List<PackagePart> getAllEmbedds() throws OpenXML4JException {
        return super.getAllEmbedds();
    }

    @Override
    public void close() throws IOException {
        super.close();
    }

    /**
     * @deprecated
     */
    @Override
    public boolean isCommited() {
        return super.isCommited();
    }

    @Override
    public boolean isCommitted() {
        return super.isCommitted();
    }

    /**
     * @param isCommitted
     * @deprecated
     */
    @Override
    public void setCommited(boolean isCommitted) {
        super.setCommited(isCommitted);
    }

    @Override
    public void setCommitted(boolean isCommitted) {
        super.setCommitted(isCommitted);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void prepareForCommit() {
        super.prepareForCommit();
    }

    @Override
    protected void read(POIXMLFactory factory, Map<PackagePart, POIXMLDocumentPart> context) throws OpenXML4JException {
        super.read(factory, context);
    }

    @Override
    protected PackagePart getTargetPart(PackageRelationship rel) throws InvalidFormatException {
        return super.getTargetPart(rel);
    }

    @Override
    protected void onDocumentRemove() throws IOException {
        super.onDocumentRemove();
    }

    /**
     * Returns a hash code value for the object. This method is
     * supported for the benefit of hash tables such as those provided by
     * {@link HashMap}.
     * <p>
     * The general contract of {@code hashCode} is:
     * <ul>
     * <li>Whenever it is invoked on the same object more than once during
     *     an execution of a Java application, the {@code hashCode} method
     *     must consistently return the same integer, provided no information
     *     used in {@code equals} comparisons on the object is modified.
     *     This integer need not remain consistent from one execution of an
     *     application to another execution of the same application.
     * <li>If two objects are equal according to the {@code equals(Object)}
     *     method, then calling the {@code hashCode} method on each of
     *     the two objects must produce the same integer result.
     * <li>It is <em>not</em> required that if two objects are unequal
     *     according to the {@link Object#equals(Object)}
     *     method, then calling the {@code hashCode} method on each of the
     *     two objects must produce distinct integer results.  However, the
     *     programmer should be aware that producing distinct integer results
     *     for unequal objects may improve the performance of hash tables.
     * </ul>
     * <p>
     * As much as is reasonably practical, the hashCode method defined by
     * class {@code Object} does return distinct integers for distinct
     * objects. (This is typically implemented by converting the internal
     * address of the object into an integer, but this implementation
     * technique is not required by the
     * Java&trade; programming language.)
     *
     * @return a hash code value for this object.
     * @see Object#equals(Object)
     * @see System#identityHashCode
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * The {@code equals} method implements an equivalence relation
     * on non-null object references:
     * <ul>
     * <li>It is <i>reflexive</i>: for any non-null reference value
     *     {@code x}, {@code x.equals(x)} should return
     *     {@code true}.
     * <li>It is <i>symmetric</i>: for any non-null reference values
     *     {@code x} and {@code y}, {@code x.equals(y)}
     *     should return {@code true} if and only if
     *     {@code y.equals(x)} returns {@code true}.
     * <li>It is <i>transitive</i>: for any non-null reference values
     *     {@code x}, {@code y}, and {@code z}, if
     *     {@code x.equals(y)} returns {@code true} and
     *     {@code y.equals(z)} returns {@code true}, then
     *     {@code x.equals(z)} should return {@code true}.
     * <li>It is <i>consistent</i>: for any non-null reference values
     *     {@code x} and {@code y}, multiple invocations of
     *     {@code x.equals(y)} consistently return {@code true}
     *     or consistently return {@code false}, provided no
     *     information used in {@code equals} comparisons on the
     *     objects is modified.
     * <li>For any non-null reference value {@code x},
     *     {@code x.equals(null)} should return {@code false}.
     * </ul>
     * <p>
     * The {@code equals} method for class {@code Object} implements
     * the most discriminating possible equivalence relation on objects;
     * that is, for any non-null reference values {@code x} and
     * {@code y}, this method returns {@code true} if and only
     * if {@code x} and {@code y} refer to the same object
     * ({@code x == y} has the value {@code true}).
     * <p>
     * Note that it is generally necessary to override the {@code hashCode}
     * method whenever this method is overridden, so as to maintain the
     * general contract for the {@code hashCode} method, which states
     * that equal objects must have equal hash codes.
     *
     * @param obj the reference object with which to compare.
     * @return {@code true} if this object is the same as the obj
     * argument; {@code false} otherwise.
     * @see #hashCode()
     * @see HashMap
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * Creates and returns a copy of this object.  The precise meaning
     * of "copy" may depend on the class of the object. The general
     * intent is that, for any object {@code x}, the expression:
     * <blockquote>
     * <pre>
     * x.clone() != x</pre></blockquote>
     * will be true, and that the expression:
     * <blockquote>
     * <pre>
     * x.clone().getClass() == x.getClass()</pre></blockquote>
     * will be {@code true}, but these are not absolute requirements.
     * While it is typically the case that:
     * <blockquote>
     * <pre>
     * x.clone().equals(x)</pre></blockquote>
     * will be {@code true}, this is not an absolute requirement.
     * <p>
     * By convention, the returned object should be obtained by calling
     * {@code super.clone}.  If a class and all of its superclasses (except
     * {@code Object}) obey this convention, it will be the case that
     * {@code x.clone().getClass() == x.getClass()}.
     * <p>
     * By convention, the object returned by this method should be independent
     * of this object (which is being cloned).  To achieve this independence,
     * it may be necessary to modify one or more fields of the object returned
     * by {@code super.clone} before returning it.  Typically, this means
     * copying any mutable objects that comprise the internal "deep structure"
     * of the object being cloned and replacing the references to these
     * objects with references to the copies.  If a class contains only
     * primitive fields or references to immutable objects, then it is usually
     * the case that no fields in the object returned by {@code super.clone}
     * need to be modified.
     * <p>
     * The method {@code clone} for class {@code Object} performs a
     * specific cloning operation. First, if the class of this object does
     * not implement the interface {@code Cloneable}, then a
     * {@code CloneNotSupportedException} is thrown. Note that all arrays
     * are considered to implement the interface {@code Cloneable} and that
     * the return type of the {@code clone} method of an array type {@code T[]}
     * is {@code T[]} where T is any reference or primitive type.
     * Otherwise, this method creates a new instance of the class of this
     * object and initializes all its fields with exactly the contents of
     * the corresponding fields of this object, as if by assignment; the
     * contents of the fields are not themselves cloned. Thus, this method
     * performs a "shallow copy" of this object, not a "deep copy" operation.
     * <p>
     * The class {@code Object} does not itself implement the interface
     * {@code Cloneable}, so calling the {@code clone} method on an object
     * whose class is {@code Object} will result in throwing an
     * exception at run time.
     *
     * @return a clone of this instance.
     * @throws CloneNotSupportedException if the object's class does not
     *                                    support the {@code Cloneable} interface. Subclasses
     *                                    that override the {@code clone} method can also
     *                                    throw this exception to indicate that an instance cannot
     *                                    be cloned.
     * @see Cloneable
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * Called by the garbage collector on an object when garbage collection
     * determines that there are no more references to the object.
     * A subclass overrides the {@code finalize} method to dispose of
     * system resources or to perform other cleanup.
     * <p>
     * The general contract of {@code finalize} is that it is invoked
     * if and when the Java&trade; virtual
     * machine has determined that there is no longer any
     * means by which this object can be accessed by any thread that has
     * not yet died, except as a result of an action taken by the
     * finalization of some other object or class which is ready to be
     * finalized. The {@code finalize} method may take any action, including
     * making this object available again to other threads; the usual purpose
     * of {@code finalize}, however, is to perform cleanup actions before
     * the object is irrevocably discarded. For example, the finalize method
     * for an object that represents an input/output connection might perform
     * explicit I/O transactions to break the connection before the object is
     * permanently discarded.
     * <p>
     * The {@code finalize} method of class {@code Object} performs no
     * special action; it simply returns normally. Subclasses of
     * {@code Object} may override this definition.
     * <p>
     * The Java programming language does not guarantee which thread will
     * invoke the {@code finalize} method for any given object. It is
     * guaranteed, however, that the thread that invokes finalize will not
     * be holding any user-visible synchronization locks when finalize is
     * invoked. If an uncaught exception is thrown by the finalize method,
     * the exception is ignored and finalization of that object terminates.
     * <p>
     * After the {@code finalize} method has been invoked for an object, no
     * further action is taken until the Java virtual machine has again
     * determined that there is no longer any means by which this object can
     * be accessed by any thread that has not yet died, including possible
     * actions by other objects or classes which are ready to be finalized,
     * at which point the object may be discarded.
     * <p>
     * The {@code finalize} method is never invoked more than once by a Java
     * virtual machine for any given object.
     * <p>
     * Any exception thrown by the {@code finalize} method causes
     * the finalization of this object to be halted, but is otherwise
     * ignored.
     *
     * @throws Throwable the {@code Exception} raised by this method
     * @jls 12.6 Finalization of Class Instances
     * @see WeakReference
     * @see PhantomReference
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public wq(OPCPackage pkg) throws IOException {
        super(pkg);
    }

    public wq(InputStream is) throws IOException {
        super(is);
    }

    public wq() {
    }

}
