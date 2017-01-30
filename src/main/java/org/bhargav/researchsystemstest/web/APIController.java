package org.bhargav.researchsystemstest.web;

import org.bhargav.researchsystemstest.dto.Data;
import org.bhargav.researchsystemstest.util.JSONReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api")
public class APIController {

	
	@RequestMapping(value = "tradeslist", method = RequestMethod.GET)
	public @ResponseBody Data getTradesData() {
		
		Data fileData = JSONReader.getTradeDatafromJsonFile();
		return fileData;
	}
}
