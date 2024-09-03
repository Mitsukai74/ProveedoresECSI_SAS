package com.proveedores.models;

import java.io.Serializable;


import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="prov_reembolsos")
public class ProvReembolsos implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_provreem;
	
	@NotNull(message="El número del NIT es obligatorio")
	private Integer nit;
	@NotNull
	private Integer cod_ver;
	@NotNull
	private Integer cod_ecsi;
	@NotEmpty
	private String razon;
	@NotEmpty
	private String direccion;
	@NotNull
	private Long telefono;
	@Email
	private String correo;
	@NotEmpty
	private String cod_mun;
	@NotEmpty
	private String cod_depto;
	@NotNull
	private Integer ciiu;
	
	public int getId_provreem() {
		return id_provreem;
	}
	@Override
	public String toString() {
		return "ProvReembolsos [id_provreem=" + id_provreem + ", nit=" + nit + ", cod_ver=" + cod_ver + ", cod_ecsi="
				+ cod_ecsi + ", razon=" + razon + ", direccion=" + direccion + ", telefono=" + telefono + ", correo="
				+ correo + ", cod_mun=" + cod_mun + ", cod_depto=" + cod_depto + ", ciiu=" + ciiu + "]";
	}
	public void setId_provreem(int id_provreem) {
		this.id_provreem = id_provreem;
	}
	public Integer getNit() {
		return nit;
	}
	public void setNit(Integer nit) {
		this.nit = nit;
	}
	public Integer getCod_ver() {
		return cod_ver;
	}
	public void setCod_ver(Integer cod_ver) {
		this.cod_ver = cod_ver;
	}
	public String getRazon() {
		return razon;
	}
	public void setRazon(String razon) {
		this.razon = razon;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCod_mun() {
		return cod_mun;
	}
	public void setCod_mun(String cod_mun) {
		this.cod_mun = cod_mun;
	}
	public String getCod_depto() {
		return cod_depto;
	}
	public void setCod_depto(String cod_depto) {
		this.cod_depto = cod_depto;
	}
	public Integer getCiiu() {
		return ciiu;
	}
	public void setCiiu(Integer ciiu) {
		this.ciiu = ciiu;
	}
	public Integer getCod_ecsi() {
		return cod_ecsi;
	}
	public void setCod_ecsi(Integer cod_ecsi) {
		this.cod_ecsi = cod_ecsi;
	}

}
