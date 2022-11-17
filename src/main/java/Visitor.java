public interface Visitor {
    void visitBook(Book book);
    void visitSection(Section sect);
    void visitTableOfContents(TableOfContents toc);
    void visitParagraph(Paragraph para);
    void visitImageProxy(ImageProxy imgPrx);
    void visitImage(Image img);
    void visitTable(Table tbl);

}
