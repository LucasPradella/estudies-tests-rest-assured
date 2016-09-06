package br.com.pradella.api;

import static spark.Spark.*;




import br.com.pradella.JsonTransformer;
import groovy.lang.Singleton;

public class StartApi {

	public static void main(String[] args) {
		get("/", (req, rsp) -> {
			rsp.type("application/json");
			return "retorno OK";
		}, new JsonTransformer());
	}
}
