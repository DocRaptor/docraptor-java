

# Doc


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A name for identifying your document. |  |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | The type of document being created. |  |
|**documentContent** | **String** | The HTML data to be transformed into a document. You must supply content using document_content or document_url.  |  |
|**documentUrl** | **String** | The URL to fetch the HTML data to be transformed into a document. You must supply content using document_content or document_url.  |  [optional] |
|**test** | **Boolean** | Enable test mode for this document. Test documents are not charged for but include a watermark. |  [optional] |
|**pipeline** | **String** | Specify a specific verison of the DocRaptor Pipeline to use. |  [optional] |
|**strict** | [**StrictEnum**](#StrictEnum) | Force strict HTML validation. |  [optional] |
|**ignoreResourceErrors** | **Boolean** | Failed loading of images/javascripts/stylesheets/etc. will not cause the rendering to stop. |  [optional] |
|**ignoreConsoleMessages** | **Boolean** | Prevent console.log from stopping document rendering during JavaScript execution. |  [optional] |
|**tag** | **String** | A field for storing a small amount of metadata with this document. |  [optional] |
|**help** | **Boolean** | Request support help with this request if it succeeds. |  [optional] |
|**javascript** | **Boolean** | Enable DocRaptor JavaScript parsing. PrinceXML JavaScript parsing is also available elsewhere. |  [optional] |
|**referrer** | **String** | Set HTTP referrer when generating this document. |  [optional] |
|**callbackUrl** | **String** | A URL that will receive a POST request after successfully completing an asynchronous document. The POST data will include download_url and download_id similar to status API responses. WARNING: this only works on asynchronous documents.  |  [optional] |
|**hostedDownloadLimit** | **Integer** | The number of times a hosted document can be downloaded.  If no limit is specified, the document will be available for an unlimited number of downloads. |  [optional] |
|**hostedExpiresAt** | **String** | The date and time at which a hosted document will be removed and no longer available. Must be a properly formatted ISO 8601 datetime, like 1981-01-23T08:02:30-05:00. |  [optional] |
|**princeOptions** | [**PrinceOptions**](PrinceOptions.md) |  |  [optional] |



## Enum: DocumentTypeEnum

| Name | Value |
|---- | -----|
| PDF | &quot;pdf&quot; |
| XLS | &quot;xls&quot; |
| XLSX | &quot;xlsx&quot; |



## Enum: StrictEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| HTML | &quot;html&quot; |



