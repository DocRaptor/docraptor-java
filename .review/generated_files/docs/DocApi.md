# DocApi

All URIs are relative to *https://api.docraptor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAsyncDoc**](DocApi.md#createAsyncDoc) | **POST** /async_docs |  |
| [**createDoc**](DocApi.md#createDoc) | **POST** /docs |  |
| [**createHostedAsyncDoc**](DocApi.md#createHostedAsyncDoc) | **POST** /hosted_async_docs |  |
| [**createHostedDoc**](DocApi.md#createHostedDoc) | **POST** /hosted_docs |  |
| [**expire**](DocApi.md#expire) | **PATCH** /expire/{id} |  |
| [**getAsyncDoc**](DocApi.md#getAsyncDoc) | **GET** /download/{id} |  |
| [**getAsyncDocStatus**](DocApi.md#getAsyncDocStatus) | **GET** /status/{id} |  |



## createAsyncDoc

> AsyncDoc createAsyncDoc(doc)



Creates a document asynchronously. You must use a callback url or the returned status id and the status API to find out when it completes. Then use the download API to get the document. 

### Example

```java
// Import classes:
import com.docraptor.ApiClient;
import com.docraptor.ApiException;
import com.docraptor.Configuration;
import com.docraptor.auth.*;
import com.docraptor.models.*;
import com.docraptor.DocApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.docraptor.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        DocApi apiInstance = new DocApi(defaultClient);
        Doc doc = new Doc(); // Doc | The document to be created.
        try {
            AsyncDoc result = apiInstance.createAsyncDoc(doc);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocApi#createAsyncDoc");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **doc** | [**Doc**](Doc.md)| The document to be created. | |

### Return type

[**AsyncDoc**](AsyncDoc.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml, application/pdf, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Server Error |  -  |


## createDoc

> byte[] createDoc(doc)



Creates a document synchronously. 

### Example

```java
// Import classes:
import com.docraptor.ApiClient;
import com.docraptor.ApiException;
import com.docraptor.Configuration;
import com.docraptor.auth.*;
import com.docraptor.models.*;
import com.docraptor.DocApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.docraptor.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        DocApi apiInstance = new DocApi(defaultClient);
        Doc doc = new Doc(); // Doc | The document to be created.
        try {
            byte[] result = apiInstance.createDoc(doc);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocApi#createDoc");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **doc** | [**Doc**](Doc.md)| The document to be created. | |

### Return type

**byte[]**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml, application/pdf, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Server Error |  -  |


## createHostedAsyncDoc

> AsyncDoc createHostedAsyncDoc(doc)



Creates a hosted document asynchronously. You must use a callback url or the returned status id and the status API to find out when it completes. Then use the download API to get the document. 

### Example

```java
// Import classes:
import com.docraptor.ApiClient;
import com.docraptor.ApiException;
import com.docraptor.Configuration;
import com.docraptor.auth.*;
import com.docraptor.models.*;
import com.docraptor.DocApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.docraptor.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        DocApi apiInstance = new DocApi(defaultClient);
        Doc doc = new Doc(); // Doc | The document to be created.
        try {
            AsyncDoc result = apiInstance.createHostedAsyncDoc(doc);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocApi#createHostedAsyncDoc");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **doc** | [**Doc**](Doc.md)| The document to be created. | |

### Return type

[**AsyncDoc**](AsyncDoc.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml, application/pdf, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Server Error |  -  |


## createHostedDoc

> DocStatus createHostedDoc(doc)



Creates a hosted document synchronously. 

### Example

```java
// Import classes:
import com.docraptor.ApiClient;
import com.docraptor.ApiException;
import com.docraptor.Configuration;
import com.docraptor.auth.*;
import com.docraptor.models.*;
import com.docraptor.DocApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.docraptor.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        DocApi apiInstance = new DocApi(defaultClient);
        Doc doc = new Doc(); // Doc | The document to be created.
        try {
            DocStatus result = apiInstance.createHostedDoc(doc);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocApi#createHostedDoc");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **doc** | [**Doc**](Doc.md)| The document to be created. | |

### Return type

[**DocStatus**](DocStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml, application/pdf, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Server Error |  -  |


## expire

> expire(id)



Expires a previously created hosted doc. 

### Example

```java
// Import classes:
import com.docraptor.ApiClient;
import com.docraptor.ApiException;
import com.docraptor.Configuration;
import com.docraptor.auth.*;
import com.docraptor.models.*;
import com.docraptor.DocApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.docraptor.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        DocApi apiInstance = new DocApi(defaultClient);
        String id = "id_example"; // String | The download_id returned from status request or hosted document response.
        try {
            apiInstance.expire(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocApi#expire");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The download_id returned from status request or hosted document response. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Server Error |  -  |


## getAsyncDoc

> byte[] getAsyncDoc(id)



Downloads a finished document. 

### Example

```java
// Import classes:
import com.docraptor.ApiClient;
import com.docraptor.ApiException;
import com.docraptor.Configuration;
import com.docraptor.auth.*;
import com.docraptor.models.*;
import com.docraptor.DocApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.docraptor.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        DocApi apiInstance = new DocApi(defaultClient);
        String id = "id_example"; // String | The download_id returned from an async status request or callback.
        try {
            byte[] result = apiInstance.getAsyncDoc(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocApi#getAsyncDoc");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The download_id returned from an async status request or callback. | |

### Return type

**byte[]**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml, application/pdf, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **500** | Server Error |  -  |


## getAsyncDocStatus

> DocStatus getAsyncDocStatus(id)



Check on the status of an asynchronously created document. 

### Example

```java
// Import classes:
import com.docraptor.ApiClient;
import com.docraptor.ApiException;
import com.docraptor.Configuration;
import com.docraptor.auth.*;
import com.docraptor.models.*;
import com.docraptor.DocApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.docraptor.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        DocApi apiInstance = new DocApi(defaultClient);
        String id = "id_example"; // String | The status_id returned when creating an asynchronous document.
        try {
            DocStatus result = apiInstance.getAsyncDocStatus(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocApi#getAsyncDocStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The status_id returned when creating an asynchronous document. | |

### Return type

[**DocStatus**](DocStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml, application/pdf, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Server Error |  -  |

