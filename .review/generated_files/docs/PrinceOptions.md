

# PrinceOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseurl** | **String** | Set the baseurl for assets. |  [optional] |
|**noXinclude** | **Boolean** | Disable XML inclusion. |  [optional] |
|**noNetwork** | **Boolean** | Disable network access. |  [optional] |
|**noParallelDownloads** | **Boolean** | Disables parallel fetching of assets during PDF creation. Useful if your asset host has strict rate limiting. |  [optional] |
|**httpUser** | **String** | Set the user for HTTP authentication. |  [optional] |
|**httpPassword** | **String** | Set the password for HTTP authentication. |  [optional] |
|**httpProxy** | **String** | Set the HTTP proxy server. |  [optional] |
|**httpTimeout** | **Integer** | Set the HTTP request timeout. |  [optional] |
|**insecure** | **Boolean** | Disable SSL verification. |  [optional] |
|**media** | **String** | Specify the CSS media type. Defaults to \&quot;print\&quot; but you may want to use \&quot;screen\&quot; for web styles. |  [optional] |
|**noAuthorStyle** | **Boolean** | Ignore author stylesheets. |  [optional] |
|**noDefaultStyle** | **Boolean** | Ignore default stylesheets. |  [optional] |
|**noEmbedFonts** | **Boolean** | Disable font embedding in PDFs. |  [optional] |
|**noSubsetFonts** | **Boolean** | Disable font subsetting in PDFs. |  [optional] |
|**noCompress** | **Boolean** | Disable PDF compression. |  [optional] |
|**encrypt** | **Boolean** | Encrypt PDF output. |  [optional] |
|**keyBits** | **Integer** | Set encryption key size. |  [optional] |
|**userPassword** | **String** | Set the PDF user password. |  [optional] |
|**ownerPassword** | **String** | Set the PDF owner password. |  [optional] |
|**disallowPrint** | **Boolean** | Disallow printing of this PDF. |  [optional] |
|**disallowCopy** | **Boolean** | Disallow copying of this PDF. |  [optional] |
|**disallowAnnotate** | **Boolean** | Disallow annotation of this PDF. |  [optional] |
|**disallowModify** | **Boolean** | Disallow modification of this PDF. |  [optional] |
|**debug** | **Boolean** | Enable Prince debug mode. |  [optional] |
|**input** | [**InputEnum**](#InputEnum) | Specify the input format. |  [optional] |
|**version** | **String** | Deprecated, use the appropriate &#x60;pipeline&#x60; version. Specify a specific verison of PrinceXML to use. |  [optional] |
|**javascript** | **Boolean** | Enable PrinceXML JavaScript. DocRaptor JavaScript parsing is also available elsewhere. |  [optional] |
|**cssDpi** | **Integer** | Set the DPI when rendering CSS. Defaults to 96 but can be set with Prince 9.0 and up. |  [optional] |
|**profile** | **String** | In Prince 9.0 and up you can set the PDF profile. |  [optional] |
|**pdfTitle** | **String** | Specify the PDF title, part of the document&#39;s metadata. |  [optional] |
|**iframes** | **Boolean** | Enable loading of iframes. |  [optional] |
|**pageMargin** | **String** | Specify the page margin distance. |  [optional] |
|**pdfForms** | **Boolean** | Make form fields editable by default. |  [optional] |



## Enum: InputEnum

| Name | Value |
|---- | -----|
| HTML | &quot;html&quot; |
| XML | &quot;xml&quot; |
| AUTO | &quot;auto&quot; |



