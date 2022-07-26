package com.Quileia.WS.app;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.Quileia.WS.app.response.CityResponse;

@WebService(endpointInterface = "com.Quileia.WS.app.CityListService")
public class CityListServiceImpl implements CityListService{
	@Override
	public List<CityResponse> getCitys() {
		
		List<CityResponse> resp = new ArrayList<>();
		CityResponse city1, city2, city3, city4, city5;
		
		city1 = new CityResponse("Bogota","Hilton","Monserrate",5000);
		city2 = new CityResponse("Bucaramanga","Tequendama","Candelaria",800000);
		city3 = new CityResponse("Medellin","Hilton","Museo de Botero",50000000);
		city4 = new CityResponse("Cucuta","Trivago","Movistar Arena",7000000);
		city5 = new CityResponse("Berlin","Hilton","Distrito Grafitty",2000000);
		
		resp.add(city1);
		resp.add(city2);
		resp.add(city3);
		resp.add(city4);
		resp.add(city5);
		
		return resp;
	}

	
}
