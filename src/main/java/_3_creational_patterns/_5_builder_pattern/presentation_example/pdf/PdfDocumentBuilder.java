package _3_creational_patterns._5_builder_pattern.presentation_example.pdf;

import _3_creational_patterns._5_builder_pattern.presentation_example.PresentationBuilder;
import _3_creational_patterns._5_builder_pattern.presentation_example.Slide;

public class PdfDocumentBuilder implements PresentationBuilder {
    private final PdfDocument document = new PdfDocument();

    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.getText());
    }

    public PdfDocument getPdfDocument() {
        return document;
    }
}
