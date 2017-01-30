package org.bhargav.researchsystemstest;

import java.io.FileNotFoundException;

import org.bhargav.researchsystemstest.util.JSONReader;
import org.json.JSONException;

public class Test {

	public static void main(String[] args) throws JSONException, FileNotFoundException {
		System.out.println(JSONReader.getJSONObject());
	}
}
