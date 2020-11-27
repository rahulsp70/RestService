package model;

import java.sql.Connection;
import java.util.ArrayList;

import dto.itemList;
import rest.Access;
import rest.Database;

public class AccessManager {
	public ArrayList<itemList> getList() throws Exception{
		ArrayList<itemList> itemlist = new ArrayList<itemList>();
		Database db= new Database();
		Connection con =  db.getConnection();
		Access access = new Access();
		itemlist = access.getList(con);
		return itemlist;
	}

}
