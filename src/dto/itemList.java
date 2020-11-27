package dto;

public class itemList {
private int item_id;
private String item_name;
private String item_price;
private String item_quantity;

public itemList() {
	
}
public itemList(int item_id,String item_name,String item_price,String item_quantity) {
super();
this.item_id=item_id;
this.item_name=item_name;
this.item_price=item_price;
this.item_quantity=item_quantity;
}
public int getitemId() {
	return item_id;
}
public void setitemId(int item_id) {
	this.item_id=item_id;
}
public String getitemName() {
	return item_name;
}
public void setitemName(String item_name) {
	this.item_name=item_name;
}
public String getitemPrice() {
	return item_price;
}
public void setitemPrice(String item_price) {
	this.item_price=item_price;
}
public String getitemQuantity() {
	return item_quantity;
}
public void setitemQuantity(String item_quantity) {
	this.item_quantity=item_quantity;
}

@Override
public String toString()
{
	return "Item[id=" + item_id +", ItemName=" + item_name+", ItemQuantity=" +item_quantity+"]";
}

}
