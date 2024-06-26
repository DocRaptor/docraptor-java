### 3.2.0 [April 2, 2024]
* Add the new userAgentToken API option, to enable passing a key that will be passed back on resource requests

### 3.1.0 [July 14, 2023]
* Add new API options (including prince_options[pdf_forms] to enable PDF forms)

### 3.0.0 [November 15, 2022]
* Switch API host to more secure api.docraptor.com (dropping old TLS)
* Switch from swagger to openapi-generator v6.0.1 (better maintained)
* Remove support for java <8

### 2.0.0 [July 31, 2020]
* add support for hosted documents
* upgrade to latest swagger 2.4.14
* **BREAKING CHANGE**: renamed AsyncDocStatus to DocStatus

### 1.1.1 [January 8, 2017]
* correct ownership and contact details

### 1.1.0 [November 3, 2016]
* Added support for the pipeline API parameter

### 1.0.0 [October 18, 2016]
* No significant code changes

### 0.4.0 [September 27, 2016]
* Added support for prince_options[no_parallel_downloads]

### 0.3.0 [March 12, 2016]
* Added support for prince_options[debug]

### 0.2.0 [January 29, 2016]
* **BREAKING CHANGE**: Rename ClientApi to DocApi

### 0.1.0 [January 27, 2016]
* **BREAKING CHANGE**: createDoc and getAsyncDoc responses are now byte[] instead of temp files

### 0.0.1 [January 19, 2016]
* Initial release
