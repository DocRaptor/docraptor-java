package com.docraptor;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class PrinceOptions   {

  private String baseurl = null;
  private Boolean noXinclude = null;
  private Boolean noNetwork = null;
  private String httpUser = null;
  private String httpPassword = null;
  private String httpProxy = null;
  private Integer httpTimeout = null;
  private Boolean insecure = null;
  private String media = "print";
  private Boolean noAuthorStyle = null;
  private Boolean noDefaultStyle = null;
  private Boolean noEmbedFonts = null;
  private Boolean noSubsetFonts = null;
  private Boolean noCompress = null;
  private Boolean encrypt = null;
  private Integer keyBits = null;
  private String userPassword = null;
  private String ownerPassword = null;
  private Boolean disallowPrint = null;
  private Boolean disallowCopy = null;
  private Boolean disallowAnnotate = null;
  private Boolean disallowModify = null;
  private Boolean debug = null;


  public enum InputEnum {
    HTML("html"),
    XML("xml"),
    AUTO("auto");

    private String value;

    InputEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private InputEnum input = InputEnum.HTML;
  private String version = null;
  private Boolean javascript = null;
  private Integer cssDpi = null;
  private String profile = null;


  /**
   * Set the baseurl for assets.
   **/
  public PrinceOptions baseurl(String baseurl) {
    this.baseurl = baseurl;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Set the baseurl for assets.")
  @JsonProperty("baseurl")
  public String getBaseurl() {
    return baseurl;
  }
  public void setBaseurl(String baseurl) {
    this.baseurl = baseurl;
  }


  /**
   * Disable XML inclusion.
   **/
  public PrinceOptions noXinclude(Boolean noXinclude) {
    this.noXinclude = noXinclude;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Disable XML inclusion.")
  @JsonProperty("no_xinclude")
  public Boolean getNoXinclude() {
    return noXinclude;
  }
  public void setNoXinclude(Boolean noXinclude) {
    this.noXinclude = noXinclude;
  }


  /**
   * Disable network access.
   **/
  public PrinceOptions noNetwork(Boolean noNetwork) {
    this.noNetwork = noNetwork;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Disable network access.")
  @JsonProperty("no_network")
  public Boolean getNoNetwork() {
    return noNetwork;
  }
  public void setNoNetwork(Boolean noNetwork) {
    this.noNetwork = noNetwork;
  }


  /**
   * Set the user for HTTP authentication.
   **/
  public PrinceOptions httpUser(String httpUser) {
    this.httpUser = httpUser;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Set the user for HTTP authentication.")
  @JsonProperty("http_user")
  public String getHttpUser() {
    return httpUser;
  }
  public void setHttpUser(String httpUser) {
    this.httpUser = httpUser;
  }


  /**
   * Set the password for HTTP authentication.
   **/
  public PrinceOptions httpPassword(String httpPassword) {
    this.httpPassword = httpPassword;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Set the password for HTTP authentication.")
  @JsonProperty("http_password")
  public String getHttpPassword() {
    return httpPassword;
  }
  public void setHttpPassword(String httpPassword) {
    this.httpPassword = httpPassword;
  }


  /**
   * Set the HTTP proxy server.
   **/
  public PrinceOptions httpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Set the HTTP proxy server.")
  @JsonProperty("http_proxy")
  public String getHttpProxy() {
    return httpProxy;
  }
  public void setHttpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
  }


  /**
   * Set the HTTP request timeout.
   **/
  public PrinceOptions httpTimeout(Integer httpTimeout) {
    this.httpTimeout = httpTimeout;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Set the HTTP request timeout.")
  @JsonProperty("http_timeout")
  public Integer getHttpTimeout() {
    return httpTimeout;
  }
  public void setHttpTimeout(Integer httpTimeout) {
    this.httpTimeout = httpTimeout;
  }


  /**
   * Disable SSL verification.
   **/
  public PrinceOptions insecure(Boolean insecure) {
    this.insecure = insecure;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Disable SSL verification.")
  @JsonProperty("insecure")
  public Boolean getInsecure() {
    return insecure;
  }
  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }


  /**
   * Specify the CSS media type. Defaults to \"print\" but you may want to use \"screen\" for web styles.
   **/
  public PrinceOptions media(String media) {
    this.media = media;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Specify the CSS media type. Defaults to \"print\" but you may want to use \"screen\" for web styles.")
  @JsonProperty("media")
  public String getMedia() {
    return media;
  }
  public void setMedia(String media) {
    this.media = media;
  }


  /**
   * Ignore author stylesheets.
   **/
  public PrinceOptions noAuthorStyle(Boolean noAuthorStyle) {
    this.noAuthorStyle = noAuthorStyle;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Ignore author stylesheets.")
  @JsonProperty("no_author_style")
  public Boolean getNoAuthorStyle() {
    return noAuthorStyle;
  }
  public void setNoAuthorStyle(Boolean noAuthorStyle) {
    this.noAuthorStyle = noAuthorStyle;
  }


  /**
   * Ignore default stylesheets.
   **/
  public PrinceOptions noDefaultStyle(Boolean noDefaultStyle) {
    this.noDefaultStyle = noDefaultStyle;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Ignore default stylesheets.")
  @JsonProperty("no_default_style")
  public Boolean getNoDefaultStyle() {
    return noDefaultStyle;
  }
  public void setNoDefaultStyle(Boolean noDefaultStyle) {
    this.noDefaultStyle = noDefaultStyle;
  }


  /**
   * Disable font embedding in PDFs.
   **/
  public PrinceOptions noEmbedFonts(Boolean noEmbedFonts) {
    this.noEmbedFonts = noEmbedFonts;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Disable font embedding in PDFs.")
  @JsonProperty("no_embed_fonts")
  public Boolean getNoEmbedFonts() {
    return noEmbedFonts;
  }
  public void setNoEmbedFonts(Boolean noEmbedFonts) {
    this.noEmbedFonts = noEmbedFonts;
  }


  /**
   * Disable font subsetting in PDFs.
   **/
  public PrinceOptions noSubsetFonts(Boolean noSubsetFonts) {
    this.noSubsetFonts = noSubsetFonts;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Disable font subsetting in PDFs.")
  @JsonProperty("no_subset_fonts")
  public Boolean getNoSubsetFonts() {
    return noSubsetFonts;
  }
  public void setNoSubsetFonts(Boolean noSubsetFonts) {
    this.noSubsetFonts = noSubsetFonts;
  }


  /**
   * Disable PDF compression.
   **/
  public PrinceOptions noCompress(Boolean noCompress) {
    this.noCompress = noCompress;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Disable PDF compression.")
  @JsonProperty("no_compress")
  public Boolean getNoCompress() {
    return noCompress;
  }
  public void setNoCompress(Boolean noCompress) {
    this.noCompress = noCompress;
  }


  /**
   * Encrypt PDF output.
   **/
  public PrinceOptions encrypt(Boolean encrypt) {
    this.encrypt = encrypt;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Encrypt PDF output.")
  @JsonProperty("encrypt")
  public Boolean getEncrypt() {
    return encrypt;
  }
  public void setEncrypt(Boolean encrypt) {
    this.encrypt = encrypt;
  }


  /**
   * Set encryption key size.
   **/
  public PrinceOptions keyBits(Integer keyBits) {
    this.keyBits = keyBits;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Set encryption key size.")
  @JsonProperty("key_bits")
  public Integer getKeyBits() {
    return keyBits;
  }
  public void setKeyBits(Integer keyBits) {
    this.keyBits = keyBits;
  }


  /**
   * Set the PDF user password.
   **/
  public PrinceOptions userPassword(String userPassword) {
    this.userPassword = userPassword;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Set the PDF user password.")
  @JsonProperty("user_password")
  public String getUserPassword() {
    return userPassword;
  }
  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  /**
   * Set the PDF owner password.
   **/
  public PrinceOptions ownerPassword(String ownerPassword) {
    this.ownerPassword = ownerPassword;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Set the PDF owner password.")
  @JsonProperty("owner_password")
  public String getOwnerPassword() {
    return ownerPassword;
  }
  public void setOwnerPassword(String ownerPassword) {
    this.ownerPassword = ownerPassword;
  }


  /**
   * Disallow printing of this PDF.
   **/
  public PrinceOptions disallowPrint(Boolean disallowPrint) {
    this.disallowPrint = disallowPrint;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Disallow printing of this PDF.")
  @JsonProperty("disallow_print")
  public Boolean getDisallowPrint() {
    return disallowPrint;
  }
  public void setDisallowPrint(Boolean disallowPrint) {
    this.disallowPrint = disallowPrint;
  }


  /**
   * Disallow copying of this PDF.
   **/
  public PrinceOptions disallowCopy(Boolean disallowCopy) {
    this.disallowCopy = disallowCopy;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Disallow copying of this PDF.")
  @JsonProperty("disallow_copy")
  public Boolean getDisallowCopy() {
    return disallowCopy;
  }
  public void setDisallowCopy(Boolean disallowCopy) {
    this.disallowCopy = disallowCopy;
  }


  /**
   * Disallow annotation of this PDF.
   **/
  public PrinceOptions disallowAnnotate(Boolean disallowAnnotate) {
    this.disallowAnnotate = disallowAnnotate;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Disallow annotation of this PDF.")
  @JsonProperty("disallow_annotate")
  public Boolean getDisallowAnnotate() {
    return disallowAnnotate;
  }
  public void setDisallowAnnotate(Boolean disallowAnnotate) {
    this.disallowAnnotate = disallowAnnotate;
  }


  /**
   * Disallow modification of this PDF.
   **/
  public PrinceOptions disallowModify(Boolean disallowModify) {
    this.disallowModify = disallowModify;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Disallow modification of this PDF.")
  @JsonProperty("disallow_modify")
  public Boolean getDisallowModify() {
    return disallowModify;
  }
  public void setDisallowModify(Boolean disallowModify) {
    this.disallowModify = disallowModify;
  }


  /**
   * Enable Prince debug mode.
   **/
  public PrinceOptions debug(Boolean debug) {
    this.debug = debug;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Enable Prince debug mode.")
  @JsonProperty("debug")
  public Boolean getDebug() {
    return debug;
  }
  public void setDebug(Boolean debug) {
    this.debug = debug;
  }


  /**
   * Specify the input format.
   **/
  public PrinceOptions input(InputEnum input) {
    this.input = input;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Specify the input format.")
  @JsonProperty("input")
  public InputEnum getInput() {
    return input;
  }
  public void setInput(InputEnum input) {
    this.input = input;
  }


  /**
   * Specify a specific verison of PrinceXML to use.
   **/
  public PrinceOptions version(String version) {
    this.version = version;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Specify a specific verison of PrinceXML to use.")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Enable PrinceXML JavaScript. DocRaptor JavaScript parsing is also available elsewhere.
   **/
  public PrinceOptions javascript(Boolean javascript) {
    this.javascript = javascript;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Enable PrinceXML JavaScript. DocRaptor JavaScript parsing is also available elsewhere.")
  @JsonProperty("javascript")
  public Boolean getJavascript() {
    return javascript;
  }
  public void setJavascript(Boolean javascript) {
    this.javascript = javascript;
  }


  /**
   * Set the DPI when rendering CSS. Defaults to 96 but can be set with Prince 9.0 and up.
   **/
  public PrinceOptions cssDpi(Integer cssDpi) {
    this.cssDpi = cssDpi;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Set the DPI when rendering CSS. Defaults to 96 but can be set with Prince 9.0 and up.")
  @JsonProperty("css_dpi")
  public Integer getCssDpi() {
    return cssDpi;
  }
  public void setCssDpi(Integer cssDpi) {
    this.cssDpi = cssDpi;
  }


  /**
   * In Prince 9.0 and up you can set the PDF profile.
   **/
  public PrinceOptions profile(String profile) {
    this.profile = profile;
    return this;
  }

  @ApiModelProperty(example = "null", value = "In Prince 9.0 and up you can set the PDF profile.")
  @JsonProperty("profile")
  public String getProfile() {
    return profile;
  }
  public void setProfile(String profile) {
    this.profile = profile;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrinceOptions princeOptions = (PrinceOptions) o;
    return Objects.equals(this.baseurl, princeOptions.baseurl) &&
        Objects.equals(this.noXinclude, princeOptions.noXinclude) &&
        Objects.equals(this.noNetwork, princeOptions.noNetwork) &&
        Objects.equals(this.httpUser, princeOptions.httpUser) &&
        Objects.equals(this.httpPassword, princeOptions.httpPassword) &&
        Objects.equals(this.httpProxy, princeOptions.httpProxy) &&
        Objects.equals(this.httpTimeout, princeOptions.httpTimeout) &&
        Objects.equals(this.insecure, princeOptions.insecure) &&
        Objects.equals(this.media, princeOptions.media) &&
        Objects.equals(this.noAuthorStyle, princeOptions.noAuthorStyle) &&
        Objects.equals(this.noDefaultStyle, princeOptions.noDefaultStyle) &&
        Objects.equals(this.noEmbedFonts, princeOptions.noEmbedFonts) &&
        Objects.equals(this.noSubsetFonts, princeOptions.noSubsetFonts) &&
        Objects.equals(this.noCompress, princeOptions.noCompress) &&
        Objects.equals(this.encrypt, princeOptions.encrypt) &&
        Objects.equals(this.keyBits, princeOptions.keyBits) &&
        Objects.equals(this.userPassword, princeOptions.userPassword) &&
        Objects.equals(this.ownerPassword, princeOptions.ownerPassword) &&
        Objects.equals(this.disallowPrint, princeOptions.disallowPrint) &&
        Objects.equals(this.disallowCopy, princeOptions.disallowCopy) &&
        Objects.equals(this.disallowAnnotate, princeOptions.disallowAnnotate) &&
        Objects.equals(this.disallowModify, princeOptions.disallowModify) &&
        Objects.equals(this.debug, princeOptions.debug) &&
        Objects.equals(this.input, princeOptions.input) &&
        Objects.equals(this.version, princeOptions.version) &&
        Objects.equals(this.javascript, princeOptions.javascript) &&
        Objects.equals(this.cssDpi, princeOptions.cssDpi) &&
        Objects.equals(this.profile, princeOptions.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseurl, noXinclude, noNetwork, httpUser, httpPassword, httpProxy, httpTimeout, insecure, media, noAuthorStyle, noDefaultStyle, noEmbedFonts, noSubsetFonts, noCompress, encrypt, keyBits, userPassword, ownerPassword, disallowPrint, disallowCopy, disallowAnnotate, disallowModify, debug, input, version, javascript, cssDpi, profile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrinceOptions {\n");

    sb.append("    baseurl: ").append(toIndentedString(baseurl)).append("\n");
    sb.append("    noXinclude: ").append(toIndentedString(noXinclude)).append("\n");
    sb.append("    noNetwork: ").append(toIndentedString(noNetwork)).append("\n");
    sb.append("    httpUser: ").append(toIndentedString(httpUser)).append("\n");
    sb.append("    httpPassword: ").append(toIndentedString(httpPassword)).append("\n");
    sb.append("    httpProxy: ").append(toIndentedString(httpProxy)).append("\n");
    sb.append("    httpTimeout: ").append(toIndentedString(httpTimeout)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    noAuthorStyle: ").append(toIndentedString(noAuthorStyle)).append("\n");
    sb.append("    noDefaultStyle: ").append(toIndentedString(noDefaultStyle)).append("\n");
    sb.append("    noEmbedFonts: ").append(toIndentedString(noEmbedFonts)).append("\n");
    sb.append("    noSubsetFonts: ").append(toIndentedString(noSubsetFonts)).append("\n");
    sb.append("    noCompress: ").append(toIndentedString(noCompress)).append("\n");
    sb.append("    encrypt: ").append(toIndentedString(encrypt)).append("\n");
    sb.append("    keyBits: ").append(toIndentedString(keyBits)).append("\n");
    sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
    sb.append("    ownerPassword: ").append(toIndentedString(ownerPassword)).append("\n");
    sb.append("    disallowPrint: ").append(toIndentedString(disallowPrint)).append("\n");
    sb.append("    disallowCopy: ").append(toIndentedString(disallowCopy)).append("\n");
    sb.append("    disallowAnnotate: ").append(toIndentedString(disallowAnnotate)).append("\n");
    sb.append("    disallowModify: ").append(toIndentedString(disallowModify)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    javascript: ").append(toIndentedString(javascript)).append("\n");
    sb.append("    cssDpi: ").append(toIndentedString(cssDpi)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

