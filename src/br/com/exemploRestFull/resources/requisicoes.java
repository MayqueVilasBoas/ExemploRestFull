package br.com.exemploRestFull.resources;

import javax.ws.rs.*;

@Path("/exemplo")
public class requisicoes {

	@Path("/mostrarMsg")
	@GET
	@Produces("text/plain")
	public String mostrarMensagem(){
		return "Retorno da mensagem!";
	}
}
