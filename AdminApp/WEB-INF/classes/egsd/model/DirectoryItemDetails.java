package egsd.model;

import java.util.List;


public class DirectoryItemDetails {
	
	
	private String title;
	private Object[] menuData;
	
	public String getTitle() {
		return title;
	}
	
	public Object[] getMenuData() {
		return menuData;
	}

	public void setMenuData(Object[] menuData) {
		this.menuData = menuData;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
