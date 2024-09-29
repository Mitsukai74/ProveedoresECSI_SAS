package com.proveedores.util;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.proveedores.models.ProvReembolsos;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("/provReembolsos/listarProvReembolsos")
public class ListarProveedoresExcel extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//Creando el archivo con la respectiva ruta	
		response.setHeader("Content-Disposition", "attachment; filename=\"listado_prov.xls\"");
		response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		//Creando la hoja de cálculo
		Sheet hoja = workbook.createSheet("Provedores");
		//Creando la fila con los títulos de la información
		Row filaTitulo = hoja.createRow(0);
		Cell celda = filaTitulo.createCell(0);
		celda.setCellValue("Listado de proveedores");
		//Llenando la fila con los encabezados
		Row filaData = hoja.createRow(2);
		String[] columnas = {"NIT","Verif","Código ECSI","Razón social","Dirección","Teléfono","Correo","Código de mun",
				"Código de depto","Actividad económica"};
		
		for(int i = 0;i<columnas.length;i++){
			celda = filaData.createCell(i);
			celda.setCellValue(columnas[i]);
		}
		
		List<ProvReembolsos> listaR =(List<ProvReembolsos>) model.get("provreemb");	
		
		int numFila = 3;
		for(ProvReembolsos proveedor : listaR) {
			filaData = hoja.createRow(numFila);
			
			filaData.createCell(0).setCellValue(proveedor.getNit());
			filaData.createCell(1).setCellValue(proveedor.getCod_ver());
			filaData.createCell(2).setCellValue(proveedor.getCod_ecsi());
			filaData.createCell(3).setCellValue(proveedor.getRazon());
			filaData.createCell(4).setCellValue(proveedor.getDireccion());
			filaData.createCell(5).setCellValue(proveedor.getTelefono());
			filaData.createCell(6).setCellValue(proveedor.getCorreo());
			filaData.createCell(7).setCellValue(proveedor.getCod_mun());
			filaData.createCell(8).setCellValue(proveedor.getCod_depto());
			filaData.createCell(9).setCellValue(proveedor.getCiiu());
			
			numFila++;
		}
		
	}

}
