package com.example.handlebarspoc.pdf;

import org.springframework.stereotype.Service;

@Service
public class PDFGeneratorService {

//    private final TemplateEngine templateEngine;
//
//    public PDFGeneratorService(TemplateEngine templateEngine) {
//        this.templateEngine = templateEngine;
//    }
//
//    public byte[] generatePdf(String templateName, Map<String, Object> data) {
//        Context context = new Context();
//        context.setVariables(data);
//
//        String htmlContent = templateEngine.process(templateName, context);
//
//        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
//            PdfRendererBuilder builder = new PdfRendererBuilder();
//            builder.useFastMode();
//            builder.withHtmlContent(htmlContent, "file:///");
//            builder.toStream(outputStream);
//            builder.run();
//
//            return outputStream.toByteArray();
//        } catch (Exception e) {
//            throw new RuntimeException("Error generating PDF", e);
//        }
//    }
}
