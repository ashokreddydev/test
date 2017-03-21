package egsd.model;

public class EgsdTemplateObjects {

	
	private String objectId;
	private String name;
	private String locationId;
	private boolean customized;
	private String templateFooter;
	private String templateImage;
	private String templateLogo;
	private int templateLogoSize;
	private int templateImageSize;
	private int templateFooterSize;
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
	public int getTemplateLogoSize() {
		return templateLogoSize;
	}
	public void setTemplateLogoSize(int templateLogoSize) {
		this.templateLogoSize = templateLogoSize;
	}
	public int getTemplateImageSize() {
		return templateImageSize;
	}
	public void setTemplateImageSize(int templateImageSize) {
		this.templateImageSize = templateImageSize;
	}
	public int getTemplateFooterSize() {
		return templateFooterSize;
	}
	public void setTemplateFooterSize(int templateFooterSize) {
		this.templateFooterSize = templateFooterSize;
	}

	private String defaultTitleFontColor;
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
	
	private Boolean templateLogoLock;
	private Boolean templateImageLock;
	private Boolean templateFooterLock;
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
	public Boolean getTemplateLogoLock() {
		return templateLogoLock;
	}
	public void setTemplateLogoLock(Boolean templateLogoLock) {
		this.templateLogoLock = templateLogoLock;
	}
	public Boolean getTemplateImageLock() {
		return templateImageLock;
	}
	public void setTemplateImageLock(Boolean templateImageLock) {
		this.templateImageLock = templateImageLock;
	}
	public Boolean getTemplateFooterLock() {
		return templateFooterLock;
	}
	public void setTemplateFooterLock(Boolean templateFooterLock) {
		this.templateFooterLock = templateFooterLock;
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

	private Boolean brandDetails;
	private Boolean footerDetails;
	
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
	public String getTemplateFooter() {
		return templateFooter;
	}
	public void setTemplateFooter(String templateFooter) {
		this.templateFooter = templateFooter;
	}
	public String getTemplateImage() {
		return templateImage;
	}
	public void setTemplateImage(String templateImage) {
		this.templateImage = templateImage;
	}
	public String getTemplateLogo() {
		return templateLogo;
	}
	public void setTemplateLogo(String templateLogo) {
		this.templateLogo = templateLogo;
	}
	public EgsdTemplateObjects(String objectId, String name, String locationId, boolean customized) {
		super();
		this.objectId = objectId;
		this.name = name;
		this.locationId = locationId;
		this.customized = customized;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public boolean isCustomized() {
		return customized;
	}
	public void setCustomized(boolean customized) {
		this.customized = customized;
	}
	@Override
	public String toString() {
		return "EgsdTemplateObjects [objectId=" + objectId + ", name=" + name + ", locationId=" + locationId
				+ ", customized=" + customized + "]";
	}
		
	public EgsdTemplateObjects()  {}
	
	private String templateBrandBackgroundColor;
	private String templateFooterText;
	private String templateFooterImageBackgroundColor;
	private String templateFooterTextColor;
	private String templateFooterFont;
	private String templateFooterFontFamily;
	public String getTemplateBrandBackgroundColor() {
		return templateBrandBackgroundColor;
	}
	public void setTemplateBrandBackgroundColor(String templateBrandBackgroundColor) {
		this.templateBrandBackgroundColor = templateBrandBackgroundColor;
	}
	public String getTemplateFooterText() {
		return templateFooterText;
	}
	public void setTemplateFooterText(String templateFooterText) {
		this.templateFooterText = templateFooterText;
	}
	public String getTemplateFooterImageBackgroundColor() {
		return templateFooterImageBackgroundColor;
	}
	public void setTemplateFooterImageBackgroundColor(
			String templateFooterImageBackgroundColor) {
		this.templateFooterImageBackgroundColor = templateFooterImageBackgroundColor;
	}
	public String getTemplateFooterTextColor() {
		return templateFooterTextColor;
	}
	public void setTemplateFooterTextColor(String templateFooterTextColor) {
		this.templateFooterTextColor = templateFooterTextColor;
	}
	public String getTemplateFooterFont() {
		return templateFooterFont;
	}
	public void setTemplateFooterFont(String templateFooterFont) {
		this.templateFooterFont = templateFooterFont;
	}
	public String getTemplateFooterFontFamily() {
		return templateFooterFontFamily;
	}
	public void setTemplateFooterFontFamily(String templateFooterFontFamily) {
		this.templateFooterFontFamily = templateFooterFontFamily;
	}
	public String getStyleId() {
		return styleId;
	}
	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}
	public String getTemplateColor() {
		return templateColor;
	}
	public void setTemplateColor(String templateColor) {
		this.templateColor = templateColor;
	}
	public String getTemplateFont() {
		return templateFont;
	}
	public void setTemplateFont(String templateFont) {
		this.templateFont = templateFont;
	}
	public String getTemplateFontFamily() {
		return templateFontFamily;
	}
	public void setTemplateFontFamily(String templateFontFamily) {
		this.templateFontFamily = templateFontFamily;
	}
	public String getTemplateCaption() {
		return templateCaption;
	}
	public void setTemplateCaption(String templateCaption) {
		this.templateCaption = templateCaption;
	}
	public String getTemplateCaptionColor() {
		return templateCaptionColor;
	}
	public void setTemplateCaptionColor(String templateCaptionColor) {
		this.templateCaptionColor = templateCaptionColor;
	}
	public String getTemplateCaptionFont() {
		return templateCaptionFont;
	}
	public void setTemplateCaptionFont(String templateCaptionFont) {
		this.templateCaptionFont = templateCaptionFont;
	}
	public String getTemplateCaptionFontFamily() {
		return templateCaptionFontFamily;
	}
	public void setTemplateCaptionFontFamily(String templateCaptionFontFamily) {
		this.templateCaptionFontFamily = templateCaptionFontFamily;
	}
	public String getTemplateBrandButtonColor() {
		return templateBrandButtonColor;
	}
	public void setTemplateBrandButtonColor(String templateBrandButtonColor) {
		this.templateBrandButtonColor = templateBrandButtonColor;
	}
	public String getTemplateBrandFontColor() {
		return templateBrandFontColor;
	}
	public void setTemplateBrandFontColor(String templateBrandFontColor) {
		this.templateBrandFontColor = templateBrandFontColor;
	}
	public String getTemplateBrandFontFamily() {
		return templateBrandFontFamily;
	}
	public void setTemplateBrandFontFamily(String templateBrandFontFamily) {
		this.templateBrandFontFamily = templateBrandFontFamily;
	}

	private String templateDescription;
	public String getTemplateDescription() {
		return templateDescription;
	}
	public void setTemplateDescription(String templateDescription) {
		this.templateDescription = templateDescription;
	}
	private String addressFont;
	public String getAddressFont() {
		return addressFont;
	}
	public void setAddressFont(String addressFont) {
		this.addressFont = addressFont;
	}
	private String addressBackgroundColor;
	private String templateLogoBackgroundColor;
	private String templateImageBackgroundColor;
	private String templateFooterBackgroundColor;
	public String getAddressBackgroundColor() {
		return addressBackgroundColor;
	}
	public void setAddressBackgroundColor(String addressBackgroundColor) {
		this.addressBackgroundColor = addressBackgroundColor;
	}
	public String getTemplateLogoBackgroundColor() {
		return templateLogoBackgroundColor;
	}
	public void setTemplateLogoBackgroundColor(String templateLogoBackgroundColor) {
		this.templateLogoBackgroundColor = templateLogoBackgroundColor;
	}
	public String getTemplateImageBackgroundColor() {
		return templateImageBackgroundColor;
	}
	public void setTemplateImageBackgroundColor(String templateImageBackgroundColor) {
		this.templateImageBackgroundColor = templateImageBackgroundColor;
	}
	public String getTemplateFooterBackgroundColor() {
		return templateFooterBackgroundColor;
	}
	public void setTemplateFooterBackgroundColor(
			String templateFooterBackgroundColor) {
		this.templateFooterBackgroundColor = templateFooterBackgroundColor;
	}
	public String getTemplateCaptionBackgroundColor() {
		return templateCaptionBackgroundColor;
	}
	public void setTemplateCaptionBackgroundColor(
			String templateCaptionBackgroundColor) {
		this.templateCaptionBackgroundColor = templateCaptionBackgroundColor;
	}
	public String getTemplateTitleBackgroundColor() {
		return templateTitleBackgroundColor;
	}
	public void setTemplateTitleBackgroundColor(String templateTitleBackgroundColor) {
		this.templateTitleBackgroundColor = templateTitleBackgroundColor;
	}

	private String addressColor;
	private String addressFontFamily;
	public String getAddressColor() {
		return addressColor;
	}
	public void setAddressColor(String addressColor) {
		this.addressColor = addressColor;
	}
	public String getAddressFontFamily() {
		return addressFontFamily;
	}
	public void setAddressFontFamily(String addressFontFamily) {
		this.addressFontFamily = addressFontFamily;
	}

	private String styleId;
	private String templateColor;
	
	private String templateFont;
	private String templateFontFamily;
	private String templateCaption;
	private String templateCaptionColor;
	private String templateCaptionBackgroundColor;
	private String templateCaptionFont;
	private String templateCaptionFontFamily;	
	private String templateBrandButtonColor;
	private String templateBrandFontColor;
	private String templateBrandFontFamily;
	private String templateTitleColor;
	private String templateTitleBackgroundColor;
	private String templateTitleFont;
	private String templateTitleFamily;
	public String getTemplateTitleColor() {
		return templateTitleColor;
	}
	public void setTemplateTitleColor(String templateTitleColor) {
		this.templateTitleColor = templateTitleColor;
	}
	public String getTemplateTitleFont() {
		return templateTitleFont;
	}
	public void setTemplateTitleFont(String templateTitleFont) {
		this.templateTitleFont = templateTitleFont;
	}
	public String getTemplateTitleFamily() {
		return templateTitleFamily;
	}
	public void setTemplateTitleFamily(String templateTitleFamily) {
		this.templateTitleFamily = templateTitleFamily;
	}
	
	
	
}
