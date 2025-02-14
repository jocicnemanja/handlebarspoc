package com.example.handlebarspoc.controller;

import com.example.handlebarspoc.pdf.PDFGeneratorService;
import org.springframework.stereotype.Controller;

@Controller
public class PDFController {

    private final PDFGeneratorService pdfGeneratorService;

    public PDFController(PDFGeneratorService pdfGeneratorService) {
        this.pdfGeneratorService = pdfGeneratorService;
    }

//    @GetMapping("/download-pdf")
//    public ResponseEntity<byte[]> downloadPdf() {
//
//        byte[] pdf = pdfGeneratorService.generatePdf("contractForDownload", MockContractDataForPDF.PARAMS);
//
//        return ResponseEntity.ok()
//             .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=contract.pdf")
//             .contentType(MediaType.APPLICATION_PDF)
//             .body(pdf);
//    }
}
