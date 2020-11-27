package rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.itemList;

public class Access {   
	public ArrayList<itemList> getList(Connection con) throws SQLException{
		ArrayList<itemList> itemlist = new ArrayList<itemList>();
		PreparedStatement st = con.prepareStatement("select * from item");
		ResultSet rs = st.executeQuery();
		try
		{
		while(rs.next())
		{
			itemList il= new itemList();
			il.setitemId(rs.getInt("item_id"));
			 il.setitemName(rs.getString("item_name"));
			 il.setitemPrice(rs.getString("item_price"));
			 il.setitemQuantity(rs.getString("item_quantity"));
			 itemlist.add(il);
		}
	}
		catch (SQLException e)
		{
		e.printStackTrace();
		}
		return itemlist;
	}
}
