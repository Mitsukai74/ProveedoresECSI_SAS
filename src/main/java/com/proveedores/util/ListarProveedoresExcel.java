package com.proveedores.util;

import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("/provReembolsos/listarProvReembolsos")
public class ListarProveedoresExcel extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
		response.setHeader("Content-Disposition", "attachment; filename=\"listado_prov.xls\"");
		Sheet hoja = workbook.createSheet("Provedores");
		
	}

}
