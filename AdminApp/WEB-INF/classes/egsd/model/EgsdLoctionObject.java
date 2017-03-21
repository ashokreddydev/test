package egsd.model;

import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;
public class EgsdLoctionObject  {
	
	private String objectId;
	private boolean hotelStatus;
	public boolean isHotelStatus() {
		return hotelStatus;
	}


	public void setHotelStatus(boolean hotelStatus) {
		this.hotelStatus = hotelStatus;
	}
	private String directory;
	private String locationAdmin;
	private String locFirstName;
	private String locLastName;
	private String defaultTitleFontColor;
	private int footerImageSize;
	private int logoSize;
	private int hotelLogoSize;
	private int imageSize;
	private int totalImagesSize;
	public int getTotalImagesSize() {
		return totalImagesSize;
	}


	public void setTotalImagesSize(int totalImagesSize) {
		this.totalImagesSize = totalImagesSize;
	}


	public int getImageSize() {
		return imageSize;
	}


	public void setImageSize(int imageSize) {
		this.imageSize = imageSize;
	}


	public int getFooterImageSize() {
		return footerImageSize;
	}


	public void setFooterImageSize(int footerImageSize) {
		this.footerImageSize = footerImageSize;
	}


	public int getLogoSize() {
		return logoSize;
	}


	public void setLogoSize(int logoSize) {
		this.logoSize = logoSize;
	}


	public int getHotelLogoSize() {
		return hotelLogoSize;
	}


	public void setHotelLogoSize(int hotelLogoSize) {
		this.hotelLogoSize = hotelLogoSize;
	}
	private String defaultTitleFontSize;
	private String  defaultTitleFontFamily;
	
	private String defaultCaptionFontColor;
	private String defaultCaptionFontSize;
	private String  defaultCaptionFontFamily;
	
	private String defaultHoursFontColor;
	private String defaultHoursFontSize;
	private String  defaultHoursFontFamily;
	
	private String defaultMenuFontColor;
	private String defaultMenuFontSize;
	private String  defaultMenuFontFamily;
	
	private Boolean templateDetails;
	private Boolean addressDetails;
	
	private Boolean templateLogo;
	private Boolean templateImage;
	private Boolean templateFooter;
	private Boolean brandDetails;
	private Boolean footerDetails;
	
	


	public Boolean getTemplateDetails() {
		return templateDetails;
	}


	public void setTemplateDetails(Boolean templateDetails) {
		this.templateDetails = templateDetails;
	}


	public Boolean getAddressDetails() {
		return addressDetails;
	}


	public void setAddressDetails(Boolean addressDetails) {
		this.addressDetails = addressDetails;
	}


	public Boolean getTemplateLogo() {
		return templateLogo;
	}


	public void setTemplateLogo(Boolean templateLogo) {
		this.templateLogo = templateLogo;
	}


	public Boolean getTemplateImage() {
		return templateImage;
	}


	public void setTemplateImage(Boolean templateImage) {
		this.templateImage = templateImage;
	}


	public Boolean getTemplateFooter() {
		return templateFooter;
	}


	public void setTemplateFooter(Boolean templateFooter) {
		this.templateFooter = templateFooter;
	}


	public Boolean getBrandDetails() {
		return brandDetails;
	}


	public void setBrandDetails(Boolean brandDetails) {
		this.brandDetails = brandDetails;
	}


	public Boolean getFooterDetails() {
		return footerDetails;
	}


	public void setFooterDetails(Boolean footerDetails) {
		this.footerDetails = footerDetails;
	}


	public String getDefaultTitleFontColor() {
		return defaultTitleFontColor;
	}


	public void setDefaultTitleFontColor(String defaultTitleFontColor) {
		this.defaultTitleFontColor = defaultTitleFontColor;
	}


	public String getDefaultTitleFontSize() {
		return defaultTitleFontSize;
	}


	public void setDefaultTitleFontSize(String defaultTitleFontSize) {
		this.defaultTitleFontSize = defaultTitleFontSize;
	}


	public String getDefaultTitleFontFamily() {
		return defaultTitleFontFamily;
	}


	public void setDefaultTitleFontFamily(String defaultTitleFontFamily) {
		this.defaultTitleFontFamily = defaultTitleFontFamily;
	}


	public String getDefaultCaptionFontColor() {
		return defaultCaptionFontColor;
	}


	public void setDefaultCaptionFontColor(String defaultCaptionFontColor) {
		this.defaultCaptionFontColor = defaultCaptionFontColor;
	}


	public String getDefaultCaptionFontSize() {
		return defaultCaptionFontSize;
	}


	public void setDefaultCaptionFontSize(String defaultCaptionFontSize) {
		this.defaultCaptionFontSize = defaultCaptionFontSize;
	}


	public String getDefaultCaptionFontFamily() {
		return defaultCaptionFontFamily;
	}


	public void setDefaultCaptionFontFamily(String defaultCaptionFontFamily) {
		this.defaultCaptionFontFamily = defaultCaptionFontFamily;
	}


	public String getDefaultHoursFontColor() {
		return defaultHoursFontColor;
	}


	public void setDefaultHoursFontColor(String defaultHoursFontColor) {
		this.defaultHoursFontColor = defaultHoursFontColor;
	}


	public String getDefaultHoursFontSize() {
		return defaultHoursFontSize;
	}


	public void setDefaultHoursFontSize(String defaultHoursFontSize) {
		this.defaultHoursFontSize = defaultHoursFontSize;
	}


	public String getDefaultHoursFontFamily() {
		return defaultHoursFontFamily;
	}


	public void setDefaultHoursFontFamily(String defaultHoursFontFamily) {
		this.defaultHoursFontFamily = defaultHoursFontFamily;
	}


	public String getDefaultMenuFontColor() {
		return defaultMenuFontColor;
	}


	public void setDefaultMenuFontColor(String defaultMenuFontColor) {
		this.defaultMenuFontColor = defaultMenuFontColor;
	}


	public String getDefaultMenuFontSize() {
		return defaultMenuFontSize;
	}


	public void setDefaultMenuFontSize(String defaultMenuFontSize) {
		this.defaultMenuFontSize = defaultMenuFontSize;
	}


	public String getDefaultMenuFontFamily() {
		return defaultMenuFontFamily;
	}


	public void setDefaultMenuFontFamily(String defaultMenuFontFamily) {
		this.defaultMenuFontFamily = defaultMenuFontFamily;
	}


	public String getLocFirstName() {
		return locFirstName;
	}


	public void setLocFirstName(String locFirstName) {
		this.locFirstName = locFirstName;
	}


	public String getLocLastName() {
		return locLastName;
	}


	public void setLocLastName(String locLastName) {
		this.locLastName = locLastName;
	}
	private String locObjectId;
	public String getLocObjectId() {
		return locObjectId;
	}


	public void setLocObjectId(String locObjectId) {
		this.locObjectId = locObjectId;
	}


	public String getLocationAdmin() {
		return locationAdmin;
	}


	public void setLocationAdmin(String locationAdmin) {
		this.locationAdmin = locationAdmin;
	}
	private String name;
	private String zipcode;
	private String address;
	private String address2;
	private String street;
	private String town;
	private double longitude;
	private double latitude;
	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	private String siteId;
	private String groupName;
	private String logo;
	private String hotelLogo;
	private String footerLogo;
	public String getHotelLogo() {
		return hotelLogo;
	}


	public void setHotelLogo(String hotelLogo) {
		this.hotelLogo = hotelLogo;
	}


	public String getFooterLogo() {
		return footerLogo;
	}


	public void setFooterLogo(String footerLogo) {
		this.footerLogo = footerLogo;
	}
	private String qRCode;
	private String webqrCode;
	public String getWebqrCode() {
		return webqrCode;
	}


	public void setWebqrCode(String webqrCode) {
		this.webqrCode = webqrCode;
	}
	private String parentDirectoryId;
	private String description;
	private String addressColor;
	public String getLocationAddressFontFamily() {
		return locationAddressFontFamily;
	}


	public void setLocationAddressFontFamily(String locationAddressFontFamily) {
		this.locationAddressFontFamily = locationAddressFontFamily;
	}
	private String addressFont;
	private String addressBackgroundColor;
	private String hotelLogoBackgroundColor;
	private String hotelImageBackgroundColor;
	private String hotelFooterBackgroundColor;
	public String getAddressBackgroundColor() {
		return addressBackgroundColor;
	}


	public void setAddressBackgroundColor(String addressBackgroundColor) {
		this.addressBackgroundColor = addressBackgroundColor;
	}


	public String getHotelLogoBackgroundColor() {
		return hotelLogoBackgroundColor;
	}


	public void setHotelLogoBackgroundColor(String hotelLogoBackgroundColor) {
		this.hotelLogoBackgroundColor = hotelLogoBackgroundColor;
	}


	public String getHotelImageBackgroundColor() {
		return hotelImageBackgroundColor;
	}


	public void setHotelImageBackgroundColor(String hotelImageBackgroundColor) {
		this.hotelImageBackgroundColor = hotelImageBackgroundColor;
	}


	public String getHotelFooterBackgroundColor() {
		return hotelFooterBackgroundColor;
	}


	public void setHotelFooterBackgroundColor(String hotelFooterBackgroundColor) {
		this.hotelFooterBackgroundColor = hotelFooterBackgroundColor;
	}


	public String getHotelTitleBackgroundColor() {
		return hotelTitleBackgroundColor;
	}


	public void setHotelTitleBackgroundColor(String hotelTitleBackgroundColor) {
		this.hotelTitleBackgroundColor = hotelTitleBackgroundColor;
	}


	public String getHotelCaptionBackgroundColor() {
		return hotelCaptionBackgroundColor;
	}


	public void setHotelCaptionBackgroundColor(String hotelCaptionBackgroundColor) {
		this.hotelCaptionBackgroundColor = hotelCaptionBackgroundColor;
	}
	private String brandBackgroundColor;
	private String footerText;
	private String footerImageBackgroundColor;
	private String footerTextColor;
	private String footerFont;
	private String footerFontFamily;
	private String styleId;
	private String hotelColor;
	private String hotelTitleBackgroundColor;
	private String hotelFont;
	private String hotelFontFamily;
	private String hotelCaption;
	private String captionColor;
	private String hotelCaptionBackgroundColor;
	private String captionFont;
	private String captionFontFamily;
	private String locationAddressFontFamily;
	private String brandButtonColor;
	private String brandFontColor;
	private String brandFontFamily;
	
	
	
	
	

	 public String getBrandButtonColor(){
		   return brandButtonColor;
	   }
	   
	   public void setBrandButtonColor(String brandButtonColor){
		   this.brandButtonColor=brandButtonColor;
	   }
	   
	   public String getBrandFontColor(){
		   return brandFontColor;
	   }
	  
	   public void setBrandFontColor(String brandFontColor){
		   this.brandFontColor=brandFontColor;
	   }
	  
	   public String getBrandFontFamily(){
		   return brandFontFamily;
	   }
	   
	   public void setBrandFontFamily(String brandFontFamily){
		   this.brandFontFamily=brandFontFamily;
	   }
		
	
	public String getHotelColor() {
		return hotelColor;
	}


	public void setHotelColor(String hotelColor) {
		this.hotelColor = hotelColor;
	}


	public String getHotelFont() {
		return hotelFont;
	}


	public void setHotelFont(String hotelFont) {
		this.hotelFont = hotelFont;
	}


	public String getHotelFontFamily() {
		return hotelFontFamily;
	}


	public void setHotelFontFamily(String hotelFontFamily) {
		this.hotelFontFamily = hotelFontFamily;
	}


	public String getHotelCaption() {
		return hotelCaption;
	}


	public void setHotelCaption(String hotelCaption) {
		this.hotelCaption = hotelCaption;
	}


	public String getCaptionColor() {
		return captionColor;
	}


	public void setCaptionColor(String captionColor) {
		this.captionColor = captionColor;
	}


	public String getCaptionFont() {
		return captionFont;
	}


	public void setCaptionFont(String captionFont) {
		this.captionFont = captionFont;
	}


	public String getCaptionFontFamily() {
		return captionFontFamily;
	}


	public void setCaptionFontFamily(String captionFontFamily) {
		this.captionFontFamily = captionFontFamily;
	}


	


	public String getStyleId() {
		return styleId;
	}


	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}


	public String getAddressColor() {
		return addressColor;
	}


	public void setAddressColor(String addressColor) {
		this.addressColor = addressColor;
	}


	public String getAddressFont() {
		return addressFont;
	}


	public void setAddressFont(String addressFont) {
		this.addressFont = addressFont;
	}


	public String getBrandBackgroundColor() {
		return brandBackgroundColor;
	}


	public void setBrandBackgroundColor(String brandBackgroundColor) {
		this.brandBackgroundColor = brandBackgroundColor;
	}


	public String getFooterText() {
		return footerText;
	}


	public void setFooterText(String footerText) {
		this.footerText = footerText;
	}


	public String getFooterImageBackgroundColor() {
		return footerImageBackgroundColor;
	}


	public void setFooterImageBackgroundColor(String footerImageBackgroundColor) {
		this.footerImageBackgroundColor = footerImageBackgroundColor;
	}


	public String getFooterTextColor() {
		return footerTextColor;
	}


	public void setFooterTextColor(String footerTextColor) {
		this.footerTextColor = footerTextColor;
	}


	public String getFooterFont() {
		return footerFont;
	}


	public void setFooterFont(String footerFont) {
		this.footerFont = footerFont;
	}


	public String getFooterFontFamily() {
		return footerFontFamily;
	}


	public void setFooterFontFamily(String footerFontFamily) {
		this.footerFontFamily = footerFontFamily;
	}


	

	
	public EgsdLoctionObject(String objectId, String directory, String name, String zipcode, String address,
			String address2, String street, String town, String siteId, String groupName, String logo, String qRCode,
			String parentDirectoryId, String description, String addressColor, String addressFont,
			String brandBackgroundColor, String footerText, String footerImageBackgroundColor, String footerTextColor,
			String footerFont, String footerFontFamily, String styleId, String country) {
		super();
		this.objectId = objectId;
		this.directory = directory;
		this.name = name;
		this.zipcode = zipcode;
		this.address = address;
		this.address2 = address2;
		this.street = street;
		this.town = town;
		this.siteId = siteId;
		this.groupName = groupName;
		this.logo = logo;
		this.qRCode = qRCode;
		this.parentDirectoryId = parentDirectoryId;
		this.description = description;
		this.addressColor = addressColor;
		this.addressFont = addressFont;
		this.brandBackgroundColor = brandBackgroundColor;
		this.footerText = footerText;
		this.footerImageBackgroundColor = footerImageBackgroundColor;
		this.footerTextColor = footerTextColor;
		this.footerFont = footerFont;
		this.footerFontFamily = footerFontFamily;
		this.styleId = styleId;
		this.country = country;
	}


	public EgsdLoctionObject()  {}
	
	public String getSiteId() {
		return siteId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	private String country;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getqRCode() {
		return qRCode;
	}
	public void setqRCode(String qRCode) {
		this.qRCode = qRCode;
	}
	public String getParentDirectoryId() {
		return parentDirectoryId;
	}
	public void setParentDirectoryId(String parentDirectoryId) {
		this.parentDirectoryId = parentDirectoryId;
	}
	
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "EgsdLoctionObject [objectId=" + objectId + ", directory="
				+ directory + ", locationAdmin=" + locationAdmin
				+ ", locFirstName=" + locFirstName + ", locLastName="
				+ locLastName + ", defaultTitleFontColor="
				+ defaultTitleFontColor + ", defaultTitleFontSize="
				+ defaultTitleFontSize + ", defaultTitleFontFamily="
				+ defaultTitleFontFamily + ", defaultCaptionFontColor="
				+ defaultCaptionFontColor + ", defaultCaptionFontSize="
				+ defaultCaptionFontSize + ", defaultCaptionFontFamily="
				+ defaultCaptionFontFamily + ", defaultHoursFontColor="
				+ defaultHoursFontColor + ", defaultHoursFontSize="
				+ defaultHoursFontSize + ", defaultHoursFontFamily="
				+ defaultHoursFontFamily + ", defaultMenuFontColor="
				+ defaultMenuFontColor + ", defaultMenuFontSize="
				+ defaultMenuFontSize + ", defaultMenuFontFamily="
				+ defaultMenuFontFamily + ", templateDetails="
				+ templateDetails + ", addressDetails=" + addressDetails
				+ ", templateLogo=" + templateLogo + ", templateImage="
				+ templateImage + ", templateFooter=" + templateFooter
				+ ", brandDetails=" + brandDetails + ", footerDetails="
				+ footerDetails + ", locObjectId=" + locObjectId + ", name="
				+ name + ", zipcode=" + zipcode + ", address=" + address
				+ ", address2=" + address2 + ", street=" + street + ", town="
				+ town + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", siteId=" + siteId + ", groupName=" + groupName + ", logo="
				+ logo + ", hotelLogo=" + hotelLogo + ", footerLogo="
				+ footerLogo + ", qRCode=" + qRCode + ", webqrCode="
				+ webqrCode + ", parentDirectoryId=" + parentDirectoryId
				+ ", description=" + description + ", addressColor="
				+ addressColor + ", addressFont=" + addressFont
				+ ", brandBackgroundColor=" + brandBackgroundColor
				+ ", footerText=" + footerText
				+ ", footerImageBackgroundColor=" + footerImageBackgroundColor
				+ ", footerTextColor=" + footerTextColor + ", footerFont="
				+ footerFont + ", footerFontFamily=" + footerFontFamily
				+ ", styleId=" + styleId + ", hotelColor=" + hotelColor
				+ ", hotelFont=" + hotelFont + ", hotelFontFamily="
				+ hotelFontFamily + ", hotelCaption=" + hotelCaption
				+ ", captionColor=" + captionColor + ", captionFont="
				+ captionFont + ", captionFontFamily=" + captionFontFamily
				+ ", locationAddressFontFamily=" + locationAddressFontFamily
				+ ", brandButtonColor=" + brandButtonColor
				+ ", brandFontColor=" + brandFontColor + ", brandFontFamily="
				+ brandFontFamily + ", country=" + country + "]";
	}




	

	
	
	
}
