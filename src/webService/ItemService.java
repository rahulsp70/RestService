package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.itemList;
import model.AccessManager;


@Path("/itemService")
public class ItemService {
	@GET
	@Path("/items")
	@Produces("/application/json")
	public String items() {
		String items = null;
		ArrayList<itemList> itemlist = new ArrayList<itemList>();
		try {
			itemlist = new AccessManager().getList();
			Gson gson =  new Gson();
			items = gson.toJson(itemlist);
			}catch (Exception e)
		{
				e.printStackTrace();
				}
		return items;
	}

}
