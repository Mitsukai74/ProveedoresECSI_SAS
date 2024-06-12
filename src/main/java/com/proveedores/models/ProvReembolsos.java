package com.proveedores.models;

import java.io.Serializable;

import org.springframework.lang.NonNull;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prov_reembolsos")
public class ProvReembolsos implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_provreem;
	@Nonnull
	private int nit;
	@Nonnull
	private int cod_ver;
	@Nonnull
	private int cod_ecsi;
	private String razon;
	private String direccion;
	private Long telefono;	
	private String correo;
	private String cod_mun;
	private String cod_depto;
	private int ciiu;
	
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
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	public int getCod_ver() {
		return cod_ver;
	}
	public void setCod_ver(int cod_ver) {
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
	public int getCiiu() {
		return ciiu;
	}
	public void setCiiu(int ciiu) {
		this.ciiu = ciiu;
	}
	public int getCod_ecsi() {
		return cod_ecsi;
	}
	public void setCod_ecsi(int cod_ecsi) {
		this.cod_ecsi = cod_ecsi;
	}

}
