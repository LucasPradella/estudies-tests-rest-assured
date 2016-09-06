package br.com.pradella.api;

import static spark.Spark.post;




import br.com.pradella.JsonTransformer;

public class StartApi {


	
	public static void main(String[] args) {
		post("/", (req, rsp) -> {
			rsp.type("application/json");
			return null;
		}, new JsonTransformer());
	}
}
