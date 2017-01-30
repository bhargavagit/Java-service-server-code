package org.bhargav.researchsystemstest.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.bhargav.researchsystemstest.dto.Data;
import org.bhargav.researchsystemstest.dto.Trade;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONReader {

	public static JSONObject getJSONObject() throws JSONException, FileNotFoundException {
		JSONTokener tokener = new JSONTokener(new FileInputStream(new File(Constant.TRADES_DATA_FILE_NAME)));
		return new JSONObject(tokener);
	}
	
	public static Data getTradeDatafromJsonFile() {

		Data data = new Data();
		List<Trade> tradesList = new ArrayList<Trade>();
		try {
			JSONObject root = getJSONObject();
			JSONArray tradesJson = root.getJSONArray("trades");
			for(int i=0; i<tradesJson.length(); i++) {
				JSONObject tradeJson = tradesJson.getJSONObject(i);
				Trade trade = new Trade();
				trade.setTransactionId(tradeJson.getLong("TxnId"));
				trade.setSymbol(tradeJson.getString("Symbol"));
				trade.setAction(tradeJson.getString("Action"));
				trade.setQuantity(tradeJson.getLong("Quantity"));
				trade.setPrice(tradeJson.getDouble("Price"));
				trade.setMarketValue(tradeJson.getDouble("MarketValue"));
				
				tradesList.add(trade);
			}
			data.setTrades(tradesList);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return data;
	}
}
