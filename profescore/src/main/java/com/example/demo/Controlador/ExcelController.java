package com.example.demo.Controlador;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Servicios.ExcelService;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @GetMapping("/download-template")
    public ResponseEntity<byte[]> downloadTemplate() throws IOException {
        ClassPathResource resource = new ClassPathResource("plantilla.xlsx");

        byte[] data;
        try (InputStream is = resource.getInputStream()) {
            data = is.readAllBytes();
        }

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=plantilla.xlsx")
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(data);
    }

    @PostMapping("/upload-excel")
    public ResponseEntity<String> uploadExcel(@RequestParam("file") MultipartFile file) {
        try {
            // Validaciones
            if (file.isEmpty()) {
                return ResponseEntity.ok("El archivo está vacío.");
            }

            if (!file.getOriginalFilename().equals("plantilla.xlsx")) {
                return ResponseEntity.ok("Solo se acepta la plantilla proporcionada.");
            }

            if (!file.getContentType().equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet") &&
                !file.getContentType().equals("application/vnd.ms-excel")) {
                return ResponseEntity.ok("El archivo debe ser un Excel.");
            }

            String result = excelService.processExcel(file);

            if ("success".equals(result)) {
                return ResponseEntity.ok("success");
            } else {
                return ResponseEntity.ok(result);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok("Error al procesar el archivo.");
        }
    }
}
