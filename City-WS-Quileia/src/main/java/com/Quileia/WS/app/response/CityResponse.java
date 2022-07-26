package com.Quileia.WS.app.response;

import java.io.Serializable;

public class CityResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String Nombre;
	private String SitioMasTuristico;
	private String HotelMasReservado;
	private int CantHabitantes;
	
	public CityResponse() {}
	
	public CityResponse(String nombre, String sitioMasTuristico,
			String hotelMasReservado, int cantHabitantes) {
		super();
		Nombre = nombre;
		SitioMasTuristico = sitioMasTuristico;
		HotelMasReservado = hotelMasReservado;
		CantHabitantes = cantHabitantes;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getSitioMasTuristico() {
		return SitioMasTuristico;
	}

	public void setSitioMasTuristico(String sitioMasTuristico) {
		SitioMasTuristico = sitioMasTuristico;
	}

	public String getHotelMasReservado() {
		return HotelMasReservado;
	}

	public void setHotelMasReservado(String hotelMasReservado) {
		HotelMasReservado = hotelMasReservado;
	}

	public int getCantHabitantes() {
		return CantHabitantes;
	}

	public void setCantHabitantes(int cantHabitantes) {
		CantHabitantes = cantHabitantes;
	}

}
