package br.com.pradella.api;

import static spark.Spark.post;

import com.google.gson.Gson;

import br.com.pradella.JsonTransformer;
import br.com.pradella.domain.Perfil;
import spark.Request;

public class StartApi {

	public static void main(String[] args) {
	
		post("/", (req, rsp) -> {
			rsp.type("application/json");
			rsp.status(202);

			Perfil perfil = perfil(req);
			return perfil;
		}, new JsonTransformer());
	
	
	
	}

	
	
	
	
	
	
	
	
	
	private static Perfil perfil(Request req) {
		return new Gson().fromJson(req.body(), Perfil.class);
	}

}
