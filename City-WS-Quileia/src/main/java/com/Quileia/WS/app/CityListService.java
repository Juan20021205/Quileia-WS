package com.Quileia.WS.app;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.Quileia.WS.app.response.CityResponse;

@WebService
public interface CityListService {

	@WebMethod(operationName = "getCitys")
	@WebResult(name = "ResultOperation")List<CityResponse> getCitys();
}
