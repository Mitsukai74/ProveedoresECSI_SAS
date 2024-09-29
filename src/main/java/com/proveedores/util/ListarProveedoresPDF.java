package com.proveedores.util;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.proveedores.models.ProvReembolsos;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("provReembolsos/busquedas")
public class ListarProveedoresPDF extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		@SuppressWarnings("unchecked")
		List<ProvReembolsos> listadoProveedores = (List<ProvReembolsos>) model.get("provreemb");
		PdfPTable tablaProv = new PdfPTable(10);
		
		listadoProveedores.forEach(prov ->{
			tablaProv.addCell(prov.getNit().toString());
			tablaProv.addCell(prov.getCod_ver().toString());
			tablaProv.addCell(prov.getCod_ecsi().toString());
			tablaProv.addCell(prov.getRazon());
			tablaProv.addCell(prov.getDireccion());
			tablaProv.addCell(prov.getTelefono().toString());
			tablaProv.addCell(prov.getCorreo());
			tablaProv.addCell(prov.getCod_mun());
			tablaProv.addCell(prov.getCod_depto());
			tablaProv.addCell(prov.getCiiu().toString());
		});
		document.add(tablaProv);
	}

}
