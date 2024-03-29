package com.aplikasi.backend.AplikasiBackend.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

@Table(name="siswa")
public class Siswa {
	@Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	@NotNull @NotEmpty
	private String nis;
	@NotNull @NotEmpty
	private String nama;
	@NotNull @NotEmpty
	private String alamat;
	@NotNull @NotEmpty
	private String jenisKelamin;
	private Kelas kelas;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNis() {
		return nis;
	}
	public void setNis(String nis) {
		this.nis = nis;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public Kelas getKelas() {
		return kelas;
	}
	public void setKelas(Kelas kelas) {
		this.kelas = kelas;
	}
	
	
}
